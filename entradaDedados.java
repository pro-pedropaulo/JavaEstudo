import java.util.Locale;
import java.util.Scanner;

public class entradaDedados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String digitaNome;
        Float digitaNumero;
        char pegaPrimeiraLetra;
        char pegarPrimeiraLetraDoNome;

        digitaNome = sc.nextLine();
        digitaNumero = sc.nextFloat();
        pegaPrimeiraLetra = sc.next().charAt(0);  
        pegarPrimeiraLetraDoNome = digitaNome.charAt(0);


        System.out.println("o seu nome é: " + digitaNome + " e o seu numero é: " + digitaNumero);
        System.out.println("a letra digitada foi " + pegaPrimeiraLetra);
        System.out.println("a primeira letra do seu nome é: " + pegarPrimeiraLetraDoNome);
        sc.close();
    }
    
}