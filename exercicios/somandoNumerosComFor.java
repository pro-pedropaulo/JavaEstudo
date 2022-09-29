import java.util.Locale;
import java.util.Scanner;

public class somandoNumerosComFor {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidadeDeNumeros = sc.nextInt();
        int numero = 0;
        double soma = 0;
        double media = 0;

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            numero = sc.nextInt();
            soma += numero;
            media = soma / quantidadeDeNumeros;
        }

        System.out.println("A soma dos numeros é: " + soma);
        System.out.println("A media dos numeros é: " + String.format("%.2f", media));
        


        sc.close();
    }
    
}