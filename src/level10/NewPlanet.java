package level10;

import java.util.ArrayList;

public class NewPlanet {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Звезда Смерти");
        print();
    }

    public static void createNewPlanet(String planetName) {
        //напишите тут ваш код
        planets.add(planets.get(3));
        planets.set(3 , planetName);
        String temp;

        for (int i = 4; i < planets.size(); i++) {
            temp = planets.get(i);
            planets.set(i, planets.get(planets.size() -1));
            planets.set(planets.size() -1, temp);
        }

    }

    public static void addPlanets() {
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%s — %d-я планета от Солнца", planets.get(i), (i + 1)));
        }
        System.out.println();
    }
}
