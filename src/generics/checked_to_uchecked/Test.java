package generics.checked_to_uchecked;

import java.io.File;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        new Block() {
            public void body() throws Exception {
                Scanner scanner = new Scanner(new File("kek"));
                while (scanner.hasNext()) {
                    System.out.println(scanner.next());
                }
            }
        }
        .toThread().start();
    }

}
