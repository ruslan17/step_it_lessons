package exceptions;

public class Test {

    public void test1() throws RuntimeException {
        System.out.println(1);
    }

    public void test2() throws Exception {
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test test = new Test();

        parseInteger("4");
    }

    public static int parseInteger(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }

}

class OwnException extends Exception {

    public OwnException(String s) {
        super(s);
    }

    public OwnException() {
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
