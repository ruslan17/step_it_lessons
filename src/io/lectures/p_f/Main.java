package io.lectures.p_f;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        String pathName = "/home/ruslan/IdeaProjects/OTHERS/STEP_IT/step_it/src/io/lectures/inputFileExample.txt";
        Path path = Paths.get(pathName);
        byte[] bytes = Files.readAllBytes(path);
//        String content = new String(bytes, Charset.defaultCharset());
        String charset = "UTF-8";
        String content = new String(bytes, charset);
//        System.out.println(content);

        List<String> list = Files.readAllLines(path, Charset.forName(charset));
        System.out.println(list);

        Files.write(path, content.getBytes(charset));

        Files.write(path, list);

        Files.createDirectory(path);

        Files.createFile(path);

        /*
        Чтобы скопировать файл из одного места в другое, достаточно сделать
            следующий вызов:
         */
//        Files.copy(fromPath, toPath);

        /*
        А для того чтобы переместить файл, т.е. сделать его копию и удалить
        оригинал, следует сделать такой вызов:
         */
//        Files.move(fromPath, toPath);

        /**
         * для удаления файла достаточно вызвать метод
         * Этот метод генерирует исключение, если файл не существует. Поэтому вместо
         него, возможно, придется вызвать приведенный ниже метод. Оба метода можно
         также использовать для удаления пустого каталога.
         */
        Files.delete(path);
        Files.deleteIfExists(path);
    }

    /**
     * Статический метод Files, list () возвращает поток данных типа
     Stream<Path>, откуда читаются элементы каталога. Содержимое каталога
     читается по требованию, и благодаря этому становится возможной эффективная
     обработка каталогов с большим количеством элементов.
     Для чтения содержимого каталога требуется закрыть системные ресурсы,
     поэтому данную операцию необходимо заключить в блок оператора try
     следующим образом:
     try (Stream<Path> entries = Files.list(pathToDirectory)) {
     Метод list () не входит в подкаталоги. Чтобы обработать все порожденные
     элементы каталога, следует воспользоваться методом Files .walk ():
     try (Stream<Path> entries = Files.walk(pathToRoot)) {
     // Содержит все порожденные элементы, обойденные в глубину
     */


    public void listAllFiles(String path){
        try(Stream<Path> paths = Files.walk(Paths.get(path))) {
            paths.forEach(filePath -> {
//                if (Files.isRegularFile(filePath)) {
                    try {
                        readContent(filePath);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
//                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readContent(Path filePath) throws IOException{
//        System.out.println("read file " + filePath);
        List<String> fileList = Files.readAllLines(filePath);
        fileList.forEach(s -> {
            if (s.toLowerCase().contains("bakcell")) {
                System.out.println(filePath);
            }
        });
//        System.out.println("" + fileList);
    }
}
