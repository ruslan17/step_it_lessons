package inheritance;

public class Main {

    public static void main(String[] args) {

//        exampleOne();

        exampleTwo();

    }

    public static void exampleOne() {
        Employee employee = new Employee("John", 500);

        Manager manager = new Manager("Robb", 1000);
        manager.setBonus(500);

        Manager manager1 = new Manager("", 1000, 500);

        System.out.println(manager1.getSalary());

        System.out.println(manager1);
        
    }

    public static void exampleTwo() {

        Employee[] employees = new Employee[5];

        Employee employee = new Employee("John", 500);

        Manager manager = new Manager("Robb", 1000);
        manager.setBonus(500);

        employees[0] = employee;
        employees[1] = manager;

        for (Employee e :employees) {
            System.out.println(e);
        }

        if (employees[0] instanceof Manager) {
            Manager boss = (Manager) employees[0];
            System.out.println(boss);
        }

        Employee employee1 = employees[1];


        System.out.println(employee1);
        System.out.println(employee1.getClass());

    }

}
