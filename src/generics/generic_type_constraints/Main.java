package generics.generic_type_constraints;

public class Main {

//
//    Не сработает, если не реализуется Comparable
    public static <T extends Comparable> T min(T[] array) {

        if (array == null || array.length == 0) {
            return null;
        }

        T smallest = array[0];

        for (int i = 1; i < array.length; i++)
            if (smallest.compareTo(array[i]) > 0) {
                smallest = array[i];
            }

        return smallest;
    }

    public static void main(String[] args) {

        String[] names = {"John", "Deni", "Mark", "Dan"};
        Integer[] ages = {1, 25, 47, 65};

        String minName = min(names);
        Integer minAge = min(ages);

        System.out.println(minName);
        System.out.println(minAge);
    }

}
