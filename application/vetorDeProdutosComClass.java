package application;

import java.util.Locale;
import java.util.Scanner;
import negocios.vetorProdutos;

public class vetorDeProdutosComClass {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("entre com a quantidade de produtos: ");
        int n = sc.nextInt();

        vetorProdutos[] vect = new vetorProdutos[n];
        double soma = 0.0;
        double media = 0.0;




        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.println("entre com o nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.println("entre com o preço do produto: ");
            double precoProduto = sc.nextDouble();
            vect[i] = new vetorProdutos(nomeProduto, precoProduto);
            soma = soma + vect[i].getPrecoProduto();
            media = soma / n;

        }

        System.out.printf("A média dos preços é: %.2f%n", media);


        sc.close();



    }
}
