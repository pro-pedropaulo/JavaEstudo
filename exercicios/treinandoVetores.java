import java.util.Locale;
import java.util.Scanner;


public class treinandoVetores {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double[] vetor = new double[5];
            System.out.println("Qual o tamanho do vetor?");
            double n = sc.nextInt();
            double soma = 0;
            double media = 0;

            for (int i = 0; i < n; i++) {
                System.out.printf("Digite um valor para a posição %d:%n ", i);
                vetor[i] = sc.nextDouble();
                soma += vetor[i];
                media = soma / n;
            }

            System.out.printf("A soma dos valores é: %.2f%n", soma);
            System.out.printf("A média dos valores é: %.2f%n", media);

            sc.close();



        }

}
