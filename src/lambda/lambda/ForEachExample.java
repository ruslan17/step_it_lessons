package lambda.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ForEachExample {

    /**
     * collect (toList ()) - энергичная операция, порождающая список из значений
     * в объекте Stream.
     */
    public static void collectExample() {
        List<String> collected = Stream.of("a", "b", "с")
                .collect(toList());
    }

    /**
     * Если имеется функция, которая преобразует значение из одного типа в другой,
     * то метод map позволит применить ее к потоку значений и тем самым породить
     * поток новых значений.
     */
    public static void beforeMap() {
        List<String> collected = new ArrayList<>();
        for (String string : Arrays.asList("a", "b", "hello")) {
            String uppercaseString = string.toUpperCase();
            collected.add(uppercaseString);
        }

        System.out.println(collected);
    }

    public static void mapExample() {
        List<String> collected = Stream.of("a", "Ь", "hello")
                .map(string -> string.toUpperCase())
                .collect(toList());
    }

    public static void min() {
        List<Track> tracks = Arrays.asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378));

        Track shortestTrack = tracks.stream()
                .min(Comparator.comparing(track -> track.getLength()))
                .get();
    }

    public static void flatMapExample() {
        List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(toList());
    }

    public static void beforeReduce() {
        int acc = 0;
        for (Integer element : Arrays.asList(1, 2, 3)) {
            acc = acc + element;
        }
        System.out.println(acc);
    }

    public static void methodLinks() {

        List<Integer> list = Arrays.asList(1, 2, 5);
//        (name, nationality) -> new Track(name, nationality);

//        Track::new;
    }

    public static void reduceExample() {
        int sum = Stream.of(1, 2, 3)
                .reduce(0, (acc, element) -> acc + element);
        System.out.println(sum);
    }

    public static void main(String[] args) {
//        beforeMap();

        reduceExample();
    }

}
