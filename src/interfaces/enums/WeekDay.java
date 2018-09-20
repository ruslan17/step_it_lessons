package interfaces.enums;

public enum  WeekDay {

    MONDAY("Monday", 1), TUESDAY("Tuesday", 2);

    String name;

    int or;

    WeekDay(String name, int or) {
        this.name = name;
        this.or = or;
    }

//    @Override
//    public String toString() {
//        return "WeekDay{" +
//                "name='" + name + '\'' +
//                ", or=" + or +
//                '}';
//    }

}
