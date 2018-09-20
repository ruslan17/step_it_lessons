package interfaces.fizz_buzz;

public class FizzBuzzImpl2 implements FizzBuzz {
    @Override
    public void fizzBuzz(int[] array) {
        for (int i = 1; i <= array.length; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println( "FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
