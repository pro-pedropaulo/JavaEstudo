package application;

import java.util.Locale;
import java.util.Scanner;

import negocios.Dolar;

public class staticCompraDolar {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor do dolar: " + String.format("%.2f", Dolar.valorDolar));
        System.out.println("quantos dolares voce quer comprar?");
        double quantidadeDolar = sc.nextDouble();
        if (quantidadeDolar > 0) {
            double valorTotal = Dolar.compraDolar(quantidadeDolar);
            System.out.printf("Valor a ser pago em reais: %.2f%n", valorTotal);
        } else {
            System.out.println("Valor invalido");
        }



        sc.close();
    }
    
}