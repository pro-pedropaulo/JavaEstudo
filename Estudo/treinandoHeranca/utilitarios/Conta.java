package treinandoHeranca.utilitarios;

public class Conta {
    private Integer numero;
    private String nome;
    protected Double valoremConta;

    public Conta() {

    }

    public Conta(Integer numero, String nome, Double valor) {
        this.numero = numero;
        this.nome = nome;
        this.valoremConta = valor;
    }

    public Conta(int numero, String titular, double saldo, double limiteSaque) {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valoremConta;
    }

    public void setValor(Double valor) {
        this.valoremConta = valor;
    }
    public void deposito(double valor) {
        this.valoremConta += valor;
    }
    public void saque(double valor) {
        this.valoremConta -= valor + 5.0;
    }
    public void saqueTransferencia(double valor) {
        this.valoremConta -= valor;
    }
    public void transferencia(Conta destino, double valor) {
        this.saqueTransferencia(valor);
        destino.deposito(valor);
    }
}
