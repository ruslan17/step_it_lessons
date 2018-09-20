package interfaces.exceptions;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws OwnException2 {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 0) {
            throw new OwnException2();
        }
    }

}

class OwnException2 extends Exception {

    public OwnException2(String s) {
        super(s);
    }

    public OwnException2() {
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
