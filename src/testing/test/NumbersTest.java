package testing.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@ExtendWith()
public class NumbersTest {

    @Test
    public void sum() throws Exception {

        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 15;
        assertEquals(expected, actual);

    }

    // Disable

}
