package level13;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class InfoFromAPI2 {

    // 	Программа должна выводить полученную информацию на экран.
    //•	В программе должен вызываться метод openConnection() класса URL.
    //•	В программе должны вызываться методы setDoOutput(true), getOutputStream() и getInputStream() класса URLConnection.
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");

        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        OutputStream output = connection.getOutputStream();

        InputStream input = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        while (reader.ready()) System.out.println(reader.readLine());

    }
}
