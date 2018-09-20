package interfaces.humans;

public class Student extends Human implements AlgorithmicThinking {

    private int grants;

    @Override
    public boolean algorithmicThinking() {
        return true;
    }

    public Student(String name, int age, int grants) {
        super(name, age);
        this.grants = grants;
    }

    public int getGrants() {
        return grants;
    }

    public void setGrants(int grants) {
        this.grants = grants;
    }
}
