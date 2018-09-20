package interfaces.humans;

import interfaces.interf.B;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Gun gun = new Gun(45, "Glock");

        Guard guard = new Guard("John", 25, 1500, gun);

//        System.out.println(guard.getGun().getCaliber());

//        B b = (a, b1) -> a + b1;

        B b = new B() {
            @Override
            public int create(int a, int b) {
                return a + b;
            }
        };

        Employee employee = new Employee("asd", 27, 555);
        Student student = new Student("asd", 17, 555);

        System.out.println(employee.compareTo(student));

        StudentComparator comparator = new StudentComparator();

        System.out.println(comparator.compare(student, new Student("asdas", 25, 666)));
        System.out.println(new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return employee.getSalary() - t1.getSalary();
            }
        });

        Employee [] employees = new Employee[5];
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return 0;
            }
        });

    }
}
