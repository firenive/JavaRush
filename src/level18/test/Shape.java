package level18.test;

public interface Shape extends  Drawable {

    void drawLine();
    void drawPoint(int x, int y);
    default void print() {
        System.out.println("Информация");
    }
}
