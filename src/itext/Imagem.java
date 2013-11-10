package itext;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author clairton
 */
public class Imagem {

    public static void main(String[] args) {
        // criação do documento
        Document document = new Document();
        try {        
            String home = System.getProperty("user.home");
            PdfWriter.getInstance(document, new FileOutputStream(home + "/Imagem.pdf"));
        
            document.open();
            
            // adicionando um parágrafo no documento
            document.add(new Paragraph("Gerando PDF - Java"));
            document.add(new Paragraph("Imagem"));
            
            Image figura = Image.getInstance(home + "/cialne.jpg");
            document.add(figura);
            figura = Image.getInstance(home + "/dudico.jpg");
            document.add(figura);
            
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(PrimeiroDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
        document.close();
    }    
}
