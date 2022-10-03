package treinandoHeranca.utilitarios;

public class Poupanca extends Conta {
    public Double taxaJuros;

    public Poupanca() {
        super();
    }

    public Poupanca(Integer numero, String nome, Double valor, Double taxaJuros) {
        super(numero, nome, valor);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    public void atualizarSaldo() {
        valoremConta += valoremConta * taxaJuros;
    }
    @Override
    public void saque(double valor) {
        this.valoremConta -= valor;
    }
}
