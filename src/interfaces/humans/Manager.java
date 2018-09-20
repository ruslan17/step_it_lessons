package interfaces.humans;

public class Manager extends Employee implements GunPermit
//        , Comparable
{

    private int bonus;

    public Manager(String name, int age, int salary, int bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public Manager() {
    }

    public Manager(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean permitted() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() +
                "bonus=" + bonus +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        if (getClass() != o.getClass()) throw new ClassCastException()
//        Manager manager = (Manager) o;
//        return bonus - manager.bonus;
//    }
}
