package any.hashequals;

public class DemoBlackBox {
    public static void main(String[] args) {
        BlackBox box1 = new BlackBox(5, 10);
        BlackBox box2 = new BlackBox(5, 10);
        boolean hash = box1.hashCode() == box2.hashCode();

        System.out.println(box1.equals(box2)); // false
        System.out.println(hash); // false


        BlackBox box3 = box2;
        hash = box2.hashCode() == box3.hashCode();

        System.out.println(box2.equals(box3)); // true
        System.out.println(hash); // true
    }
}
