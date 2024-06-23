package Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.*;


public class Logger_ {
    private static Logger log = Logger.getLogger(Logger_.class.getName());


    public void setLog() throws IOException {
        InputStream configFile = Logger_.class.getResourceAsStream("logging.properties");
        LogManager.getLogManager().readConfiguration(configFile);
        FileHandler fh = new FileHandler();
        log.addHandler(fh);
    }
}
