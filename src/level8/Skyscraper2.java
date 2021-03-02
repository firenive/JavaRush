package level8;

public class Skyscraper2 {
    private int floorsCount;
    private String developer;

    //напишите тут ваш код
    public Skyscraper2() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }
    public Skyscraper2(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        var skyscraper = new Skyscraper2();
        var skyscraperUnknown = new Skyscraper2(50, "Неизвестно");
    }
}
