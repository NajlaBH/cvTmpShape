/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.najlabh.cvtmpshape;

/**
 *
 * @author najlanetbean
 */
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
 
import java.io.File;
import java.io.IOException;
import org.junit.Test;
 
/**
 * One page shape for CV template.
 */

@WrapToTests
public class OnePageCvShape {
    /**
     * DEST path  of created file
     */
    public static final String DEST = "OnePageCV/en/shape0_cv_EN_17.pdf";
 
    @Test
    public static void main(String args[]) throws IOException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new OnePageCvShape().createPdf(DEST);
    }
 
    @Test
    public void createPdf(String dest) throws IOException {
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(dest);
 
        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);
 
        //Add paragraph to the document
        try ( // Initialize document
            Document document = new Document(pdf)) {
            //Add paragraph to the document
            document.add(new Paragraph("First words from One shape pdf"));
            
            // __ Create New page
            pdf.addNewPage();
            //Add paragraph to the document
            document.add(new Paragraph("Second words from bordred page"));
            
            // Get the dimensions of the page
            float width = pdf.getDefaultPageSize().getWidth();
            float height = pdf.getDefaultPageSize().getHeight();
            
            // Define a PdfCanvas instance
            PdfCanvas canvas = new PdfCanvas(pdf.getFirstPage());
            // Add a rectangle
            canvas.rectangle(20, 20, width - 40, height - 40);
            canvas.stroke();
            // Close PdfDocument
            pdf.close();
        }


        
    
 
    }
}

