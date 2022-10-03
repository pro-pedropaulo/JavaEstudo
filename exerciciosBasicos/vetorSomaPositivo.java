import java.util.Locale;
import java.util.Scanner;

public class vetorSomaPositivo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vetorNumeros = new double[n];
        double soma = 0;

        for(int i = 0; i < vetorNumeros.length; i++) {
            System.out.print("Digite um numero: ");
            vetorNumeros[i] = sc.nextDouble();
            if(vetorNumeros[i] > 0) {
                soma += vetorNumeros[i];
            } else {
                System.out.println("Numero negativo, nao sera somado");
            }
        }

        System.out.printf("SOMA DOS POSITIVOS = %.2f", soma);

        sc.close();
}
}
