package logging.jul;

import java.io.IOException;
import java.util.logging.*;

// -Djava.util.logging.config.file=/home/ruslan/IdeaProjects/OTHERS/OWN_PROJECTS/JAVA/exceptions/logging.properties

public class JulWithJavaConfig {

    //    Может быть глобальным
    private static Logger globalLogger = Logger.getGlobal();

    //    Может быть на уровне класса
    private static final Logger LOCAL_LOGGER = Logger.getLogger(JulWithJavaConfig.class.getName());

    public static void main(String[] args) throws IOException {

        JulWithJavaConfig logging = new JulWithJavaConfig();
        LOCAL_LOGGER.info("sdsds");

//        logging.fileHandlerExample();

//        logging.consoleHandlerWithFineLevel();

//        logging.consoleHandlerWithFilter();

//        logging.consoleHandlerWithFormatter();

//        logging.fileHandlerWithPath();

//        logging.fileHandlerWithPathAndSimpleFormatter();

    }

    public void loggerLevelsAndExamples() {

//        Уровни
        LOCAL_LOGGER.log(Level.SEVERE, "Level SEVERE");
        LOCAL_LOGGER.log(Level.WARNING, "Level WARNING");
        LOCAL_LOGGER.log(Level.INFO, "Level INFO");
        LOCAL_LOGGER.log(Level.CONFIG, "Level CONFIG");
        LOCAL_LOGGER.log(Level.FINE, "Level FINE");
        LOCAL_LOGGER.log(Level.FINER, "Level FINER");
        LOCAL_LOGGER.log(Level.FINEST, "Level FINEST");

//      Примеры вывода
        LOCAL_LOGGER.info("Level info");

//        Можно указать исключение
        LOCAL_LOGGER.log(Level.WARNING, "Level warning", new Exception());

        try {
            System.out.println("sd");
        } catch (Exception e) {
            LOCAL_LOGGER.log(Level.SEVERE, "Error " + e.getLocalizedMessage(), e);
        }

    }

    /**
     * Список хэндлеров
     */
    public void listOfHandlers() throws IOException {
        new ConsoleHandler();
        new FileHandler();
        new StreamHandler();
        new SocketHandler();
        new MemoryHandler();
    }

    public void fileHandlerByDefault() throws IOException {

//      Файл хэндлер
        Handler fileHandler = new FileHandler();
//      Не использовать хэндлер по умолчанию, т е не выводить в консоль
        LOCAL_LOGGER.setUseParentHandlers(false);
//      Добавить хэндлер для записи в файл
        LOCAL_LOGGER.addHandler(fileHandler);
//      Вывод
        LOCAL_LOGGER.info("INFO FILE HANDLER");

    }

    public void fileHandlerWithPath() throws IOException {

//      Файл хэндлер
        Handler fileHandler;

        try {

            fileHandler = new FileHandler("%h/homeLog.log");
//          Не использовать хэндлер по умолчанию, т е не выводить в консоль
            LOCAL_LOGGER.setUseParentHandlers(false);
//          Добавить хэндлер для записи в файл
            LOCAL_LOGGER.addHandler(fileHandler);
//          Вывод
            LOCAL_LOGGER.info("INFO FILE HANDLER");

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

    }

    public void fileHandlerWithPathAndSimpleFormatter() {

//      Файл хэндлер
        Handler fileHandler;

        try {

            fileHandler = new FileHandler("/home/ruslan/IdeaProjects/OTHERS/OWN_PROJECTS/JAVA/exceptions/javaLog.log");
//          Добавить форматтер
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
//          Добавить хэндлер для записи в файл
            LOCAL_LOGGER.addHandler(fileHandler);
//          Вывод
            LOCAL_LOGGER.info("INFO FILE HANDLER");

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

    }

    public void consoleHandlerWithFineLevel() {

//      Консоль хэндлер
        Handler consoleHandler = new ConsoleHandler();
//      Добавляем уровень fine хэндлеру
        consoleHandler.setLevel(Level.FINE);
//      Добавляем уровень fine логгеру
        LOCAL_LOGGER.setLevel(Level.FINE);
//      Не используем хэндлер по умолчанию, чтобы можно было выводить fine level
        LOCAL_LOGGER.setUseParentHandlers(false);
//      Добавляем хэндлер
        LOCAL_LOGGER.addHandler(consoleHandler);
//      Вывод
        LOCAL_LOGGER.info("LOGGER INFO");
        LOCAL_LOGGER.fine("LOGGER FINE");

    }

    public void consoleHandlerWithFilter() {

//      Консоль хэндлер
        Handler consoleHandler = new ConsoleHandler();
//      Добавляем собственный фильтр
        consoleHandler.setFilter(new MyFilter());
//      Не используем хэндлер по умолчанию
        LOCAL_LOGGER.setUseParentHandlers(false);
//      Добавляем хэндлер
        LOCAL_LOGGER.addHandler(consoleHandler);
//      Вывод
        LOCAL_LOGGER.info("LOGGER INFO");
        LOCAL_LOGGER.info("LOGGER INFO IT STEP");

    }

    public void consoleHandlerWithFormatter() {

//      Консоль хэндлер
        Handler consoleHandler = new ConsoleHandler();
//      Добавляем собственный форматтер
        consoleHandler.setFormatter(new MyFormatter());
//      Не используем хэндлер по умолчанию
        LOCAL_LOGGER.setUseParentHandlers(false);
//      Добавляем хэндлер
        LOCAL_LOGGER.addHandler(consoleHandler);
//      Вывод
        LOCAL_LOGGER.info("LOGGER INFO");

    }

//    Фильтр
    public static class MyFilter implements Filter {

        @Override
        public boolean isLoggable(LogRecord logRecord) {
            return logRecord.getMessage().endsWith("IT STEP");
        }
    }

//    Форматтер
    static class MyFormatter extends Formatter {

        @Override
        public String format(LogRecord logRecord) {
            return logRecord.getLevel() + ": " + logRecord.getMessage() + "\n";
        }
    
}

}