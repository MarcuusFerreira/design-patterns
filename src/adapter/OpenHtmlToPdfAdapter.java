package adapter;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OpenHtmlToPdfAdapter implements PdfAdapter {
    @Override
    public void generate(String filename, String content) throws IOException {
        String html = """
        <html>
          <head>
            <style>
              @page { size: A4 landscape; }
            </style>
          </head>
          <body>{{content}}</body>
        </html>
        """;
        try (OutputStream os = new FileOutputStream(filename)) {
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.withHtmlContent(html.replace("{{content}}", content), null);
            builder.toStream(os);
            builder.run();
        }
    }
}
