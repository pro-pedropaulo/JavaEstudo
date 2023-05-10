package com.meu.projeto;

public class App {
    public static void main(String[] args) {
        String inputFolderPath = "C:\\testeImagem\\";
        String outputPdfPath = "C:\\testeImagem\\output.pdf";

        OcrPdfGenerator ocrPdfGenerator = new OcrPdfGenerator();
        ocrPdfGenerator.generatePdf(inputFolderPath, outputPdfPath);
    }
}
