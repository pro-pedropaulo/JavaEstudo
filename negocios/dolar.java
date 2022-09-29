package negocios;

public class Dolar {

    public static double valorDolar = 5.10; {

    }

    public static final double IOF = 0.06; {

    }
    public static double compraDolar(double quantidadeDolar) {
        return quantidadeDolar * valorDolar * (1.0 + IOF);
    }
    
}