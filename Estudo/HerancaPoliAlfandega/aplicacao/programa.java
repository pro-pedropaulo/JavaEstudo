package HerancaPoliAlfandega.aplicacao;

import HerancaPoliAlfandega.utilitarios.produto;
import HerancaPoliAlfandega.utilitarios.produtoImportado;
import HerancaPoliAlfandega.utilitarios.produtoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class programa {
    public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Entre com o numero de produtos: ");
    int n = sc.nextInt();
    List<produto> listaDeProdutos = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
        System.out.println("Produto #" + i + " dados: ");
        System.out.println("Comum, usado ou importado (c/u/i)? ");
        char tipo = sc.next().charAt(0);
        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Preco: ");
        double preco = sc.nextDouble();
        if (tipo == 'i') {
            System.out.print("Taxa alfandega: ");
            double taxaAlfandega = sc.nextDouble();
            produtoImportado produtoCriado  = new produtoImportado(nome, preco, taxaAlfandega);
            listaDeProdutos.add(produtoCriado);
        } else if (tipo == 'u') {
            System.out.print("Data de fabricação (DD/MM/AAAA): ");
            Date dataFabricacao = dataFormatada.parse(sc.next());
            produtoUsado produtoCriado = new produtoUsado(nome, preco, dataFabricacao);
            listaDeProdutos.add(produtoCriado);
        } else {
            produto produtoCriado = new produto(nome, preco);
            listaDeProdutos.add(produtoCriado);
        }

    }
    System.out.println();
    System.out.println("Etiquetas de preço: ");
    for (produto produto : listaDeProdutos) {
        System.out.println(produto.etiquetaPreco());
    }


    sc.close();
}
}
