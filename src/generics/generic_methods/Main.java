package generics.generic_methods;

public class Main {

//    Передаём любое количество аргументов, возвращает среднее значение
    public static <T> T getMiddle(T... args) {
        System.out.println(args[args.length/2]);

        return args[args.length/2];
    }

    public static void main(String[] args) {

        getMiddle(1, 2, 25, 7, 15);

        getMiddle("A", "K", "F");

    }

}
