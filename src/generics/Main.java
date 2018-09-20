package generics;

public class Main {

    public static void main(String[] args) {

        Pair<Employee> employee = new Pair<>();
        Pair.print1(employee);

        Pair<Manager> manager = new Pair<>();
        Pair.print2(manager);
        Pair.print2(employee);

        Pair.print3(manager);
        Pair.print3(employee);

        Pair.print4(manager);
        Pair.print4(employee);

    }

}
