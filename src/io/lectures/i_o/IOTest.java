package io.lectures.i_o;

import java.io.*;

public class IOTest {

    /*
        В классе InputStream имеется следующий абстрактный метод:
    abstract int read()
    Этот метод читает один байт и возвращает считанный байт или значение -1,
    если обнаруживается конец источника ввода.

    Аналогично в классе OutputStream определяется следующий абстрактный
    метод, записывающий один байт в указанное место для вывода данных:
    abstract void write(int b)
         */
    public static void main(String[] args)  {
        InputStream inputStream;
        Reader reader;

        /*
        deleteOnExit() если вызвать этот метод для объекта
класса File, то файл на диске, ассо-
циированный с этим объектом, будет
удален автоматически, при завершении
работы JVM;
getFreeSpace() возвращает кол-во свободных байт на том
диске, где расположен текущий объект;
getTotalSpace() возвращает общий размер диска,
на котором расположен текущий объект;
setReadonly() делает файл доступным только для чтения.
         */
//        File file = new File("/home/ruslan/IdeaProjects/OTHERS/OWN_PROJECTS/JAVA/junit5testing/src/test1.txt");
//        if (!file.exists()) {
//            file.createNewFile();
//        } else {
//            System.out.println("File exists");
//        }

//        file.deleteOnExit();
//        System.out.println(file.getFreeSpace());
//        System.out.println(file.getTotalSpace());
//        file.setReadOnly();
//        file.setWritable(true);
//
//        InputStream inputStream1 = null;
//        OutputStream outputStream = null;
//
//     try {
//         inputStream1 = new FileInputStream(file);
//         outputStream = new FileOutputStream(file);
//
//         byte[] arr = {1, 7, 5};
//
//         outputStream.write(arr);
//     } finally {
//         inputStream1.close();
//         outputStream.close();
//     }

//        PrintWriter printWriter = new PrintWriter("/home/ruslan/IdeaProjects/OTHERS/OWN_PROJECTS/JAVA/junit5testing/src/test1.txt", "UTF-8");
//
//        printWriter.print("SSLSLSL");
//        printWriter.print("asd");
//        printWriter.print("asdasd");
//        printWriter.close();

        try {
            FileReader reader1 = new FileReader("/home/ruslan/IdeaProjects/OTHERS/OWN_PROJECTS/JAVA/junit5testing/src/test1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader1);

            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }

    /*
    Метод read () возвращает кодовую единицу в Юникоде (в виде целого числа
от 0 до 65535) или значение -1, если достигнут конец файла. А метод write ()
вызывается с заданной кодовой единицей в Юникоде.
     */



}
