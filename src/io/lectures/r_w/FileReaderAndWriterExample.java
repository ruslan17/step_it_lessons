package io.lectures.r_w;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReaderAndWriterExample {

    private static final Logger LOGGER = Logger.getLogger(FileReaderAndWriterExample.class.getName());

    public void example() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("lines.txt");
            fw = new FileWriter("lines1.txt");
//            Если второй пареметр true, то файл будет дозаписываться
//            fw = new FileWriter("lines1.txt", true);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    char[] buffer = new char[line.length()];
                    line.getChars(0, line.length(), buffer, 0);

                for (int i = 0; i < buffer.length; i++) {
                    if (buffer[i] == 'a') {
                        fw.write('A');
                    } else {
                        fw.write(buffer[i]);    
                    }
                }

                    fw.write(line + System.getProperty("line.separator"));
            }
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, "Файл не найден", ex);
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                LOGGER.log(Level.SEVERE, null, ex);
            }
        }
    }


}
