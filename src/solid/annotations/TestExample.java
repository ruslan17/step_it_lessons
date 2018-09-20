package solid.annotations;

public class TestExample {

    @ExampleAnnotation
    void testA() {
        if (true)
            throw new RuntimeException("This test always failed");
    }

    @ExampleAnnotation(enabled = false)
    void testB() {
        if (false)
            throw new RuntimeException("This test always passed");
    }

}
