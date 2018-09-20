package interfaces.conflict;

public class Student extends Human implements Person, Named {

    @Override
    public String getName() {
        return Person.super.getName();
    }
}
