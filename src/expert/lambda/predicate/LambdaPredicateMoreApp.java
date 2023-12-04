package expert.lambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaPredicateMoreApp {

    public static void main(String[] args) {
        examineNumber(15, number -> number > 7);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> oddNumbers = numbers.stream()
                .filter(number -> number % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);
    }

    private static void examineNumber(int number, Predicate<Integer> examination) {
        if (examination.test(number)) {
            System.out.println("The result of the examination of " + number + " is true.");
        }
    }

}
