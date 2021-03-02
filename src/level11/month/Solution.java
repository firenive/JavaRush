package level11.month;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Month march = Month.MARCH;
        System.out.println(Month.APRIL);
        Month[] values = Month.values();
        System.out.println(Arrays.toString(values));
        System.out.println(Month.JANUARY.ordinal());
    }
}
