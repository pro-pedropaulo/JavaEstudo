package negocios;

public class vetorProdutos {
    private String nomeProduto;
    private double precoProduto;

    public vetorProdutos(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String toString() {
        return nomeProduto + ", " + String.format("%.2f", precoProduto);
    }





}
