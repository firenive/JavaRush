package level14.localDate;

import java.time.LocalDate;

public class Forty {

    public static void main(String[] args) {
        LocalDate jubilee40Years = LocalDate.of(-2010, 3, 13);

        LocalDate jubilee30Years = jubilee40Years.minusYears(10);
        System.out.println(Math.abs(jubilee30Years.getYear()));
    }
}
