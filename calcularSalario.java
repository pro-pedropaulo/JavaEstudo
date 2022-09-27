import java.util.Scanner;
import java.util.Locale;

public class calcularSalario {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        Double salarioPorDia = 250.00;
        Double diasTrabalhados = 20.00;
        Double salarioFinal = (salarioPorDia * diasTrabalhados);

        System.out.println("O salario final do funcionario " + nome + " é: R$ "
        + String.format("%.2f", salarioFinal));
        
        sc.close();
    }
    
}