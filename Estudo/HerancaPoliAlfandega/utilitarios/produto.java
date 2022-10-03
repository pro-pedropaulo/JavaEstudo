package HerancaPoliAlfandega.utilitarios;

public class produto {
    private String nome;
    private Double preco;

    public produto() {
    }

    public produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String etiquetaPreco() {
        return this.nome + " $ " + String.format("%.2f", this.preco);
    }
}
