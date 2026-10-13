package decorator;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BasicImageProcessor implements ImageProcessorInterface {
    @Override
    public String process(String imagePath) {
        String newImagePath = "uploads/file.jpg";
        try {
            Files.writeString(Path.of(newImagePath), "");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        return newImagePath;
    }
}
