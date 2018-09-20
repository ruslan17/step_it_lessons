package collections;

import java.util.*;


public class SetExamples {

    public static void main(String[] args) {
        hashSetExample();
        treeSetExample();
    }

    public static void hashSetExample() {
        HashSet<Integer> set;

        List<Integer> list = Arrays.asList(1, 2, 2, 4);
        set = new HashSet<>(list);

        System.out.println(set);
    }

    /**
     * Класс TreeSet реализует древовидное множество, подобное хеш-множеству, но
     * с одним дополнительным усовершенствованием: древовидное множество представляет
     * собой отсортированную коллекцию. В такую коллекцию можно вводить элементы
     * в любом порядке. Когда же выполняется перебор ее элементов, извлекаемые из нее
     * значения оказываются автоматически отсортированными. Допустим, в такую коллекцию
     * сначала введены три символьные строки, а затем перебраны все введенные в нее
     * элементы:
     * <p>
     * Чтобы пользоваться древовидным множеством, необходимо иметь возможность
     * сравнивать его элементы. Для этого элементы должны относиться к классу, реализующему интерфейс
     * Comparable, а иначе придется предоставить объект типа Comparator при
     * построении множества
     */
    public static void treeSetExample() {
        Set<String> sorter = new TreeSet<>();
        sorter.add("Bob");
        sorter.add("Amy");
        sorter.add("Carl");
        for (String s : sorter) {
            System.out.println(s);
        }
    }

}
