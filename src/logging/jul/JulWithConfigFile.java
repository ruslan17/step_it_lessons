package logging.jul;

import java.io.IOException;
import java.util.logging.Logger;

// -Djava.util.logging.config.file=/home/ruslan/IdeaProjects/OTHERS/OWN_PROJECTS/JAVA/exceptions/src/logger.properties

public class JulWithConfigFile {

    private static Logger LOGGER = Logger.getLogger(JulWithConfigFile.class.getName());


    public void fileHandlerByDefault() throws IOException {

//        try {
//            LogManager.getLogManager().readConfiguration(
//                    JulWithConfigFile.class.getResourceAsStream("/logger.properties"));
//        } catch (IOException e) {
//            System.err.println("Could not setup logger configuration: " + e.toString());
//        }

        LOGGER.info("INFO FILE HANDLER");
        LOGGER.info("INFO FILE HANDLER IT STEP");

    }

    public static void main(String[] args) throws IOException {
        JulWithConfigFile configFile = new JulWithConfigFile();

        configFile.fileHandlerByDefault();
    }

}
