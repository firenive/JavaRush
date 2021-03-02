package level11.nextMonth;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        //напишите тут ваш код
        Month current = month;
        Month[] months = Month.values();

        if (current.ordinal() == months.length - 1) return months[0];

        return Month.values()[current.ordinal() + 1];
    }
}
