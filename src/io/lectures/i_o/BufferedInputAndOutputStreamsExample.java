package io.lectures.i_o;

import java.io.*;

public class BufferedInputAndOutputStreamsExample {

    public static void main(String[] args) {

    }

    public void fileInput() {
        String inputFileName = System.getProperty("user.dir") + "/src/io/lectures/inputFileExample.txt";
        try (FileInputStream fin =
                     new FileInputStream(new File(inputFileName));
             BufferedInputStream bis =
                     new BufferedInputStream(fin)) {
            int c;
            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void fileOutput() {
        String text = "This lines of text should be written in file\r\n"
                + "using buffered stream.\r\n"
                + "Just one more line.\r\n";
        String outputFileName = System.getProperty("user.dir") + "/src/io/lectures/outputFileExample.txt";
        try (FileOutputStream out = new FileOutputStream(outputFileName);
             BufferedOutputStream bos =
                     new BufferedOutputStream(out)) {
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
