package interfaces.conflict;

public interface Named {

    default String getName() {
        return getClass().getSimpleName();
    }
}
