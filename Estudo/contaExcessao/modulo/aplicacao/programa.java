package contaExcessao.modulo.aplicacao;

import contaExcessao.modulo.entidades.Conta;
import contaExcessao.modulo.excessoes.domainExceptions;

import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    try {
        System.out.println("Entre com os dados da conta");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double limiteSaque = sc.nextDouble();
        Conta contaUsuario = new Conta(numero, titular, saldo, limiteSaque);

        System.out.println();
        System.out.print("Entre com o valor do saque: ");
        double valorSaque = sc.nextDouble();
        contaUsuario.saque(valorSaque);
        System.out.println("Novo saldo: " + contaUsuario.getSaldo());
    }
    catch (domainExceptions e) {
        System.out.println("Erro na conta: " + e.getMessage());
    }
    catch (RuntimeException e) {
        System.out.println("Erro inesperado");
    }


        sc.close();
    }
}
