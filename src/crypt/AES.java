package crypt;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class AES {
    static SecretKeySpec key = new SecretKeySpec("Bar12345Bar12345".getBytes(), "AES");

    public static void main(String[] args) {
        // D:\java\family.txt
        // D:\java\output.txt
        if (args[0].equals("-e")) encrypt(args[1], args[2]);
        else if (args[0].equals("-d")) decrypt(args[1], args[2]);
    }

    public static void encrypt(String fileName, String fileOutputName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             FileOutputStream output = new FileOutputStream(fileOutputName)) {

            Cipher cipherEncrypt = Cipher.getInstance("AES");
            cipherEncrypt.init(Cipher.ENCRYPT_MODE, key);
            String line;
            while ((line = reader.readLine()) != null) {
                byte[] cyp = cipherEncrypt.doFinal(line.getBytes());
                output.write(cyp);
            }
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
    }

    public static void decrypt(String fileName, String fileOutputName) {
        try (FileInputStream input = new FileInputStream(fileName);
             FileOutputStream output = new FileOutputStream(fileOutputName)) {

            Cipher cipherDecrypt = Cipher.getInstance("AES");
            cipherDecrypt.init(Cipher.DECRYPT_MODE, key);
            byte[] file = new byte[input.available()];
            int i = input.read(file);
            byte[] encrypted = cipherDecrypt.doFinal(file);
            output.write(encrypted);


        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
    }

}
