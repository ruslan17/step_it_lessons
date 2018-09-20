package collections.maps;

import java.util.*;

/**
 * Класс HashMap по функционалу очень похож на Hashtable. Главное отличие в том, что методы класса Hashtable синхронизированы, а HashMap - нет.
 * Кроме этого класс HashMap в отличии от Hashtable разрешает использование null в качестве ключей и значений.
 * <p>
 * <p>
 * Если вы посмотрите на результат, то увидите, что данные находятся не в том порядке, в котором вы заносили.
 * Второй важный момент - если в карточке уже существует какой-то ключ,
 * то если вы помещаете в него новое значение, то ключ перезаписывается, а не заносится новый ключ.
 */
public class MapExample {

    enum Weekday
    { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "John");
        hashMap.put(2, "John");

        hashMap.putIfAbsent(1, "Johny");

        String s = hashMap.get(3);
        String s1 = hashMap.getOrDefault(3, "ОШИБКА");
        System.out.println(s1);
        System.out.println(s);
        System.out.println("****************");

        /**
         * Имеются три таких представления: множество ключей, коллекция (не множество)
         значений и множество пар "ключ-значение". Ключи и пары "ключ-значение" образуют
         множество, потому что в отображении может присутствовать только по одной
         копии каждого ключа. Приведенные ниже методы возвращают эти три представления.
         (Элементы последнего множества являются объектами статического внутреннего
         класса Map.Entry.)
         */
        Set<Integer> keySet = hashMap.keySet();

        for(Map.Entry<Integer, String> entry: hashMap.entrySet()) {

        }
        System.out.println("****************");

        System.out.println(hashMap);

        System.out.println(hashMap.get(1));
        // Содержится ли
        System.out.println(hashMap.containsKey(2));

//        treeExample();

        arraysExample();

    }

    public static void treeExample() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "John1");
        treeMap.put(3, "John3");
        treeMap.put(2, "John2");

        System.out.println(treeMap);
    }

    public static void enumSetExample() {

        EnumSet<Weekday> always = EnumSet.allOf(Weekday.class) ;
        EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);
        EnumSet<Weekday> workday =
                EnumSet.range(Weekday.MONDAY, Weekday.FRIDAY);
        EnumSet<Weekday> mwf =
                EnumSet.of(Weekday.MONDAY, Weekday.WEDNESDAY, Weekday.FRIDAY);
    }

    public static void enumMapExample() {
        EnumMap<Weekday, Integer> personlnCharge = new EnumMap<>(Weekday.class);
    }

    public static void arraysExample() {
        Integer[] array = new Integer[5];

        List<Integer> list = Arrays.asList(array);
        list.set(1, 10);
//        list.add(5);
        System.out.println(list);

        List<Integer> list1 = Arrays.asList(1, 2, 7);
        list1.add(11);
        System.out.println(list1);
    }

}
