package level16;

import java.util.stream.Stream;

public class AnalyzeInteger {

    public static void main(String[] args) {
        String answerYes = "Yes";
        String answerNo = "No";

        Stream<Integer> stream1 = Stream.of(10, -21, 3, 12, -85, 0, 142);

        String answerNegativeEvenNumbers = hasNegativeEvenNumbers(stream1) ? answerYes : answerNo;
        System.out.println("Has stream negative even numbers? " + answerNegativeEvenNumbers);

        Stream<Integer> stream2 = Stream.of(10, 22, -3, 12, 85, 142);

        String answerOnlyPositiveNumbers = hasOnlyPositiveNumbers(stream2) ? answerYes : answerNo;
        System.out.println("Has stream only positive numbers? " + answerOnlyPositiveNumbers);

        Stream<Integer> stream3 = Stream.of(-10, -22, 3, -12, -85, -142);

        String answerOnlyNegativeNumbers = hasOnlyNegativeNumbers(stream3) ? answerYes : answerNo;
        System.out.println("Has stream only negative numbers? " + answerOnlyNegativeNumbers);
    }

    public static boolean hasNegativeEvenNumbers(Stream<Integer> stream) {
        return stream.anyMatch(x -> x % 2 == 0 && x < 0);
    }

    public static boolean hasOnlyPositiveNumbers(Stream<Integer> stream) {
        return stream.allMatch(x -> x > 0);
    }

    public static boolean hasOnlyNegativeNumbers(Stream<Integer> stream) {
        return  stream.noneMatch(x -> x > 0);
    }
}