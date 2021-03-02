package level8;

public class Building {
    private String type;



    //напишите тут ваш код

    public static void main(String[] args) {
        var building = new Building();
        building.initialize("Барбершоп");
    }
    public void initialize (String type) {
        this.type = type;
    }
}
