package logging.slf4j;

import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

public class MyLog4jFilter extends Filter {
    @Override
    public int decide(LoggingEvent loggingEvent) {
        return loggingEvent.getRenderedMessage().endsWith("IT STEP") ? DENY : NEUTRAL;
    }
}
