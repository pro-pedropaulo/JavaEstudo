package negocios;

public class store {
    private Integer id;
    private String nome;
    private Double preco;
    private Integer quantidade;

    public store(Integer id, String nome, Double preco, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public int aumentarQuantidade(int quantidade) {
        return this.quantidade += quantidade;
    }
    public double valorTotalEmEstoque() {
        return this.quantidade * this.preco;
    }

     public String toString() {
        return "O Produto com o codigo" + this.id + " do nome "
                + this.nome +
                ", custa por Unidade R$ " + String.format("%.2f", this.preco) + ",  há no estoque "
                + this.quantidade + " unidades, Totalizando: R$ " + String.format("%.2f", valorTotalEmEstoque());
     }
}

