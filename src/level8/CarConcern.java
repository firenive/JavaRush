package level8;

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
        //напишите тут ваш код
    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Оранжевый";
        //напишите тут ваш код
    }

    public CarConcern(String model) {
        //напишите тут ваш код
        this.model = model;
        this.year = 4321;
        this.color = "Оранжевый";
    }
}
