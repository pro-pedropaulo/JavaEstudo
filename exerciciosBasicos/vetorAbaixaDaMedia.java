import java.util.Scanner;
import java.util.Locale;

public class vetorAbaixaDaMedia {

     public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         System.out.print("Digite a quantidade de posições do vetor: ");
         int n = sc.nextInt();
         double[] vetormMedia = new double [n];
         double soma = 0;
         double media = 0.0;

         for (int i = 0; i < vetormMedia.length; i++) {
             System.out.print("Digite o valor da posição " + i + ": ");
             vetormMedia[i] = sc.nextDouble();
             soma += vetormMedia[i];
         }
         media = soma / vetormMedia.length;
         System.out.println("A média é: " + media);
         System.out.println("Os valores abaixo da média: ");
         for (int i = 0; i < vetormMedia.length; i++) {
                if (vetormMedia[i] < media) {
                    System.out.println(vetormMedia[i]);
                }
            }









         sc.close();

}
}
