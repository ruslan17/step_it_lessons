package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericCollectionMethods {

    /**
     * Обобщенный метод для проверки наличия элемента в коллекции
     */
    public static <E, T> boolean contains(Collection<E> c, T obj) {
        for (E element : c) {
            if (element.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 55);

        boolean contains = contains(list, 5);
        System.out.println(contains);

    }

}
