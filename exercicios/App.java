
import java.util.Locale;



public class App {
    public static void main(String[] args) throws Exception {
        
        int idade = 25;
        String nome = "Pedro Paulo";
        double altura = 1.79;
        char sexo = 'M';
        boolean casado = true;
        double valorAleatorio = 1.436854;

        Locale.setDefault(Locale.US);

        System.out.println("Idade: " + idade + " anos");
        System.out.println("Valor Aleatorio: " + String.format("%.2f", valorAleatorio));
        System.out.printf("Valor Aleatorio: %.2f%n", valorAleatorio);
        System.out.printf("O valor Aleatorio é : %.4f%n", valorAleatorio);
        System.out.printf("Meu nome é %s, tenho %d anos, %.2f de altura e sou do sexo %c. Casado: %b o valor Aleatorio é %.2f%n", nome, idade, altura, sexo, casado, valorAleatorio);
    
    
    
    }
}
