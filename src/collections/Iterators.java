package collections;

import java.util.*;


public class Iterators {

    /**
     * Многократно вызывая метод next (), можно обратиться к каждому элементу коллекции
     * по очереди. Но если будет достигнут конец коллекции, то метод next () сгенерирует
     * исключение типа NoSuchElementException. Поэтому перед вызовом метода
     * next () следует вызывать метод hasNext (). Этот метод возвращает логическое
     * значение true, если у объекта итератора все еще имеются объекты, к которым можно
     * обратиться. Если же требуется перебрать все элементы коллекции, то следует запросить
     * итератор, продолжая вызывать метод next () до тех пор, пока метод hasNext ()
     * возвращает логическое значение true.
     */
    public static void iteratorExample() {

        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }

    public static void iteratorRemove() {
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        Iterator<String> iterator = collection.iterator();
        iterator.next();
        iterator.remove();

        System.out.println(collection);
    }

    /**
     * Чтобы избежать исключений в связи с попытками одновременной
     * модификации, достаточно придерживаться следующего простого правила: к коллекции
     * допускается присоединять сколько угодно итераторов, при условии, что все они
     * служат только для чтения, но присоединить только один итератор, который служит
     * как для чтения, так и для записи.
     */
    public static void iteratorExceptions() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("A");
        ListIterator<String> iterator1 = list.listIterator();
        ListIterator<String> iterator2 = list.listIterator();
        iterator1.next();
        iterator1.remove();
        iterator2.next();

    }

    /**
     * Компилятор просто преобразует цикл в стиле for each в цикл с итератором.
     * Цикл в стиле for each подходит для любых объектов, класс которых реализует интерфейс
     * Iterable
     * Интерфейс Collection расширяет интерфейс Iterable. Поэтому цикл в стиле
     * for each подходит для обращения к элементам любой коллекции из стандартной
     * библиотеки.
     */
    public static void iterableExample() {
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        for (String element : collection) {
            System.out.println(element);
        }
    }

    /**
     * Пример со сканером
     */
    public static void scannerExample() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            if (Objects.equals(scanner.next(), "404")) {
                break;
            }
            System.out.println(scanner.next());
        }
    }

    public static void main(String[] args) {
//        iteratorRemove();

//        iteratorExceptions();
    }

}