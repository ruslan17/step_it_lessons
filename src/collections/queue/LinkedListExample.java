package collections.queue;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(7);

        list.remove();

        list.removeFirstOccurrence(7);

        list.add(11);

        list.addFirst(88);

        Integer integer = list.get(2);

        System.out.println(integer);


        System.out.println(list);
    }

}
