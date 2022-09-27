package application;

import java.util.Locale;
import java.util.Scanner;

import negocios.impostoSalario;

public class calcularImpostoOO {
    
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        impostoSalario updateSalary = new impostoSalario();

        System.out.println("Nome: ");
        updateSalary.nome = sc.nextLine();

        System.out.println("Salario bruto: ");
        updateSalary.salarioBruto = sc.nextDouble();

        System.out.println("Imposto: ");
        updateSalary.imposto = sc.nextDouble();

        System.out.println("Empregado: " + updateSalary.nome + ", Recebe R$ " + updateSalary.salarioLiquido());

        System.out.println("Digite a porcentagem para aumentar o salario: ");
        updateSalary.porcentagem = sc.nextDouble();

        System.out.println(updateSalary);







        sc.close();
    }
}