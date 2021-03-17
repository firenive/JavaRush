package level13;

import java.nio.file.Path;
import java.util.Scanner;

public class RelativePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        // C:\Program Files (x86)\Epic Games\Launcher\Portal\SysFiles\2KGMKT_BL3_SEASONPASS_2.png
        // C:\Program Files (x86)\Epic Games\Launcher\Portal\
        //  C:\Program Files (x86)\Home Media Server\MediaInfo\MediaInfoDe.csv
        // D:\Games\Late Shift\Steam\MEX\local
        // https://javarush.ru/quests/lectures/questsyntaxpro.level15.lecture04?post=full

        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);
        try {
           Path path3 = path1.relativize(path2);
           Path path4 = path2.relativize(path3);
           if (path3.toString().matches("(..)(\\\\..)*")) System.out.println(path4);
           else System.out.println(path3);
        } catch (IllegalArgumentException e) {

        }

    }
}
