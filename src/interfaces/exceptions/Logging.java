package interfaces.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {

    private static Logger log = Logger.getLogger(Logging.class.getName());

    public static void main(String[] args) {
        log.info("kek");
        log.log(Level.WARNING, "Message");
    }

}
