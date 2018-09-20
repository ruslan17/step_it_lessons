package interfaces.conflict;

public interface Person {

    default String getName() {
        return getClass().getSimpleName();
    }

}
