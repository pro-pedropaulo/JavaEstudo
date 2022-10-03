package negocios;

public class estoque {
    public String nome;
    public int quantidade = 10;
    public double preco = 1000;

    public double valorTotalEmEstoque() {
        double valor = quantidade * preco;
        return valor;
    }
    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }
    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }
    public String toString() {
        return "o produto " + nome + ", tem " + quantidade + " unidades no estoque, Total do valor: R$ " + String.format("%.2f", valorTotalEmEstoque());
    } 
}