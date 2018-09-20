package solid.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {


        System.out.println("Testing...");

        int passed = 0, failed = 0, count = 0, ignore = 0;

        Class<TestExample> obj = TestExample.class;

        for (Method method : obj.getDeclaredMethods()) {

            // if method is annotated with @ExampleAnnotation
            if (method.isAnnotationPresent(ExampleAnnotation.class)) {

                Annotation annotation = method.getAnnotation(ExampleAnnotation.class);
                ExampleAnnotation test = (ExampleAnnotation) annotation;

                // if enabled = true (default)
                if (test.enabled()) {

                    try {
                        method.invoke(obj.newInstance());
                        System.out.printf("%s - ExampleAnnotation '%s' - passed %n", ++count, method.getName());
                        passed++;
                    } catch (Throwable ex) {
                        System.out.printf("%s - ExampleAnnotation '%s' - failed: %s %n", ++count, method.getName(), ex.getCause());
                        failed++;
                    }

                } else {
                    System.out.printf("%s - ExampleAnnotation '%s' - ignored%n", ++count, method.getName());
                    ignore++;
                }

            }

        }
    }

}
