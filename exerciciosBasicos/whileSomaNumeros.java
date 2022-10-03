import java.util.Scanner;

public class whileSomaNumeros {
     public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numeroDigitado = sc.nextInt();
        int soma = 0;
        int quantidadeNumerosDigitados = 0;
        boolean primeiraTentativa = false;
        if (numeroDigitado == 0 && quantidadeNumerosDigitados == 0) {
            System.out.println("Você digitou 0 na primeira tentativa");
            primeiraTentativa = true;
        }
        
        while (numeroDigitado != 0) {
        		quantidadeNumerosDigitados++;
                soma += numeroDigitado;
                numeroDigitado = sc.nextInt();
        }
        if (primeiraTentativa == false) {
            System.out.println("foram digitados " + quantidadeNumerosDigitados + " numeros até voce digitar o 0 a soma dos numeros digitados foram: " + soma);
        }
        



        sc.close();

    }
}