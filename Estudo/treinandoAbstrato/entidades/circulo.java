package treinandoAbstrato.entidades;

import treinandoAbstrato.enumeracao.CorEnum;

public class circulo extends forma{
    private double Raio;

    public circulo() {
        super();
    }

    public circulo(double raio, CorEnum cor) {
        super(cor);
        Raio = raio;
    }

    public double getRaio() {
        return Raio;
    }

    public void setRaio(double raio) {
        Raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Raio * Raio;
    }
}
