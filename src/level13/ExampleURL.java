package level13;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ExampleURL {
    public static void main(String[] args) throws IOException {
        OutputStream output = null;
        PrintStream sender = null;
        InputStream input = null;
        BufferedReader reader = null;

        try {
            URL url = new URL("https://javarush.ru"); // Создаем объект URL с путем к странице
            URLConnection connection = url.openConnection(); // Создаем двустороннее соединение

            // отправляем данные
            output = connection.getOutputStream();
            sender = new PrintStream(output);
            sender.println("Hello");

            //читаем данные
            input = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(input));
            while (reader.ready()) System.out.println(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert output != null;
            output.close();
            assert false;
            sender.close();
            input.close();
            reader.close();
        }
    }
}
