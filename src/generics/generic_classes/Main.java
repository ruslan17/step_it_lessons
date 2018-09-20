package generics.generic_classes;

public class Main {

//    Нельзя создавать массивы

    public void doNotDoIt() {
//          Так делать не надо

        GenericEmployee employee = new GenericEmployee(1, 750, 25);
        GenericEmployee employee1 = new GenericEmployee(1, 750, "25 лет");

//          Ошибка
        int age = (int) employee1.getAge();

        System.out.println(age);

    }

    public void doNotDoItX2() {
//          Так делать не надо х2
        GenericEmployee<Integer, String> employee = new GenericEmployee(1, 750, 25);

//          Ошибка
        String age = employee.getAge();
        System.out.println(age);

//          Тоже ошибка
        int age2 = Integer.parseInt(employee.getAge());

        System.out.println(age2);

    }

    public void doIt() {
        GenericEmployee<Integer, String> employee = new GenericEmployee<>(1, 750, "25 лет");

//        Всё ОК
        String age = employee.getAge();

        System.out.println(age);

    }

    public static void main(String[] args) {
        Main main = new Main();
//        main.doNotDoIt();
//        main.doNotDoItX2();
//        main.doIt();


    }

}
