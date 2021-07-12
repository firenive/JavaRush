package level18.linked;

public class DoubleLinkedList {

    private Node head;
    private Node last;

    public DoubleLinkedList() {
        head = null;
        last = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String data) {
        Node temp = new Node(data);

        if (isEmpty()) {
            last = temp;
        } else {
            head.prev = temp;
        }
        temp.next = head;
        head = temp;
    }

    public void addLast(String data) {
        Node temp = new Node(data);
        if (isEmpty()) {
               head = temp;
        } else
            last.next = temp;
        temp.prev = last;
        last = temp;
    }


    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            // this(null, data, null);
            this.data = data;
        }

        Node(Node prev, String data, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
