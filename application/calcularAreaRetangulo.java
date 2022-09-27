package application;

import java.util.Scanner;
import java.util.Locale;
import negocios.retangulo;

public class calcularAreaRetangulo {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        retangulo dadosRetangulo;
        dadosRetangulo = new retangulo();
        System.out.println("Digite a altura do retangulo: ");
        dadosRetangulo.a = sc.nextInt();
        System.out.println("Digite a largura do retangulo: ");
        dadosRetangulo.b = sc.nextInt();

        System.out.println(dadosRetangulo);
        sc.close();

    }
    
}