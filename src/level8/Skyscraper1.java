package level8;

public class Skyscraper1 {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    //напишите тут ваш код
    public Skyscraper1() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }
    public Skyscraper1(int floor) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floor);
    }
    public Skyscraper1(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }

    public static void main(String[] args) {
        var skyscraper = new Skyscraper1();
        var skyscraperTower = new Skyscraper1(50);
        var skyscraperSkyline = new Skyscraper1("JavaRushDevelopment");
    }
}
