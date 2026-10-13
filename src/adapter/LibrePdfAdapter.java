package adapter;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class LibrePdfAdapter implements PdfAdapter {
    @Override
    public void generate(String filename, String content) throws IOException {
        Document document = new Document(PageSize.A4.rotate());
        try (OutputStream os = new FileOutputStream(filename)) {
            PdfWriter.getInstance(document, os);
            document.open();

            Font font = FontFactory.getFont(FontFactory.HELVETICA, 12);
            document.add(new Paragraph(content, font));
            document.close();
        }
    }
}
