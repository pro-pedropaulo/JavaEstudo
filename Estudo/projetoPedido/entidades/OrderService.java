package projetoPedido.entidades;

public class OrderService {
    private Integer quantidade;
    private Double preco;

    private Product product;

    public OrderService() {
    }

    public OrderService(Integer Quantidade, Double preco, Product product) {
        this.quantidade = Quantidade;
        this.preco = preco;
        this.product = product;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    Double subTotal(){
        return preco * quantidade;
    }
    public String toString(){
        return getProduct().getNome()
                + ", $"
                + String.format("%.2f", preco)
                + ", Quantity: "
                + quantidade
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
