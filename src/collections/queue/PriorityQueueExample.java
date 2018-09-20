package collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void simpleExample() {
        Queue<Integer> integerPriorityQueue = new PriorityQueue<>();
        integerPriorityQueue.add(5);
        integerPriorityQueue.add(7);
        integerPriorityQueue.add(1);
        integerPriorityQueue.add(10);

        System.out.println(integerPriorityQueue);

        integerPriorityQueue.remove();

        System.out.println(integerPriorityQueue);

        integerPriorityQueue.poll();

        System.out.println(integerPriorityQueue);

        integerPriorityQueue.peek();

        System.out.println(integerPriorityQueue);
    }


    public static void main(String[] args) {
        simpleExample();

        Queue<User> customerPriorityQueue = new PriorityQueue<>(Comparator.comparingInt(User::getId));

    }

}
