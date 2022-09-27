package negocios;

public class banco {
    private String nome;
    private String numeroConta;
    private double valorSaldoIncial;

    public banco(String nome, String numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public banco(String nome, String numeroConta, double valorSaldoIncial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        deposito(valorSaldoIncial);
    }

    public banco () {

    }


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public double getValorSaldoIncial() {
		return valorSaldoIncial;
	}

	public void setValorSaldoIncial(double valorSaldoIncial) {
		this.valorSaldoIncial = valorSaldoIncial;
	}

    public void deposito(double valorDeposito) {
        if (valorDeposito > 0) {
            this.valorSaldoIncial += valorDeposito;
        }
    }
    
    public void saque(double valorSaque) {
        if (valorSaque > this.valorSaldoIncial) {
            System.out.println("Saldo insuficiente");
        } else {
            this.valorSaldoIncial -= valorSaque + 5;
        }

    }
    public String toString() {
        return "Nome: " + this.nome + " Numero da conta: " + this.numeroConta + " Saldo: " + this.valorSaldoIncial;
    }
}