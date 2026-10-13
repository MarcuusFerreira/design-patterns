package decorator;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ResizeImageProcessor implements ImageProcessorInterface {

    private ImageProcessorInterface imageProcessor;
    private int height;
    private int width;

    public ResizeImageProcessor(ImageProcessorInterface imageProcessor, int height, int width) {
        this.imageProcessor = imageProcessor;
        this.height = height;
        this.width = width;
    }

    @Override
    public String process(String imagePath) {
        var processed = imageProcessor.process(imagePath);
        // Logica de redimensionar img e salvar
        String newImagePath = "uploads/resized_file.jpg";
        try {
            Files.writeString(Path.of(newImagePath), "");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        return newImagePath;
    }
}
