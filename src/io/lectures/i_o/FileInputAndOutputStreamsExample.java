package io.lectures.i_o;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileInputAndOutputStreamsExample {

    private static final Logger LOGGER = Logger.getLogger(FileInputAndOutputStreamsExample.class.getName());

    /**
     * Отметьте важный момент: мы выполняем чтение
     * и запись файл побайтово, поэтому таким способом мо-
     * жем копировать не только текстовые файлы, а и бинар-
     * ные. Положите в текущую папку проекта какой-нибудь
     * графический файл, свяжите его со входным потоком
     * и запустите приложение. Будет создана копия вашего
     * графического файла.
     */
    public static void main(String[] args) {

        InputStream in = null;
        OutputStream out = null;

        byte[] buffer = null;

        /*
            Файл должен существовать
         */
        String inputFileName = System.getProperty("user.dir") + "/src/io/lectures/inputFileExample.txt";
        String outputFileName = System.getProperty("user.dir") + "/src/io/lectures/outputFileExample.txt";

        try {
            in = new FileInputStream(new File(inputFileName));
//            in = new FileInputStream(inputFileName);
            buffer = new byte[in.available()];
            in.read(buffer);
            File file = new File(outputFileName);
            out = new FileOutputStream(file);
            out.write(buffer);
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, "File doesn't exist", ex);
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ex) {
                LOGGER.log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * В Java применяется искусный механизм для разделения двух видов
     * обязанностей. Одни потоки ввода-вывода (типа FileInputStream и поток
     * ввода, возвращаемый методом openStream() из класса URL) могут извлекать
     * байты из файлов и других экзотических мест, а другие потоки ввода-вывода (типа
     * DataInputStream) — составлять эти байты в более полезные типы данных.
     * Программирующему на Java остается только использовать их в нужном сочетании.
     * Например, чтобы получить возможность читать числа из файла, достаточно
     * создать объект потока ввода типа FileInputStream, а затем передать его
     * конструктору класса DataInputStream:
     */
    public void dataInputStreamExample() throws IOException {
        FileInputStream fin = new FileInputStream("fileName");
        DataInputStream din = new DataInputStream(fin);
        double x = din.readDouble();
    }

}