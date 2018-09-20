package io.lectures;

import java.io.*;

public class SystemExample {

    /**
     * ■ System.in предназначен для ввода в приложение дан-
     * ных, заносимых с клавиатуры;
     * ■ System.out предназначен для вывода данных из при-
     * ложения в консольное окно;
     * ■ System.err предназначен для вывода данных об ошибках
     * в консольное окно.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new
                InputStreamReader(System.in));
        String line = reader.readLine();

        System.out.println(line);
    }

    /**
     * поток out связан с консольным ок-
     ном, он инициализируется так по умолчанию. Однако,
     при необходимости out можно перенаправить методом
     setOut(), например в файл:
     */
    public void example() {
        try {
            System.setOut(new PrintStream(
                    new FileOutputStream("out.txt")));
            System.out.println("The output is redirected into file now!");
        } catch(Exception e)
        {
            System.err.println("File opening error:");
            e.printStackTrace();
        }
    }

}
