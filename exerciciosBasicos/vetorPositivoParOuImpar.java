import java.util.Locale;
import java.util.Scanner;

public class vetorPositivoParOuImpar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja digitar: ");
        int n = sc.nextInt();

        int[] vetorNumeros = new int[n];
        int[] vetorPar = new int[n];

        int quantidadePar = 0;
        int quantidadeNegativo = 0;

        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numt = sc.nextInt();
            if (numt > 0) {
                if (numt % 2 == 0) {
                    quantidadePar++;
                    vetorNumeros[i] = numt;
                    vetorPar[i] = numt;
                } else {
                    vetorNumeros[i] = numt;
                }
            } else {
                quantidadeNegativo++;
                vetorNumeros[i] = numt;

            }
        }

        System.out.println("Números digitados: ");
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.print(vetorNumeros[i] + " ");
        }
        System.out.println();
        System.out.println("Quantidade de numeros negativos: " + quantidadeNegativo);
        System.out.println("Quantidade de números pares positivos: " + quantidadePar);
        System.out.println("Os números pares foram: ");
        for (int i = 0; i < vetorPar.length; i++) {
            if (vetorPar[i] != 0) {
                System.out.print(vetorPar[i] + " ");
            }
        }


        sc.close();
    }
}
