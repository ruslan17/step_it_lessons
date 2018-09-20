package interfaces.fizz_buzz;

public class FizzBuzzImpl1 implements FizzBuzz {
    @Override
    public void fizzBuzz(int[] array) {
        for (int i = 1; i <= array.length; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
