package com.meu.projeto;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.xobject.PdfImageXObject;
import com.itextpdf.layout.Canvas;
import com.itextpdf.layout.element.Image;
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
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.List;

import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) {
        try {
            File folder = new File("C:\\testeImagem\\");
            File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".png"));

            if (files == null || files.length == 0) {
                System.out.println("Nenhum arquivo PNG encontrado na pasta.");
                return;
            }

            PdfDocument pdfDocument = new PdfDocument(new PdfWriter("C:\\testeImagem\\output.pdf"));

            // Crie um pool de threads para processamento paralelo
            ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            List<Future<Void>> futures = new ArrayList<>();

            for (File file : files) {
                // Envie tarefas ao ExecutorService
                futures.add(executorService.submit(() -> {
                    processImage(file, pdfDocument);
                    return null;
                }));
            }

            // Aguarde a conclusão de todas as tarefas
            for (Future<Void> future : futures) {
                future.get();
            }

            // Feche o ExecutorService e o PdfDocument
            executorService.shutdown();
            pdfDocument.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processImage(File file, PdfDocument pdfDocument) {
        try {
            // Carregar imagem
            BufferedImage image = ImageIO.read(file);

            // Converter imagem em um objeto PDF
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "png", baos);
            InputStream inputStream = new ByteArrayInputStream(baos.toByteArray());
            PdfImageXObject pdfImageXObject = new PdfImageXObject(ImageDataFactory.create(baos.toByteArray()));

            // Adicionar a imagem ao documento PDF
            PdfPage pdfPage = pdfDocument.addNewPage(new com.itextpdf.kernel.geom.PageSize(image.getWidth(), image.getHeight()));
            PdfCanvas pdfCanvas = new PdfCanvas(pdfPage);
            pdfCanvas.addXObjectAt(pdfImageXObject, 0, 0);

            // Executar OCR na imagem atual
            ITesseract instance = new Tesseract();
            instance.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");
            instance.setLanguage("por");

            // Ajuste o modo de segmentação de páginas para um modo mais rápido
            instance.setTessVariable("tessedit_pageseg_mode", "6");

            List<Word> words = instance.getWords(image, ITessAPI.TessPageIteratorLevel.RIL_WORD);

            // Adicionar o conteúdo OCR como texto invisível nas posições específicas
            TransparentColor invisibleColor = new TransparentColor(new DeviceRgb(0, 0, 0), 0);
            for (Word word : words) {
                float wordHeight = (float) word.getBoundingBox().getHeight();
                Rectangle rect = new Rectangle((float) word.getBoundingBox().getX(), (float) (pdfPage.getPageSize().getHeight() - word.getBoundingBox().getY() - wordHeight), (float) word.getBoundingBox().getWidth(), wordHeight);
                Text text = new Text(word.getText()).setFontSize(wordHeight);
                text.setProperty(Property.FONT_COLOR, invisibleColor);
                text.setProperty(Property.STROKE_COLOR, invisibleColor);
                Paragraph paragraph = new Paragraph(text);
                paragraph.setMarginTop(-wordHeight * -0.35f); // Ajuste a proporção conforme necessário
                paragraph.setFixedLeading(wordHeight);
                paragraph.setMultipliedLeading(0);

                new Canvas(new PdfCanvas(pdfPage), pdfDocument, rect).add(paragraph);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}