package contaExcessao.modulo.entidades;

import contaExcessao.modulo.excessoes.domainExceptions;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(Double valor) {
        saldo += valor;
    }

    public void saque(Double valor) {
        if (valor > limiteSaque) {
            throw new domainExceptions("O valor excede o limite de saque");
        }
        if (valor > saldo) {
            throw new domainExceptions("Saldo insuficiente");
        }
        saldo -= valor;
    }
}
