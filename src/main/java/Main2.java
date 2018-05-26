import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.TextAlignment;

import java.io.File;

/**
 * Created by linhtran on 26/05/18.
 */
public class Main2 {
    public static final String DEST = "images_in_chunk_in_cell.pdf";
    public static final String IMG = "./src/main/resources/Hình chụp từ 2017-06-28 08-40-37.png";

    public static void main(String[] args) throws Exception {
        File file = new File(DEST);
       // file.getParentFile().mkdirs();
        new Main2().manipulatePdf(DEST);
    }

    protected void manipulatePdf(String dest) throws Exception {
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
        Document doc = new Document(pdfDoc);
        Image image = new Image(ImageDataFactory.create(IMG));
        image.setWidth(300);
        image.setHeight(300);

        Table table = new Table(2);
        table.setTextAlignment(TextAlignment.CENTER);
        table.setBorder(Border.NO_BORDER);

        table.addCell(image);
        table.addCell(image);
        table.addCell(image);
        table.addCell(image);
        doc.add(table);
        doc.close();
    }
}
