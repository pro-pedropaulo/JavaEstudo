package application;

import negocios.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class listProductStore {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos: ");
        int n = sc.nextInt();
        List<store> listaLoja = new ArrayList<>();

        int codigoT = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Produto #" + (i + 1) + ":");
            System.out.print("Digite o código do produto: ");
            codigoT = sc.nextInt();
            System.out.println("Digite o nome do produto: ");
            String nomeT = sc.next();
            System.out.println("Digite o preço do produto: ");
            double precoT = sc.nextDouble();
            System.out.println("Digite a quantidade em estoque do produto: ");
            int quantidadeT = sc.nextInt();
            listaLoja.add(new store(codigoT, nomeT, precoT, quantidadeT));
        }
        for (store mostrarLista : listaLoja) {
            System.out.println(mostrarLista);
        }
        System.out.println(" ");
        System.out.println("Voce deseja adicionar produto em estoque? : ");
        String escolha = sc.next().toLowerCase();
        Integer pos = null;

            if (escolha.equals("s")) {
                System.out.println("Digite o código do produto que deseja adicionar: ");
                codigoT = sc.nextInt();
                pos = conferirId(listaLoja, codigoT);
                if (pos == null) {
                    System.out.println("Esse código não existe!");
                } else {
                    System.out.println("Digite a quantidade que deseja adicionar: ");
                    int quantidadeT = sc.nextInt();
                    listaLoja.get(pos).aumentarQuantidade(quantidadeT);

                    System.out.println("Lista atualizada: ");
                    for (store mostrarLista : listaLoja) {
                        System.out.println(mostrarLista);
                }


            }
        }







        sc.close();



    }
    public static Integer conferirId(List<store> listaLoja, int codigoT) {
        for (int i = 0; i < listaLoja.size(); i++) {
            if (listaLoja.get(i).getId() == codigoT) {
                return i;
            }
        }
        return null;
    }
}