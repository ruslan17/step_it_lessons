package inheritance;

public class Manager extends Employee {

    private int bonus;

    public Manager(String name, int salary) {
        super(name, salary);
        bonus = 0;
    }

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getSalary() {

        return bonus + super.getSalary();

    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager() {
    }

    @Override
    public String toString() {
        return super.toString() +
                " bonus=" + bonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        return bonus == manager.bonus;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + bonus;
        return result;
    }
}
