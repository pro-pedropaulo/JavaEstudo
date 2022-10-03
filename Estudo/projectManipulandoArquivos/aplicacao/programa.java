package projectManipulandoArquivos.aplicacao;

import projectManipulandoArquivos.entidades.produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<produto> lista = new ArrayList<>();

        System.out.println("Entre com o caminho do arquivo: ");
        String strPastaCaminho = sc.nextLine();

        File caminho = new File(strPastaCaminho);
        String strCaminhoPasta = caminho.getParent();

        boolean sucesso = new File(strCaminhoPasta + "\\out").mkdir();

        String strCaminhoArquivo = strCaminhoPasta + "\\out\\summary.csv";

        try(BufferedReader bf = new BufferedReader(new FileReader(strCaminhoArquivo))) {
            String itemCsv = bf.readLine();
            while (itemCsv != null) {
                String[] campos = itemCsv.split(",");
                String nome = campos[0];
                Double preco = Double.parseDouble(campos[1]);
                Integer quantidade = Integer.parseInt(campos[2]);

                lista.add(new produto(nome, preco, quantidade));
                itemCsv = bf.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(strCaminhoArquivo))) {
                for (produto item : lista) {
                    bw.write(item.getNome() + "," + String.format("%.2f", item.valorTotal()));
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }


        sc.close();
    }

}
