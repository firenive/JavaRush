package level11;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] winterMonths = new Month[3];
        Month[] months = Month.values();
        int count = 0;
        for (Month month : months) {
            if (month.ordinal() == 0 || month.ordinal() == 1 || month.ordinal() == 11) {
                winterMonths[count] = month;
                count++;
            }
        }
        return winterMonths;
    }

    public static Month[] getSpringMonths() {
        Month[] springMonths = new Month[3];
        Month[] months = Month.values();

       for (int i = 2, j = 0; i <= 4; i++ , j++ ) {
           springMonths[j] = months[i];
       }
       return springMonths;
    }

    public static Month[] getSummerMonths() {
        Month[] summerMonths = new Month[3];
        Month[] months = Month.values();

        for (int i = 5, j = 0; i <= 7; i++ , j++ ) {
            summerMonths[j] = months[i];
        }
        return summerMonths;
    }
    public static Month[] getAutumnMonths() {
        Month[] autumnMonths = new Month[3];
        Month[] months = Month.values();

        for (int i = 8, j = 0; i <= 10; i++, j++) {
            autumnMonths[j] = months[i];
        }
        return autumnMonths;
    }
}
