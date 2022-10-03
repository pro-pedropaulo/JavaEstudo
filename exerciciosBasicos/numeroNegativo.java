import java.util.Scanner;

public class numeroNegativo {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();
        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }
}