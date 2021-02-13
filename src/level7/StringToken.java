package level7;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String packagePath = "com.javarush.task.pro.task09.task0915";
        String[] tokens = getTokens(packagePath, ".a");
        System.out.println(Arrays.toString(tokens));
    }
    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            result[i++] = stringTokenizer.nextToken();
        }
        return result;


       /* String[] result = new String[query.length()];

        int i = 0;
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            result[i] = token;
            i++;
        }
        int index = 0;
        for (int x = 0; x < result.length; x++) {
            if (result[i] == null) {
                index = i;
                break;
            }
        }
        String[] result2 = new String[index];
        for (int z = 0; z <result2.length; z++)
            result2[z] = result[z];
        return result2; */
    }
}
