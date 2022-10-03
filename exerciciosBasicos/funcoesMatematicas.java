public class funcoesMatematicas {

     public static void main(String[] args) throws Exception {

        double menorNumero = Math.min(10, 30);
        double a = 3.0;
        double potencia = 2.0;
        double negativo = -20.0;

        System.out.println("o menor numero é: " + menorNumero);
        System.out.println(Math.sqrt(a));
        System.out.printf("a potencia de %.2f é: %.2f\n", a, Math.pow(a, potencia));
        System.out.printf("o valor absoluto de %.2f é: %.2f", negativo, Math.abs(negativo));
     }

}