package exceptions;

import java.io.File;

public class Throws {

    public static void connectFile(File file) {

        if (file == null || !file.exists())

            throw new IllegalArgumentException();

    }

    public static void main(String[] args) {

        File f = new File("demo.txt");

        try {

            connectFile(f);

        } catch (IllegalArgumentException e) {

            System.err.print("обработка unchecked - исключения вне метода: " + e);

        }

    }

}
