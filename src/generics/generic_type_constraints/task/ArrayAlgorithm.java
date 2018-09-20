package generics.generic_type_constraints.task;


import java.time.LocalDate;

/**
 * Обозначение <T extends ограничивающий_тип>
 * означает, что тип T должен быть подтипом ограничивающего типа, причем к типу T
 * и ограничивающему типу может относиться как интерфейс, так и класс. Ключевое
 * слово extends выбрано потому, что это вполне благоразумное приближение понятия
 * подтипа, и создатели Java не сочли нужным вместо этого вводить в язык новое
 * ключевое слово
 * <p>
 * Переменная типа или подстановка может иметь несколько ограничений, как показано
 * в приведенном ниже примере кода. Ограничивающие типы разделяются знаком
 * &, потому что запятые служат для разделения переменных типа.
 * T extends Comparable & Serializable
 * <p>
 * Как и в механизме наследования в Java, у интерфейсов может быть сколько угодно
 * супертипов, но только один из ограничивающих типов может быть классом. Если
 * для ограничения служит класс, он должен быть первым в списке накладываемых
 * ограничений.
 */

public class ArrayAlgorithm {

//    Не сработает, если не реализуется Comparable
//    Пример с Pair
    public static <T extends Comparable> Pair<T> minmax(T[] array) {

        if (array == null || array.length == 0) {
            return null;
        }

        T min = array[0];
        T max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min.compareTo(array[i]) > 0) {
                min = array[i];
            }
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }

        return new Pair<>(min, max);
    }

    public static void main(String[] args) {

        LocalDate[] birthdays = {
                LocalDate.of(1995, 12, 31),
                LocalDate.of(1996, 12, 31),
                LocalDate.of(1997, 12, 31),
                LocalDate.of(1998, 12, 31)
        };

        Pair<LocalDate> minAndMaxBirthdays = ArrayAlgorithm.minmax(birthdays);

        System.out.println(minAndMaxBirthdays.getFirst());
        System.out.println(minAndMaxBirthdays.getSecond());

        Integer[] array = {-5, -8, 12, 4};

        Pair<Integer> mm = minmax(array);

        System.out.println(mm);
    }

}
