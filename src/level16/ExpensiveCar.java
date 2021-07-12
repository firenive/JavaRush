package level16;

import java.util.Optional;
import java.util.stream.Stream;

public class ExpensiveCar {

    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car("Model S", 94_490),
                new Car("Model 3", 50_690),
                new Car("Model X", 99_690),
                new Car("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car("X5", 110_000),
                new Car("X3", 54_000),
                new Car("X7", 143_000),
                new Car("X6", 125_000)
        );

        Optional<Car> mostExpensiveCar = getMostExpensiveCar(tesla);
        mostExpensiveCar.ifPresent(System.out::println);

        Optional<Car> moreExpensiveCar = mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car));
        moreExpensiveCar.ifPresent(System.out::println);
    }

    public static Optional<Car> getMostExpensiveCar(Stream<Car> cars) {
       //  return cars.max((s1, s2) -> s1.getPrice() - s2.getPrice());
        return cars.min((s1, s2) -> s1.getPrice() - s2.getPrice());
    }

    public static Optional<Car> getMoreExpensiveCar(Stream<Car> cars , /*Car mostExpensive */ Car cheapestCar) {
//        cars = cars.sorted((car1, car2) -> car2.getPrice() - car1.getPrice());
//        return cars.findFirst();
        // return cars.filter(s1 -> s1.getPrice() > mostExpensive.getPrice()).findFirst();
        return cars.filter(s1 -> s1.getPrice() < cheapestCar.getPrice()).findFirst();
    }
}

class Car {
    private String name;
    private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name + ", цена - " + price + " USD";
    }
}
