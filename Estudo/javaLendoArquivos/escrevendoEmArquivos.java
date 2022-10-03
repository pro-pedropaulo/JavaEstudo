package javaLendoArquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class escrevendoEmArquivos {
    public static void main(String[] args) {

        String [] linhasEscritas = new String[] {"Pedro", "Barros", "Correia"};

        String caminho = "E:\\arquivoCriado.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {

            for(String linha : linhasEscritas) {
                bw.write(linha);
                bw.newLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}