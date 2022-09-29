import java.util.Locale;
import java.util.Scanner;

public class treinandoMatriz {

     public static void main(String[] args) {

         Locale.setDefault(Locale.US);

         Scanner sc = new Scanner(System.in);
         System.out.println("Digite o numero de linhas e colunas da matriz: ");
         int m = sc.nextInt();
         int NumeorsNegativos = 0;

         int[][] mat = new int[m][m];

            for (int i=0; i<mat.length; i++) {
                for (int j=0; j<mat[i].length; j++) {
                    mat[i][j] = sc.nextInt();
                    if (mat[i][j] < 0) {
                        NumeorsNegativos++;
                    }
                }
            }

            System.out.println("Diagonal Principal: ");
            for (int i=0; i<mat.length; i++) {
                System.out.print(mat[i][i] + " ");
            }
            System.out.println();
            System.out.println("Numeros negativos: " + NumeorsNegativos);




         sc.close();


}
}
