package adapter;

import java.io.IOException;

public class AdapterClient {

    static void main() throws IOException {
        var openHtmlToPdf = new OpenHtmlToPdfAdapter();
        var librePdf = new LibrePdfAdapter();
        var reportGenerator = new SalesReportGenerator(librePdf);
        reportGenerator.generate();
    }
}
