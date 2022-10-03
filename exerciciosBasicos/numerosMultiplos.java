import java.util.Scanner;

public class numerosMultiplos {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.printf("os numeros %d e %d são multiplos\n", numero1, numero2);
        } else {
            System.out.printf("os numeros %d e %d não são multiplos\n", numero1, numero2);
        }

        sc.close();
    }
    
}