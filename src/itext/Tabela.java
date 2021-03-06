package itext;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author clairton
 */
public class Tabela {

    public static void main(String[] args) {
        // criação do documento
        Document document = new Document();
        try {        
            String home = System.getProperty("user.home");
            PdfWriter.getInstance(document, new FileOutputStream(home + "/Table.pdf"));
        
            document.open();
            
            // adicionando um parágrafo no documento
            document.add(new Paragraph("Gerando PDF - Java\n\n"));
            
            Font fontBold = new Font();
            fontBold.setStyle(Font.BOLD);
            
            PdfPTable table = new PdfPTable(new float[]{5f,17f,17f});
            
            PdfPCell cell = new PdfPCell(new Paragraph("id", fontBold));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("nome", fontBold));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("telefone", fontBold));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("1"));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("Clairton"));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("87696845"));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("2"));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("Hélio"));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("96844844"));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("3"));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("Emanuel"));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("91234567"));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("4"));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("Gessyca"));
            table.addCell(cell);
            
            cell = new PdfPCell(new Paragraph("81823456"));
            table.addCell(cell);
            
            document.add(table);
            
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(Tabela.class.getName()).log(Level.SEVERE, null, ex);
        }
        document.close();
    }
    
}
