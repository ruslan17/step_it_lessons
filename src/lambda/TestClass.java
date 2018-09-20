package lambda;

import java.util.Arrays;
import java.util.List;

public class TestClass {

    private FunctionalInterfaceExample functionalInterfaceExample;

    void testLambda(FunctionalInterfaceExample example) {
        functionalInterfaceExample.test();
    }

    public static void main(String[] args) {
        List<String> stringCollection = Arrays.asList("A", "r", "d");
        boolean anyStartsWithA =
                stringCollection
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));

        System.out.println(anyStartsWithA);

        long startsWithB =
                stringCollection
                        .stream()
                        .filter((s) -> s.startsWith("b"))
                        .count();

        stringCollection
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
    }

}
