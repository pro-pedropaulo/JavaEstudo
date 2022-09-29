package application;

import java.util.Locale;

import negocios.PI;

public class staticPI {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        int Radio = 3;

        double circunferencia = PI.circunferencia(Radio);
        double volume = PI.volume(Radio);

        System.out.printf("Circunferencia: %.2f%n", circunferencia);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("Valor de PI: %.2f%n", PI.PI);

    }
    
}