package io.lectures.serialization;

import java.io.*;
import java.util.ArrayList;

/**
 * Сериализация – это процесс превращения объекта
 * какого-либо класса в байтовый поток. Этот поток, по-
 * мимо данных объекта, будет содержать информацию
 * о типе объекта и о типе данных, хранящихся в объекте.
 * Объект, превращенный в поток, можно записать в файл,
 * передать по сети, занести в таблицу БД. Затем, сериализо-
 * ванный объект можно будет извлечь из потока. Процесс
 * превращения потока в объект в оперативной памяти,
 * называется десериализацией. Необходимо отметить,
 * что и сериализация и десериализация не независят от
 * JVM. Это значит, что можно сериализовать объект на
 * одной платформе, а затем десериализовать его на другой
 * платформе.
 * <p>
 * В Java существует два способа выполнения сериали-
 * зации: использование интерфейса Seriallizable и исполь-
 * зование интерфейса Externalizable.
 * <p>
 * Для выполнения сериализации и десериализации
 * в Java используются потоки ObjectInputStream и
 * ObjectOutputStream.
 */
public class SerializationExample {

    public static void serialize(Object obj, String fileName) {

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(obj);
//            fileOutputStream.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found:");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.err.println("Input/Output error:");
            ex.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException ex) {
                System.err.println("Input/Output error:");
                ex.printStackTrace();
            }
        }
    }

    public static Object deserialize(String fileName) {
        FileInputStream fis = null;
        Object obj = null;
        try {
            fis = new FileInputStream(fileName);
            ObjectInputStream ois =
                    new ObjectInputStream(fis);
            obj = ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found:");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.err.println("Input/Output error:");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.err.println("Class not found:");
            ex.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.err.println("Input/Output error:");
                ex.printStackTrace();
            }
        }
        return obj;
    }

    /**
     * Персистентность
     * Обычно,
     * объект существует в оперативной памяти максимум до
     * тех пор, пока выполняется приложение. При завершении
     * приложения мусорщик удаляет в оперативной памяти
     * все объекты. Так вот, сериализация позволяет сохранить
     * объект в файл, а затем позже десериализовать его и про-
     * должить работу с объектом. Таким образом, жизненный
     * цикл объекта уже не ограничивается временем выполне-
     * ния приложения. Это и есть персистентность – продление
     * времени жизни объекта за пределы времени выполнения
     * приложения.
     *
     * Сериализовать
     можно только объекты классов, кото-
     рые наследуют интерфейсу Serializable. При этом, если
     в вашем классе есть поля типа других классов, они тоже
     должны наследовать интерфейс Serializable, чтобы сери-
     ализация выполнилась успешно. А что произойдет, если
     в классе будут поля несериазлизуемого типа? Например,
     если бы в нашем классе Fish, было поле типа Thread, то
     при попытке сериализовать объект такого класса, мы
     бы получили исключение NotSerializableException. Это
     случилось бы потому, что класс Thread не наследует
     интерфейсу Serializable и, следовательно, не может быть
     сериализован.

     В Java большинство классов поддерживают сериали-
     зацию, хотя есть и несериализуемые классы. Как быть
     в ситуации, когда вам надо сериализовать объект класса, а
     у этого объекта есть несериализуемое поле? В этом случае,
     такое несериализуемое поле можно обозначить специфи-
     катором transient. Это приведет к тому, что объект будет
     сериализован, но без этого поля. Этот же спецификатор
     можно использовать возле любых полей, которые вы не
     хотите включать в сериализацию.

     Если вам надо сериализовать несколько объектов за
     один раз, вы можете занести эти объекты в сериализуемую
     коллекцию и сериализовать коллекцию целиком. Затем
     десериализовать ее и вытащить оттуда все элементы по
     одному.

     Надо еще учесть то, что static поля так же, как и transient,
     не сериализуются. А вот поля с модификатором final
     сериализуются, как обычные.
     */


}
