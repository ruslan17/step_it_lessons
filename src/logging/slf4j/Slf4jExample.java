package logging.slf4j;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

//  TRACE, DEBUG, INFO, WARN, ERROR, FATAL, а так же ALL и OFF
//  -Dlog4j.configuration=log4j.properties - не стандартный путь к файлу log4j.properties
//  -Djava.util.logging.config.file=/home/ruslan/IdeaProjects/OTHERS/OWN_PROJECTS/JAVA/exceptions/src/logger.properties
//        fatal = Level.SEVERE
//        error = Level.SEVERE
//        warn = Level.WARNING
//        info = Level.INFO
//        debug = Level.FINE
//        trace = Level.FINEST

public class Slf4jExample {

//    Создаём логгер
    private static final Logger LOG = LoggerFactory.getLogger(Slf4jExample.class);

    public void loggerExamples() {

//        Java config
//        PropertyConfigurator.configure("src/log4j.properties");

        LOG.info("INFO");
        LOG.debug("DEBUG IT STEP");


        Scanner scanner = new Scanner(System.in);

        try {
            int n = scanner.nextInt();
            LOG.info("Number is: {}", n);
            LOG.debug("Number is: {}", n);
        } catch (Exception e) {
            LOG.error("Error", e);
        }

    }

    /**
     * Используем собственный фильтр с java config
     */
    public void loggerFilterWithJavaConfig() {

//        Создаём аппендер
        ConsoleAppender console = new ConsoleAppender();
//        Указываем формат
        console.setLayout(new PatternLayout("%m%n"));
//        Добавляем фильтр
        console.addFilter(new MyLog4jFilter());
//        Подготавливаем к работе
        console.activateOptions();
//        Создаём log4j logger
        org.apache.log4j.Logger rootLogger = org.apache.log4j.Logger.getRootLogger();
//        Добавляем ему аппендер
        rootLogger.addAppender(console);
//        Второе сообщение не выведется
        LOG.info("Message without STEP IT");
        LOG.info("Message with IT STEP");
    }

    public static void main(String[] args) {
        Slf4jExample slf4jExample = new Slf4jExample();

        slf4jExample.loggerExamples();

//        slf4jExample.loggerFilterWithJavaConfig();

    }

}
