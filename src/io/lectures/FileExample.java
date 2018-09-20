package io.lectures;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Этот класс работает непосредственно с файловой
 * системой и является незаменимым при работе с файлами
 * и папками на диске. Класс File не имеет отношения к про-
 * цессам чтения или записи. Он содержит информацию
 * о самих файлах и папках.
 */
public class FileExample {

    public static void main(String[] args) {

        FileExample fileExample = new FileExample();
        String dirName = System.getProperty("user.dir");
        fileExample.fileCreationExample(dirName);
        fileExample.folderCreationExample(dirName);

    }

    public void fileCreationExample(String dirName) {

        String fileName = "inputFileExample.txt";
        String fullName = "";
//        fullName = dirName + File.separator + fileName;
        fullName = dirName + "/src/io/lectures/" + fileName;
        System.out.println("File path : " + fullName);

        File file = new File(fullName);

        if (!file.exists()) {
            try {
                if (file.createNewFile())
                    System.out.println("File created!");
                else
                    System.out.println("Something Wrong!");
            } catch (IOException ex) {
                Logger.getLogger(FileExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("File already exists!");
        }
    }

    /**
     * Для создания папок этот класс использует методы
     * mkdir() и mkdirs(). Первый метод позволяет создать толь-
     * ко одну папку, а второй – цепочку вложенных папок.
     */
    public void folderCreationExample(String dirName) {
        String dirname = dirName + "/src/io/lectures/mkdirs";
        File d = new File(dirname);
        d.mkdirs();
    }

    /**
     * Примеры методов:
     * deleteOnExit(): если вызвать этот метод для объекта
     * класса File, то файл на диске, ассо-
     * циированный с этим объектом, будет
     * удален автоматически, при завершении
     * работы JVM;
     * <p>
     * getFreeSpace(): возвращает кол-во свободных байт на том
     * диске, где расположен текущий объект;
     * <p>
     * getTotalSpace(): возвращает общий размер диска,
     * на котором расположен текущий объект;
     * <p>
     * setReadonly(): делает файл доступным только для чтения.
     */

}
