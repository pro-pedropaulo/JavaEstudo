package application;

import java.util.Locale;
import java.util.Scanner;

import negocios.triangulo;

public class calcularTriangulo {

    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("digite os dados do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("digite os dados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        



        double calculoX = (x.a + x.b + x.c) / 2;
        double calculoY = (y.a + y.b + y.c) / 2;

        double area = Math.sqrt(calculoX * (calculoX - x.a) * (calculoX - x.b) * (calculoX - x.c));
        double area2 = Math.sqrt(calculoY * (calculoY - y.a) * (calculoY - y.b) * (calculoY - y.c));

        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("AREA = %.4f%n", area2);

        if (area > area2) {
            System.out.println("A area do triangulo X é maior");
        } else {
            System.out.println("A area do triangulo Y é maior");
        }

        sc.close();
    }
    
}
