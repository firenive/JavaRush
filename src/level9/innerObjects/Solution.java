package level9.innerObjects;

public class Solution {

    public static void main(String... errors) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        Outer.Nested nested = new Outer.Nested();
    }
}
