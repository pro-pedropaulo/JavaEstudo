package com.ebravo.util.ocr;

public class App {
    public static void main(String[] args) {
        String inputFolderPath = "C:\\testeImagem\\";
        String outputPdfPath = "C:\\testeImagem\\output.pdf";
        int psmValue = 6;

        OcrPdfGenerator ocrPdfGenerator = new OcrPdfGenerator();
        ocrPdfGenerator.generatePdf(inputFolderPath, outputPdfPath, psmValue);
    }
}
