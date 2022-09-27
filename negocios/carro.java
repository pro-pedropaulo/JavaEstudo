package negocios;

public class carro {
    public String modelo;
    public String cor;
    public int ano;
    public int portas;
    public double valor;

    public carro(String modelo, String cor, int ano, int portas , double valor) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.portas = portas;
        this.valor = valor;
    }

    public carro() {
    }
}