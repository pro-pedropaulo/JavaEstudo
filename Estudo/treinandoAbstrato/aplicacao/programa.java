package treinandoAbstrato.aplicacao;

import treinandoAbstrato.entidades.forma;
import treinandoAbstrato.entidades.retangulo;
import treinandoAbstrato.entidades.circulo;
import treinandoAbstrato.enumeracao.CorEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas formas você quer digitar?");
        int n = sc.nextInt();
        List<forma> formasLista = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            System.out.println("Forma #" + i + " dados:");
            System.out.print("Retângulo ou Círculo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            String cor = sc.next();
            if (ch == 'r') {
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                forma retangulo = new retangulo(largura, altura, CorEnum.valueOf(cor));
                formasLista.add(retangulo);
            }
            else {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                forma circulo = new circulo(raio, CorEnum.valueOf(cor));
                formasLista.add(circulo);
            }
        }
        System.out.println();
        System.out.println("Áreas das formas:");
        for (forma formasDigitadas : formasLista) {
            System.out.println(String.format("%.2f", formasDigitadas.area()));
        }




        sc.close();

}
}
