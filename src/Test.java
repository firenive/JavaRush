import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {


    public static void main(String[] args) throws IOException {
        // D:\java\result.txt
//       Иванов Иван Иванович 31 12 1950
//     Петров Петр Петрович 31 12 1957
        String line = "Петров 2435.16";
        String name = line.substring(0, line.lastIndexOf(" "));
        Double value = Double.parseDouble(line.substring(line.lastIndexOf(" ") + 1));
        System.out.println(name);
        System.out.println(value);






    }


}
