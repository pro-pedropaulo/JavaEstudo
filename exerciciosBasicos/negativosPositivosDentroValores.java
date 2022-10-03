import java.util.Scanner;

public class negativosPositivosDentroValores {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        int quantidadeDeNumeros = sc.nextInt();
        int numero = 0;
        int positivos = 0;
        int negativos = 0;
        int dentroDoIntervalo = 0;
        int soma = 0;

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            if (numero > 0) {
                positivos++;
                soma += numero;
            } 
            else {
                negativos++;
            }
            if (numero >= 10 && numero <= 20) {
                dentroDoIntervalo++;
            }
        }  

        System.out.printf("foram digitados %d numeros positivos%n", positivos);
        System.out.printf("foram digitados %d numeros negativos%n", negativos);
        System.out.printf("foram digitados %d numeros dentro do intervalo de [10, 20]%n", dentroDoIntervalo);
        System.out.printf("a soma dos numeros positivos é: %d%n", soma);

        sc.close();
    }
    
}