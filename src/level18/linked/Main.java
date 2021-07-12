package level18.linked;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

//        list.addFirst("1");
//        list.addFirst("2");
//        list.addFirst("3");
//        list.addFirst("4");

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");

        list.print();
    }
}
