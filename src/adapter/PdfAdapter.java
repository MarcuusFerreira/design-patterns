package adapter;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface PdfAdapter {

    void generate(String filename, String content) throws IOException;

}
