package testing.store;

import java.util.Scanner;

public class Store {

    public void test() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                login();
            case 2:
                register();
        }
    }

    public void register() {
        System.out.println("register");
    }

    public void login() {
        System.out.println("login");
    }

}
