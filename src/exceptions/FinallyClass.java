package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyClass {

    public void test() {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            System.out.println(n);
        } catch (InputMismatchException exception) {
//            exception.printStackTrace();
            System.out.println(555);
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        FinallyClass finallyClass = new FinallyClass();
        finallyClass.test();

//        class TimePrinter implements ActionListener {
//            public void actionPerformed(ActionEvent event) {
//                Toolkit.getDefaultToolkit().beep();
//            }
//        }
//        ActionListener listener = new TimePrinter();
//        javax.swing.Timer t = new javax.swing.Timer(1000, listener);
//        t.start();
//        JOptionPane.showMessageDialog(null, "Quit program?");
//        System.exit(0);
    }

}
