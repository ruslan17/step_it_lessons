package exceptions;

import java.util.Scanner;

public class DZ {

    public static void test(int x, int y, int [] array) {
        try {
            int result = x / y;

            array[6] = result;

        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на ноль!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int n = scanner.nextInt();
        test(x, y, new int[n]);
    }

}
