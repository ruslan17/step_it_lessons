package interfaces.humans;

public class Programmer extends Employee implements AlgorithmicThinking {

    private boolean dbAccess;

    @Override
    public boolean algorithmicThinking() {
        return true;
    }

    public boolean isDbAccess() {
        return dbAccess;
    }

    public void setDbAccess(boolean dbAccess) {
        this.dbAccess = dbAccess;
    }
}
