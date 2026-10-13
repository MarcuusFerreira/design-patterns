package adapter;

import java.io.IOException;
import java.time.Instant;

public class SalesReportGenerator {

    private final PdfAdapter pdfAdapter;

    public SalesReportGenerator(PdfAdapter pdfAdapter) {
        this.pdfAdapter = pdfAdapter;
    }

    public void generate() throws IOException {
        var filename = Instant.now().getEpochSecond() + ".pdf";
        var content = "conteudo do relatório";
        pdfAdapter.generate(filename, content);
    }

}
