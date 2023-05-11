package com.ebravo.util.ocr;

import java.io.File;
import java.util.Comparator;

public class FileSorter implements Comparator<File> {

    @Override
    public int compare(File f1, File f2){
        int n1 = extractNumber(f1.getName());
        int n2 = extractNumber(f2.getName());
        return n1 - n2;
    }

    private int extractNumber(String name){
        int i = 0;
        try{
            String number = name.replaceAll("\\D", "");  // Remove todos os caracteres não-dígitos
            i = Integer.parseInt(number);
        } catch(Exception e){
            i = 0; // Se ocorrer algum problema, atribua 0
        }
        return i;
    }
}
