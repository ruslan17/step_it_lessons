package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
     task2();
    }

    public static void task1() {
        System.out.println("1. Получить сумму всех нечётных чисел из списка.");
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list1.add(i);
        }

        Integer sum1 = list1.stream().filter(letter -> letter % 2 != 0).mapToInt(i -> i).sum();
        Integer sum2 = list1.stream().filter(letter -> letter % 2 != 0).mapToInt(Integer::intValue).sum();
        Integer sum3 = list1.stream().filter(o -> o % 2 != 0).reduce((s1, s2) -> s1 + s2).orElse(0);
        System.out.println(sum1);
    }


    public static void task2() {
        System.out.println("2. Получить из листа стрингов лист Integer-ов.");
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("1");
        listOfStrings.add("10");
        listOfStrings.add("11");
        System.out.println("List of Strings= " + listOfStrings);
        List<Integer> listOfIntegers = listOfStrings.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println("List of Integers= " + listOfIntegers);
        System.out.println("**********************************************");

        System.out.println("3. Вывести все элементы листа умноженные на 2.");
        List<Integer> listOfIntegersX2 = listOfIntegers.stream()
                .map(letter -> letter * 2)
                .collect(Collectors.toList());
        System.out.println("List of given Integers                 = " + listOfIntegers);
        System.out.println("List of given Integers, multiplied by 2= " + listOfIntegersX2);

    }

}
