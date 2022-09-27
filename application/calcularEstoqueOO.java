package application;

import java.util.Locale;
import java.util.Scanner;

import negocios.estoque;

public class calcularEstoqueOO {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        
        estoque dadosEstoque;
        dadosEstoque = new estoque();
        Scanner sc = new Scanner(System.in); 

        System.out.println("Digite o nome do Produto: ");
        dadosEstoque.nome = sc.nextLine();
        System.out.println("Digite a quantidade do produto: ");
        dadosEstoque.quantidade = sc.nextInt();
        System.out.println("Digite o preço do produto: ");
        dadosEstoque.preco = sc.nextDouble();
        System.out.println(dadosEstoque);
        System.out.println("Digite a quantidade de produtos a ser adicionada: ");
        int quantidadeAumentar = sc.nextInt();
        dadosEstoque.adicionarProdutos(quantidadeAumentar);
        System.out.println("foram adicionado " + quantidadeAumentar + " unidades ao estoque de " + dadosEstoque.nome +  " agora temos: " + dadosEstoque.quantidade +
         " unidades o valor total do estoque é: R$ " + String.format("%.2f", dadosEstoque.valorTotalEmEstoque()));
        System.out.println("Digite a quantidade de produtos a ser removida: ");
        int quantidadeRemover = sc.nextInt();
        dadosEstoque.removerProdutos(quantidadeRemover);
        System.out.println("foram removido " + quantidadeRemover + " unidades ao estoque de " + dadosEstoque.nome +  " agora temos: " + dadosEstoque.quantidade +
         " unidades o valor total do estoque é: R$ " + String.format("%.2f", dadosEstoque.valorTotalEmEstoque()));


        sc.close();
    }
    
}