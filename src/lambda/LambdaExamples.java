package lambda;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Лямбда-выражение - это безымянный метод, который служит
 * для передачи поведения из одного места программы в другое
 * так, будто это данные.
 * О Лямбда-выражения выглядят следующим образом: BinaryOperator<
 * Integer> add = (х, у) .... х + у.
 * О Функциональным интерфейсом называется интерфейс с единственным
 * абстрактным методом; он используется в качестве
 * типа лямбда-выражения.
 */
public class LambdaExamples {

    public static void comparatorExample() {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        Comparator<String> lambdaComparator = (s1, s2) -> s1.length() - s2.length();

        Comparator<String> lambdaComparator2 = Comparator.comparingInt(String::length);

    }

    public static void ownInterfaceExample() {
        TestClass testClass = new TestClass();

        testClass.testLambda(new FunctionalInterfaceExample() {
            @Override
            public void test() {
                System.out.println("Без лямбда");
            }
        });

        testClass.testLambda(() -> System.out.println("С лямбда"));
    }

    public static void arrayListFuncInterfaceExample() {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add(null);
        list.add("C");

        list.removeIf(e -> e == null);

        System.out.println(list);

    }

    public static void doubleColonExample() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Al");
        list.add("BD");
        list.add("ADC");


        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String s1) {
                return s.compareToIgnoreCase(s1);
            }
        });

        list.sort((s, s1) -> s.compareToIgnoreCase(s1));


        list.sort(String::compareToIgnoreCase);

    }

    public static void main(String[] args) {
//        comparatorExample();

//        ownInterfaceExample();

//        arrayListFuncInterfaceExample();

        actionListenerExample();

    }

    public static void actionListenerExample() {
        JFrame frame = new JFrame("ActionListener Example");

        final TextField field = new TextField();
        field.setBounds(100, 50, 100, 20);

        Button button = new Button("Click Here");
//        Лево, верх, длина, высота
        button.setBounds(100, 100, 100, 50);

        button.addActionListener(e -> field.setText("Hello"));
        frame.add(button);
        frame.add(field);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
