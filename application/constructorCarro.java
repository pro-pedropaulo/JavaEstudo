package application;

import java.util.Locale;
import java.util.Scanner;

import negocios.carro;

public class constructorCarro {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String marcaT = sc.nextLine();
        String corT = sc.nextLine();
        int anoT = sc.nextInt();
        int portasT = sc.nextInt();
        double valorT = sc.nextDouble();

        // praticamente o mesmo que o de cima, mas com o construtor
        carro novoCarro = new carro();
        novoCarro.modelo = sc.nextLine();
        novoCarro.cor = sc.nextLine();
        sc.nextLine();
        novoCarro.ano = sc.nextInt();
        novoCarro.portas = sc.nextInt();
        novoCarro.valor = sc.nextDouble();

        carro carro1 = new carro("Gol", "Preto", 2010, 4, 25000.00);
        carro carro2 = new carro("Celta", "Branco", 2015, 4, 35000.00);
        carro Carro3 = new carro(marcaT, corT, anoT, portasT, valorT);

        System.out.println("Carro 1: " + carro1.modelo + " " + carro1.cor + " " + carro1.ano + " " + carro1.portas + " " + carro1.valor);
        System.out.println("Carro 2: " + carro2.modelo + " " + carro2.cor + " " + carro2.ano + " " + carro2.portas + " " + carro2.valor);
        System.out.println("Carro 3: " + Carro3.modelo + " " + Carro3.cor + " " + Carro3.ano + " " + Carro3.portas + " " + Carro3.valor);
        System.out.println("Carro 4: " + novoCarro.modelo + " " + novoCarro.cor + " " + novoCarro.ano + " " + novoCarro.portas + " " + novoCarro.valor);

        sc.close();
    }
    
}