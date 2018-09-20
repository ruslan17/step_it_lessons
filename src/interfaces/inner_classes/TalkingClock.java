package interfaces.inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TalkingClock {

    private int interval;

    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * Запускает часы
     */
//    public void start() {
//        ActionListener listener = new TimePrinter();
////        ActionListener listener = this.new TimePrinter();
//        Timer timer = new Timer(interval, listener);
//        timer.start();
//    }


    /**
     * Локальный внутренний класс
     */
    public void start() {
        class TimePrinter implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                Date now = new Date();
                System.out.println("At the tone, the time is" + now);
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        }
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }


    public class TimePrinter implements ActionListener {

        private static final int a = 5;

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Date now = new Date();
            System.out.println("At the tone, the time is " + now);
            if (beep) Toolkit.getDefaultToolkit().beep();
//            if (TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
        }
    }

    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        // выполнять программу до тех пор, пока пользователь
        //не щелкнет на кнопке ОК
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

}

/**
 * Если внутренний класс public
 */
class Test {
    public static void main(String[] args) {

        TalkingClock clock = new TalkingClock(1000, true);
        TalkingClock.TimePrinter printer = clock.new TimePrinter();
    }
}
