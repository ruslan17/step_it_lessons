package interfaces.humans;

public class Guard extends Employee implements GunPermit {

    private Gun gun;

    public Guard(String name, int age, int salary, Gun gun) {
        super(name, age, salary);
        this.gun = gun;
    }

    public Guard() {
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public boolean permitted() {
        return true;
    }
}
