package treinandoAbstrato.entidades;

import treinandoAbstrato.enumeracao.CorEnum;

public class retangulo extends forma {
    private double largura;
    private double altura;


        public retangulo() {
        super();
        }

        public retangulo(double largura, double altura, CorEnum cor) {
            super(cor);
            this.largura = largura;
            this.altura = altura;
        }

        public double getLargura() {
            return largura;
        }

        public void setLargura(double largura) {
            this.largura = largura;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        @Override
        public double area() {
            return largura * altura;
        }
}
