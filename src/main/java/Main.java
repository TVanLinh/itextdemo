import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.scenario.effect.ImageData;
import javafx.scene.control.Cell;


import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by linhtran on 26/05/18.
 */
public class Main {
    public static final String RESULT
            = "hello.pdf";
    public static void main1(String[] args) throws IOException, DocumentException {
        new Main().createPdf(RESULT);
    }

    public void createPdf(String filename)
            throws DocumentException, IOException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3
        document.open();
        // step 4
        document.add(new Paragraph("Hello World!"));
        // step 5
        document.close();
    }

}
