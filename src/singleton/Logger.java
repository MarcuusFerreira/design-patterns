package singleton;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static Logger INSTANCE = new Logger();

    private static final String LOG_FILE = "app.log";

    private Logger() {}

    public void log(String message) {
        String time = LocalDateTime.now().format(FORMATTER);
        String line = "[" + time + "] " + message + System.lineSeparator();

        try {
            Files.writeString(
                    Path.of(LOG_FILE),
                    line,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static Logger getInstance() {
        return INSTANCE;
    }

}
