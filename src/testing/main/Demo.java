package testing.main;

public class Demo {

    public boolean compareString(String first, String second) {
        if (first.equalsIgnoreCase(second)) {
            return true;
        } else {
            return false;
        }
    }

    public String concatString(String first, String second) {
        return first.concat(second);
    }

    public int[] addOneToArray(int[] numbers) {

        int length = numbers.length;

        int output[] = new int[length];

        for (int i = 0; i < length; i++) {
            output[i] = numbers[i] + 1;
        }

        return output;
    }

    public void performance() {
        for (int i = 0; i < 1_000_000_000; i++) {

        }
        System.out.println("===========================");
    }

    public void exception(int number) {
        int result = 10/number;
        System.out.println("Result = " + result);
    }

    public String test(int a) {
        if (a == 5) {
            throw new ArithmeticException();
        }
        return "asda";
    }

}
