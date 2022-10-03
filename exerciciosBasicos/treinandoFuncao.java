import java.util.Scanner;

public class treinandoFuncao {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nome = "Pedro Paulo";
        System.out.println("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        soma(num1, num2);
        subtracao(num1, num2);
        textoDeAniversario(nome);




        sc.close();

    }

    public static void soma(double a, double b) {
        double soma = a + b;
        System.out.println("A soma dos numeros é: " + soma);
    }

    public static void subtracao(double a, double b) {
        double subtracao = a - b;
        System.out.println("A subtracao dos numeros é: " + subtracao);
    }
    public static void textoDeAniversario(String nome) {
        System.out.println("Parabens " + nome + " hoje é seu aniversario");
    }
    
}