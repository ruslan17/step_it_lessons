package logging.jul;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

//    Фильтр
public class MyJulFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord logRecord) {
        return logRecord.getMessage().endsWith("IT STEP");
    }
}
