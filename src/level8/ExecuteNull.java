package level8;

import java.util.Arrays;

public class ExecuteNull {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null  ) {
                for (int x = i + 1; x < array.length; x++) {
                    if (array[x] != null) {
                        array[i] = array[x];
                        array[x] = null;
                        break;
                    }
                }
            }
        }

    }
}
