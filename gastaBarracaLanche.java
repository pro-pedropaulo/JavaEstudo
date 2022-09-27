import java.util.Scanner;

public class gastaBarracaLanche {
    public static void main(String[] args) throws Exception {

        System.out.println("Codigo   Especificação   Preço");
        System.out.println("1        Cachorro Quente R$ 4,00");
        System.out.println("2        X-Salada        R$ 4,50");
        System.out.println("3        X-Bacon         R$ 5,00");
        System.out.println("4        Torrada Simples R$ 2,00");
        System.out.println("5        Refrigerante    R$ 1,50");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do produto: ");
        int codigo = sc.nextInt();
        System.out.println("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        float valorFinal = 0;

        if (codigo == 1) {
            valorFinal = 4 * quantidade;
            System.out.printf("O valor final é: R$ %.2f", valorFinal);
        } else if (codigo == 2) {
            valorFinal = 4.5f * quantidade;
            System.out.printf("O valor final é: R$ %.2f", valorFinal);
        } else if (codigo == 3) {
            valorFinal = 5 * quantidade;
            System.out.printf("O valor final é: R$ %.2f", valorFinal);
        } else if (codigo == 4) {
            valorFinal = 2 * quantidade;
            System.out.printf("O valor final é: R$ %.2f", valorFinal);
        } else if (codigo == 5) {
            valorFinal = 1.5f * quantidade;
            System.out.printf("O valor final é: R$ %.2f", valorFinal);
        }

        sc.close();
    }
    
}