package decorator;

public class DecoratorClient {

    void main() {
        var imagePath = "/tmp/file.jpg";
        ImageProcessorInterface imageProcessor = new BasicImageProcessor();
        imageProcessor = new WatermarkImageProcessor(imageProcessor, "marca d'agua");
        imageProcessor = new ResizeImageProcessor(imageProcessor, 100, 100);
        imageProcessor.process(imagePath);
    }

}
