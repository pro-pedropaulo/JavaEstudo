import java.util.Scanner;

public class diferencaNumeros {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double diferenca = (a * b - c * d);

        System.out.println("A diferença é: = " + diferenca);


        sc.close();
    }
    
}