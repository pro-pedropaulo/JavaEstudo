import java.util.Locale;
import java.util.Scanner;

public class calcularTriangulo {

    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite os dados do triangulo X: ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double x3 = sc.nextDouble();

        System.out.println("digite os dados do triangulo Y: ");
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double y3 = sc.nextDouble();



        double calculoX = (x1 + x2 + x3) / 2;
        double calculoY = (y1 + y2 + y3) / 2;

        double area = Math.sqrt(calculoX * (calculoX - x1) * (calculoX - x2) * (calculoX - x3));
        double area2 = Math.sqrt(calculoY * (calculoY - y1) * (calculoY - y2) * (calculoY - y3));

        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("AREA = %.4f%n", area2);

        if (area > area2) {
            System.out.println("A area do triangulo X é maior");
        } else {
            System.out.println("A area do triangulo Y é maior");
        }

        sc.close();
    }
    
}