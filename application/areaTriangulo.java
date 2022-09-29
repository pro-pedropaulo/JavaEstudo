package application;

import java.util.Locale;
import java.util.Scanner;

import negocios.triangulo;

public class areaTriangulo {

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




        double areaX = x.areaDoTriangulo();
        double areaY = y.areaDoTriangulo();

        System.out.printf("AREA = %.4f%n", areaX);
        System.out.printf("AREA = %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A area do triangulo X é maior");
        } else {
            System.out.println("A area do triangulo Y é maior");
        }

        sc.close();
    }
    
}
