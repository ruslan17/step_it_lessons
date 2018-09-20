package solid.s;//Принцип единственной ответственности (The Single Responsibility Principle)
//        Каждый класс, выполняет лишь одну задачу.

//public class Employee {
//
//    int getSalary() {
//        return 0;
//    }
//
//    void cook() {}
//      void clean() {}
//
//    void geliverFood() {}
//
//}

public interface Employee {

    int getSalary();

}

class Cook implements Employee {
    void cook() {}

    @Override
    public int getSalary() {
        return 10;
    }
}

class Cleaner implements Employee {
    void clean() {}

    @Override
    public int getSalary() {
        return 40;
    }
}

class EmployeeFacade {
    private Cook cook = new Cook();
    private Cleaner cleaner = new Cleaner();

    void cook() {
        cook.cook();
    }

    void clean() {
        cleaner.clean();
    }
}
