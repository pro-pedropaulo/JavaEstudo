package HerancaPoliAlfandega.utilitarios;

public class produtoImportado extends produto {
    private double taxaAlfandega;
        public produtoImportado() {
            super();
        }

        public produtoImportado(String nome, double preco, double taxaAlfandega) {
            super(nome, preco);
            this.taxaAlfandega = taxaAlfandega;
        }

        public double getTaxaAlfandega() {
            return taxaAlfandega;
        }

        public void setTaxaAlfandega(double taxaAlfandega) {
            this.taxaAlfandega = taxaAlfandega;
        }

        public double precoTotal() {
            return getPreco() + taxaAlfandega;
        }

        public String etiquetaPreco() {
            return getNome() + " $ " +
                    String.format("%.2f", precoTotal()) +
                    " (Taxa alfandega: $ " +
                    String.format("%.2f", taxaAlfandega) + ")";
        }
}
