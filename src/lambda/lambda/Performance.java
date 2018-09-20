package lambda.lambda;

import java.util.Arrays;
import java.util.List;

public class Performance {

    /**
     * Считает количество пустых строк
     */
    public void emptyStringsCount() {
        long startTime = System.currentTimeMillis();

        System.out.println(startTime);
        List<String> strings = Arrays.asList("a", "", "b", "", "c");
        long count = strings.stream().filter(String::isEmpty).count();
        System.out.println(count);

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }

}
