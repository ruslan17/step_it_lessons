package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1. Ёмкость и размер ни одно и тоже
 */
public class ArrayListT {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        /**
         * Можно указать начальную ёмкость при инициализации или с помощью ensureCapacity
         */
        list.ensureCapacity(10);

        /**
         * Проверка не пустой ли список
         */
        boolean empty = list.isEmpty();
        System.out.println(empty);
        System.out.println("**********");

        /**
         * Добавление
         */
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list);
        System.out.println("**********");

        /**
         * Добавление коллекции на определенное место
         */
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list.addAll(0, list1);

        System.out.println(list);
        System.out.println("**********");

        /**
         * Удаление по индексу
         */
        list.remove(0);
        System.out.println(list);
        System.out.println("**********");

        /**
         * Удаление по значению: будет удалён только первый найденный элемент
         */
        list.remove(Integer.valueOf(8));

        System.out.println(list.size());
        System.out.println("**********");

        /**
         * Используем trimToSize для предотвращения утечек памяти
         */
        list.trimToSize();

        /**
         * Добавление в середину массива
         */
        list.add(2, 10);
        System.out.println(list);
        System.out.println("**********");

        /**
         * Нахождение по индексу
         * Возвращает позицию первого вхождения искомого элемента в списке или значение -1 , если искомый
         * элемент не найден
         */
        int first = list.indexOf(3);
        System.out.println(first);
        System.out.println("**********");

        /**
         * Нахождение по индексу
         * Возвращает позицию последнего вхождения искомого элемента в списке или значение -1 , если
         * искомый элемент не найден.
         */
        int last = list.lastIndexOf(3);
        System.out.println(last);
        System.out.println("**********");

        /**
         * Максимальное значение в коллекции
         */
        Integer max = Collections.max(list);
        System.out.println(max);
    }

}
