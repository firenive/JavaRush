package arrays;

public class ArrayPrint3D {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int i = 0; i <multiArray.length; i++) {
            for (int x = 0; x <multiArray[i].length; x++) {

                for (int z = 0; z <multiArray[i][x].length; z++) {
                    System.out.print(multiArray[i][x][z] + " ");
                }
            }
        }
    }
}
