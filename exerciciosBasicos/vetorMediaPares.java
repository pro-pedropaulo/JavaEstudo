import java.util.Locale;
import java.util.Scanner;

public class vetorMediaPares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros para analise: ");
        int n = sc.nextInt();
        double[] vetorNumeros = new double[n];

        double soma = 0;
        double media = 0;
        int quantidadePares = 0;

        for(int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Digite o numero: ");
            vetorNumeros[i] = sc.nextDouble();
            if (vetorNumeros[i] % 2 == 0) {
                quantidadePares++;
                soma += vetorNumeros[i];
            }
        }
        if (quantidadePares == 0) {
            System.out.println("Nenhum numero par foi digitado");
        } else {
            media = soma / quantidadePares;
            System.out.printf("A media dos numeros pares e: %.2f", media);
        }


        sc.close();

}
}
