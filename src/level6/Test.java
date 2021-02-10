package level6;

public class Test {


    public static void main(String[] args) {
//        System.out.println(text);

        int a = 3;
        int b;
        b = ++a + (a-- * ++a);


        System.out.println(b);

        System.out.println(evaluate());


    }

    public static int evaluate() {
        int x = 0;

        int y = x++ + (--x * x++);
        return y;
    }
}
//  int x = 10;
//        int y =15;
//        int temp = 0 ^ x;
//        int temp2 = x;
//
//        y ^= temp;
//
//        System.out.println(temp);
//        System.out.println(x);
//        System.out.println(y);