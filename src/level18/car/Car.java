package level18.car;

public class Car {
    public static int carCounter = 10;

    private String description = "Начальное значение поля description";

    public Car() {
        System.out.println("Car" + " " + carCounter);
        System.out.println(getDescription());
        description = "Абстрактная машина";
        System.out.println(getDescription());
    }

    public String getDescription() {
        return description;
    }
}

class Truck extends Car {

    private static int truckCounter = 5;

    private int yearOfManufacture;
    private String model;
    private int maxSpeed;

    public Truck(int yearOfManufacture, String model, int maxSpeed) {
        System.out.println(this.getClass().getSimpleName() + " " + carCounter);
        System.out.println(this.getClass().getSimpleName() + " " + truckCounter);
        this.yearOfManufacture = yearOfManufacture;
        this.model = model;
        this.maxSpeed = maxSpeed;

        Car.carCounter++;
        truckCounter++;
    }
}
