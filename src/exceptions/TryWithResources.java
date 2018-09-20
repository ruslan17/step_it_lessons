package exceptions;

import java.util.Scanner;


public class TryWithResources {

    public void test() {

        try (
                Scanner in = new Scanner(System.in)

        ) {
            while (in.hasNext())
                System.out.println(in.nextInt());
        }

    }

    public static void main(String[] args) {
        TryWithResources resources = new TryWithResources();

        resources.test();
    }



}
