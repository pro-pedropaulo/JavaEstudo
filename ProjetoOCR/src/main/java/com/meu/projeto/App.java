package com.meu.projeto;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Canvas;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.Property;
import com.itextpdf.layout.property.TransparentColor;
import net.sourceforge.tess4j.ITessAPI;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Word;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

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

            List<Word> words = instance.getWords(image, ITessAPI.TessPageIteratorLevel.RIL_WORD);

            // Ler arquivo temporário com iText 7
            PdfReader reader = new PdfReader(tempPdf);
            PdfWriter writer = new PdfWriter(outputPdf);
            PdfDocument pdfDocument = new PdfDocument(reader, writer);

            // Adicionar o conteúdo OCR como texto invisível nas posições específicas
            TransparentColor invisibleColor = new TransparentColor(new DeviceRgb(0, 0, 0), 0);
            for (Word word : words) {
                Rectangle rect = new Rectangle((float) word.getBoundingBox().getX(), (float) (pdfDocument.getFirstPage().getPageSize().getHeight() - word.getBoundingBox().getY() - word.getBoundingBox().getHeight()), (float) word.getBoundingBox().getWidth(), (float) word.getBoundingBox().getHeight());
                Text text = new Text(word.getText()).setFontSize((float) word.getBoundingBox().getHeight());
                text.setProperty(Property.FONT_COLOR, invisibleColor);
                text.setProperty(Property.STROKE_COLOR, invisibleColor);
                new Canvas(new PdfCanvas(pdfDocument.getFirstPage()), pdfDocument, rect).add(new Paragraph(text));
            }

            pdfDocument.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}