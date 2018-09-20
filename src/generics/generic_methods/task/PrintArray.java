package generics.generic_methods.task;


import generics.generic_type_constraints.task.Pair;

public class PrintArray {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        Integer[] array = {5, 2, 6};

        printArray(array);

        printArray(new String[] {"asd", "sdsd"});

        printArray(new Pair[] {new Pair(1, 2), new Pair(2, 7)});
    }

}
