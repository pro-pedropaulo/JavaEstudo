package application;

import java.util.Locale;

import negocios.Pi;

public class staticPi {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        int Radio = 3;

        double circunferencia = Pi.circunferencia(Radio);
        double volume = Pi.volume(Radio);

        System.out.printf("Circunferencia: %.2f%n", circunferencia);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("Valor de PI: %.2f%n", Pi.PI);

    }
    
}