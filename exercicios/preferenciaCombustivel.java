import java.util.Scanner;

public class preferenciaCombustivel {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o tipo de combustivel: 1 - Alcool, 2 - Gasolina, 3 - Diesel, 4 - Fim");
        int combustivel = sc.nextInt();

        while(combustivel != 4){
            if (combustivel != 1 && combustivel != 2 && combustivel != 3) {
                    System.out.println("Digite o tipo de combustivel: 1 - Alcool, 2 - Gasolina, 3 - Diesel, 4 - Fim");
                    System.out.println("Digite um valor valido");
                    combustivel = sc.nextInt();
            }
            if (combustivel == 1) {
                alcool++;
            }
            else if (combustivel == 2) {
                gasolina++;
            }
            else if (combustivel == 3) {
                diesel++;
            }
            System.out.println("Digite o tipo de combustivel: 1 - Alcool, 2 - Gasolina, 3 - Diesel, 4 - Fim");
            combustivel = sc.nextInt();
        }


        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);

        sc.close();
        
    }
}