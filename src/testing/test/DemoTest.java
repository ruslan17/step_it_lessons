package testing.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import testing.main.Demo;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @Before annotation is renamed to @BeforeEach
 * @After annotation is renamed to @AfterEach
 * @BeforeClass annotation is renamed to @BeforeAll
 * @AfterClass annotation is renamed to @AfterAll
 * @Ignore annotation is renamed to @Disabled
 */
public class DemoTest {

    @Test
    void test1() {

        Assertions.assertThrows(ArithmeticException.class, () -> demo.test(5));

    }

    public static final String ERROR = "Error";

    private static Demo demo;

    @BeforeAll
    public static void before() {
        demo = new Demo();
    }

    @AfterAll
    public static void after() {
        demo = null;
    }

    @Test
    public void compareString() throws Exception {

        assertTrue(demo.compareString("hi", "hi"));

        assertFalse(demo.compareString("hii", "hi"), ERROR);

    }

    @Test
    public void concatString() throws Exception {

        for (int i = 0; i < 1_000_000; i++) {
            assertEquals(ERROR, "hi", demo.concatString("h", "i"));
        }

    }

    @Test
    public void addOneToArray() throws Exception {

        int[] actual = {1};

        int[] expected = {2};

        assertArrayEquals(expected, demo.addOneToArray(actual));

    }

    @Test
    public void performance() throws Exception {
        Assertions.assertTimeout(Duration.ofMillis(10), () -> demo.performance());

    }

    @Test
    public void exception() throws Exception {
        Assertions.assertThrows(ArithmeticException.class, () -> demo.exception(0));
    }

}

