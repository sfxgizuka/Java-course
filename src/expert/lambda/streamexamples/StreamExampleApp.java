package expert.lambda.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamExampleApp {

    public static void main(String[] args) {
        List<Integer> inputNumbers = Arrays.asList(1,2,3,4,5);

        List<Integer> outputNumbers = inputNumbers
                .stream()
                .map(number -> number * number)
                .filter(number -> number > 3)
                .collect(Collectors.toList());

        System.out.println(outputNumbers);
    }
}
