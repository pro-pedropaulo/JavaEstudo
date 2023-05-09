package com.meu.projeto;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class App {
    public static void main(String[] args) {
        try {
            // Converter imagem PNG em PDF
            String inputFile = "C:\\testeImagem\\wiki.png";
            String tempPdf = "C:\\testeImagem\\temp.pdf";

            BufferedImage image = ImageIO.read(new File(inputFile));
            PDDocument doc = new PDDocument();
            PDPage page = new PDPage(new PDRectangle(image.getWidth(), image.getHeight()));
            doc.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(doc, page);
            contentStream.drawImage(org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory.createFromImage(doc, image), 0, 0, image.getWidth(), image.getHeight());
            contentStream.close();

            doc.save(tempPdf);
            doc.close();

            // Executar OCR
            String outputPdf = "C:\\testeImagem\\output.pdf";

            ITesseract instance = new Tesseract();
            instance.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");
            instance.setLanguage("por");

            File inputFileOCR = new File(inputFile);
            String ocrResult = instance.doOCR(inputFileOCR);

            // Ler arquivo temporário com iText 7
            PdfReader reader = new PdfReader(tempPdf);
            PdfWriter writer = new PdfWriter(outputPdf);
            PdfDocument pdfDocument = new PdfDocument(reader, writer);
            Document document = new Document(pdfDocument);

            // Adicionar o conteúdo OCR como texto transparente
            Paragraph paragraph = new Paragraph(ocrResult)
                    .setFontColor(new DeviceRgb(255, 255, 255))
                    .setFontSize(10)
                    .setTextAlignment(TextAlignment.LEFT)
                    .setVerticalAlignment(VerticalAlignment.TOP)
                    .setFixedPosition(1, 0, pdfDocument.getFirstPage().getPageSize().getHeight(), pdfDocument.getFirstPage().getPageSize().getWidth());

            document.add(paragraph);
            document.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
