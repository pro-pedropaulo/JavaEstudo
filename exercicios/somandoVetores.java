import java.util.Scanner;

public class somandoVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho dos vetores: ");
        int n = sc.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int soma = 0;
        int[] vetorC = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor do vetor A na posição " + i);
            vetorA[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor do vetor B na posição " + i);
            vetorB[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            soma = vetorA[i] + vetorB[i];
            vetorC[i] = soma;
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Vecto B: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor Resultante: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetorC[i] + " ");
        }




        sc.close();


}
}
