package javaLendoArquivos;

import java.io.File;
import java.util.Scanner;

public class manipulandoArquivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do caminho: ");
        String strCaminho = sc.nextLine();

        File caminho = new File(strCaminho);

        File[] pastas = caminho.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for (File pasta : pastas) {
            System.out.println(pasta);
        }

        File[] arquivos = caminho.listFiles(File::isFile);
        System.out.println("Arquivos: ");
        for (File arquivo : arquivos) {
            System.out.println(arquivo);
        }
        boolean sucesso = new File(strCaminho + "\\subpasta").mkdir();
        System.out.println("Diretório criado com sucesso: " + sucesso);


        sc.close();


}
}
