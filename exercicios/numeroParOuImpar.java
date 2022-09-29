import java.util.Scanner;

public class numeroParOuImpar {

    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    
    int numero = sc.nextInt();

    if(numero % 2 == 0) {
        System.out.printf("o numero %d é par\n", numero);
    } else {
        System.out.printf("o numero %d é impar\n", numero);
    }


    sc.close();
}
}