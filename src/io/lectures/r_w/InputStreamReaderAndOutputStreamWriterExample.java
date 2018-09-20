package io.lectures.r_w;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Прочитать символы, записанные в кодировке,
 * отличной от кодировки по умолчанию поможет поток
 * InputStreamReader. А записать символы в другой кодировке
 * поможет поток OutputStreamWriter. Эти потоки превра-
 * щают байтовый ввод-вывод в символьный, позволяя при
 * этом указывать требуемую кодировку.
 */
public class InputStreamReaderAndOutputStreamWriterExample {

    private static final Logger LOGGER = Logger.getLogger(InputStreamReaderAndOutputStreamWriterExample.class.getName());

    public static void main(String[] args) {
        try (FileInputStream fis =
                     new FileInputStream(new File("lines.txt"));
             InputStreamReader reader =
                     new InputStreamReader(fis, "windows-1251");
             FileOutputStream fs =
                     new FileOutputStream(new File("lines2.txt"));
             OutputStreamWriter writer =
                     new OutputStreamWriter(fs, "UTF-8")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
                writer.write(c);
            }
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
    }

}
