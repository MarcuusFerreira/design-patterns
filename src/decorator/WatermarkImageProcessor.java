package decorator;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WatermarkImageProcessor implements ImageProcessorInterface {

    private ImageProcessorInterface imageProcessor;
    private String watermark;

    public WatermarkImageProcessor(ImageProcessorInterface imageProcessor, String watermark) {
        this.imageProcessor = imageProcessor;
        this.watermark = watermark;
    }

    @Override
    public String process(String imagePath) {
        var processedImagePath = this.imageProcessor.process(imagePath);
        // logica de abrir img e add marca d'agua
        String newImagePath = "uploads/watermarked_file.jpg";
        try {
            Files.writeString(Path.of(newImagePath), "");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        return newImagePath;
    }
}
