package level16.product;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.Stream;

public class ExpiredProduct {

    public static void main(String[] args) {
        var productStream = Stream.of(
                //new Product("Milk", LocalDate.of(2020, Month.MARCH, 12)),
                // new Product("Cheese", LocalDate.of(2020, Month.MARCH, 31)),
                // new Product("Buckwheat", LocalDate.of(2021, Month.MARCH, 1)),
                new Product("Rice", LocalDate.of(2022, Month.MAY, 11)),
                new Product("Wine", LocalDate.of(2023, Month.JANUARY, 10)),
                new Product("Tea", LocalDate.of(2024, Month.AUGUST, 27)),
                new Product("Salt", LocalDate.of(2025, Month.DECEMBER, 15))
        );
        String answer = hasExpiredProduct(productStream) ? "Yes" : "No";
        System.out.println("Has stream expired products? " + answer);
    }

    public static boolean hasExpiredProduct(Stream<Product> productStream) {
        return productStream.anyMatch(o1 -> o1.getExpirationDate().isBefore(LocalDate.now()));

    }
}
