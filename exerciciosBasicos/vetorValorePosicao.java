import java.util.Locale;
import java.util.Scanner;

public class vetorValorePosicao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        int n = sc.nextInt();
        double[] vetorNumeros = new double[n];
        double maiorValor = 0;
        int posicao = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o numero: ");
            vetorNumeros[i] = sc.nextDouble();
            if (vetorNumeros[i] > maiorValor) {
                maiorValor = vetorNumeros[i];
                posicao = i+1;
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("O maior numero digitado foi o numero: " + posicao);

        sc.close();
}
}
