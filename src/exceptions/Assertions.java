package exceptions;

public class Assertions {

    public static int test(int x) {
        assert x>0;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(test(-5));
    }

}
