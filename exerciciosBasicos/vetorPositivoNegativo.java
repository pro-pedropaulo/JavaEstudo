import java.util.Scanner;

public class vetorPositivoNegativo {

     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Digite a quantidade de numeros para analise: ");
         int n = sc.nextInt();
         int[] vetorNumeros = new int[n];
         int positivo = 0;
         int negativo = 0;

            for (int i = 0; i < n; i++) {
                System.out.println("Digite o numero: ");
                vetorNumeros[i] = sc.nextInt();
                if (vetorNumeros[i] > 10) {
                    System.out.println("numero maior que 10 o valor sera ignorado");
                } else if (vetorNumeros[i] > 0) {
                    positivo++;
                } else if (vetorNumeros[i] < 0) {
                    negativo++;
                }
            }

            System.out.println("Quantidade de numeros positivos: " + positivo);
            System.out.println("Quantidade de numeros negativos: " + negativo);


         sc.close();

}
}
