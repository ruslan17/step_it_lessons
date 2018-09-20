package solid.o;

/**
 * O
 Принцип открытости/закрытости (The Open Closed Principle)
 «программные сущности … должны быть открыты для расширения, но закрыты для модификации.»
 */

public class Main {

    public static void main(String[] args) {
        Audi audi = new Audi();
        R8 r8 = new R8();
        Employee employee = new Employee();
//        employee.workInTaxi(audi);
        employee.workInTaxi(r8);


    }

}

class Employee {
//    public void workInTaxi(Audi audi) {
//        audi.getPassengers();
//    }

//    public void workInTaxi(Audi audi) {
//        if (audi instanceof R8) {
//            audi.getPassengers();
//        } else {
//            audi.getPassenger();
//        }
//    }

    public void workInTaxi(Car car) {
        car.workInTaxi();
    }
}

class Audi implements Car {

    void getPassengers() {
        System.out.println("get passengers");
    }

    @Override
    public void workInTaxi() {
        getPassengers();
    }

    void getPassenger() {
        System.out.println("get one passenger");
    }
}

class R8 extends Audi {

    @Override
    public void workInTaxi() {
        getPassengers();
    }

    @Override
    void getPassengers() {
        System.out.println("get one passenger");
    }
}

interface Car {
    void workInTaxi();
}
