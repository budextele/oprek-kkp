
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Budi Utomo
 */
public class NewClass {
    public void tes(){
        String fileName = "D:\\"+ ".pdf";
        
        try{
            Document document = new Document() {
            };
            PdfWriter.getInstance((com.itextpdf.text.Document) document, new FileOutputStream(fileName));
            document.open();
            Paragraph p = new Paragraph("Timeline - ");
            p.setAlignment(Element.ALIGN_CENTER);
            document.add(p);
            document.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    
    }
    }

