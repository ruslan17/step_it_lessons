package lambda.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static void before() {
        List<String> lines = Arrays.asList("Lol", "Kek", "Cheburek");

        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"Cheburek".equals(line)) {
                result.add(line);
            }
        }

        for (String temp : result) {
            System.out.println(temp);
        }
    }

    public static void after() {
        List<String> lines = Arrays.asList("Lol", "Kek", "Cheburek");

        List<String> result = lines.stream()
                .filter(line -> ! "Cheburek".equals(line))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

    public static void main(String[] args) {
        before();
    }


}
