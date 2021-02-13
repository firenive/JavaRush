package level7;

public class ChangePath {
    public static void main(String[] args) {
        String path = "/usr/java/jdk-8/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        // int lastIndex = path.lastIndexOf("/");
        //int firstIndex = path.lastIndexOf("/", lastIndex -2);
        // path= path.substring(0, firstIndex +1) + jdk + path.substring(lastIndex);
        int firstIndex = path.indexOf("/");
        firstIndex = path.indexOf("/", firstIndex +1);
        firstIndex = path.indexOf("/", firstIndex +1);
        int lastIndex = path.indexOf("/", firstIndex +1);
        String oldPath = path.substring(firstIndex +1, lastIndex);

        // path = path.replace(path.substring(firstIndex + 1, lastIndex), jdk);
        return path.replace(oldPath, jdk);
    }
}
