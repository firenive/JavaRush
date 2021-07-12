package rainbow;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import java.io.UnsupportedEncodingException;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class SecuritySettings {
    public static void main(String[] args) {
        String user = decrypt("IznwjVHg1QVwfmVrjwM65w==");
        System.out.println(user);
        String password = decrypt("0nKJ/28AruHLu7fZvUVbBDcRVdDvvDSnSTcz+6JAW4gBQ9tj7mawzf+faZF2gBUe");
        System.out.println(password);
    }
    private static final String algorytm = "AES";
    private static SecretKey key;
    private static Cipher ecipher;
    private static Cipher dcipher;

    public SecuritySettings() {
    }

    public static String encrypt(String str) {
        try {
            byte[] utf8 = str.getBytes("UTF8");
            byte[] enc = ecipher.doFinal(utf8);
            String s = Base64.encodeBase64String(enc);
            return s;
        } catch (Exception var4) {
            Logger.getLogger(lib_kristalit_universal.other.SecuritySettings.class.getName()).log(Level.SEVERE, (String) null, var4);
            return null;
        }
    }

    public static String decrypt(String str) {
        try {
            byte[] dec = Base64.decodeBase64(str);
            byte[] utf8 = dcipher.doFinal(dec);
            return new String(utf8, "UTF8");
        } catch (Exception var3) {
            Logger.getLogger(lib_kristalit_universal.other.SecuritySettings.class.getName()).log(Level.SEVERE, (String) null, var3);
            return null;
        }
    }

    static {
        try {
            key = new SecuritySettings.MySecretKey();
            ecipher = Cipher.getInstance("AES");
            dcipher = Cipher.getInstance("AES");
            ecipher.init(1, key);
            dcipher.init(2, key);
        } catch (Exception var1) {
            Logger.getLogger(lib_kristalit_universal.other.SecuritySettings.class.getName()).log(Level.SEVERE, (String) null, var1);
        }

    }

    private static final class MySecretKey implements SecretKey {
        private static final long serialVersionUID = -5249792370958427064L;
        private byte[] key;

        private MySecretKey() {
            this.key = new byte[16];
        }

        public String getAlgorithm() {
            return "AES";
        }

        public String getFormat() {
            return "RAW";
        }

        public byte[] getEncoded() {
            return this.key;
        }
    }
}
