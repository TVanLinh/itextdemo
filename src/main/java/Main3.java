import com.itextpdf.io.IOException;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.MalformedURLException;


/**
 * Created by linhtran on 26/05/18.
 */
public class Main3 {
    public static final String DEST = "colored_border.pdf";
    public static final String IMG = "./src/main/resources/Hình chụp từ 2017-06-28 08-40-37.png";
    public static void main(String[] args) throws IOException,
            DocumentException, java.io.IOException {
        File file = new File(DEST);
        //file.getParentFile().mkdirs();
        new Main3().createPdf(DEST);
    }
    public void createPdf(String dest) throws IOException, DocumentException, java.io.IOException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        PdfPTable table;
        Paragraph paragraph = new Paragraph("Danh sach hinh anh \n");
        paragraph.setAlignment(Element.ALIGN_CENTER);
//        paragraph.setF
        document.add(paragraph);
        paragraph = new Paragraph();
        paragraph.setSpacingBefore(10);
        document.add(paragraph);

//        table.set
        table = new PdfPTable(2);

        Image image ;
        ImageData img = ImageDataFactory.create(IMG);
        img.setWidth(300);
        img.setHeight(300);
        image = Image.getInstance(img.getUrl());
        image.scaleAbsolute(150, 150);
//        image.setWidth(300);
//        image.setHeight(300);
        ///==========================
        PdfPCell cell;
        cell = new PdfPCell(image);
        cell.setUseVariableBorders(true);
        cell.setBorderColorTop(BaseColor.WHITE);
        cell.setBorderColorBottom(BaseColor.WHITE);
        cell.setBorderWidth(0);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPaddingBottom(20);
        table.addCell(cell);

        //===================================
        cell = new PdfPCell(image);
        cell.setBorderWidthLeft(5);
        cell.setBorderColorLeft(BaseColor.WHITE);
        cell.setBorderWidthTop(8);
        cell.setBorderColorTop(BaseColor.WHITE);
        cell.setBorderWidth(0);
        cell.setPaddingBottom(20);
        table.addCell(cell);

        //===============================================
        cell = new PdfPCell(image);
        cell.setUseVariableBorders(true);
        cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM);
        cell.setBorderColorLeft(BaseColor.WHITE);
        cell.setBorderColorBottom(BaseColor.WHITE);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setBorderWidth(0);
        table.addCell(cell);

        //===========================================
        cell = new PdfPCell(new Phrase("Cell 4"));
        cell.setBorder(Rectangle.LEFT | Rectangle.TOP);
        cell.setUseBorderPadding(true);
        cell.setBorderWidthLeft(5);
        cell.setBorderColorLeft(BaseColor.WHITE);
        cell.setBorderWidthTop(8);
        cell.setBorderColorTop(BaseColor.WHITE);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setBorderWidth(0);
        table.addCell(cell);



        cell = new PdfPCell(image);
        cell.setUseVariableBorders(true);
        cell.setBorderColorTop(BaseColor.WHITE);
        cell.setBorderColorBottom(BaseColor.WHITE);
        cell.setBorderWidth(0);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPaddingBottom(20);
        table.addCell(cell);

        //===================================
        cell = new PdfPCell(image);
        cell.setBorderWidthLeft(5);
        cell.setBorderColorLeft(BaseColor.WHITE);
        cell.setBorderWidthTop(8);
        cell.setBorderColorTop(BaseColor.WHITE);
        cell.setBorderWidth(0);
        cell.setPaddingBottom(20);
        table.addCell(cell);

        //===============================================
        cell = new PdfPCell(image);
        cell.setUseVariableBorders(true);
        cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM);
        cell.setBorderColorLeft(BaseColor.WHITE);
        cell.setBorderColorBottom(BaseColor.WHITE);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setBorderWidth(0);
        table.addCell(cell);

        //===========================================
        cell = new PdfPCell(new Phrase("Cell 4"));
        cell.setBorder(Rectangle.LEFT | Rectangle.TOP);
        cell.setUseBorderPadding(true);
        cell.setBorderWidthLeft(5);
        cell.setBorderColorLeft(BaseColor.WHITE);
        cell.setBorderWidthTop(8);
        cell.setBorderColorTop(BaseColor.WHITE);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setBorderWidth(0);
        table.addCell(cell);
        //=========================================
        document.add(table);
        document.close();
    }
}
