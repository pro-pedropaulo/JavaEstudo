package application;

import java.util.Locale;
import java.util.Scanner;
import negocios.banco;

public class exemploBancoOO {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        banco conta = new banco();

        System.out.println("Entre com o nome do cliente: ");
        String nomeT = sc.nextLine();
        System.out.println("Entre com o numero da conta: ");
        String numeroContaT = sc.nextLine();
        System.out.println("Voce deseja fazer um deposito inicial? (s/n)");
        String resposta = sc.nextLine().toLowerCase();
        // se a resposta a primeira letra for s, entao ele vai fazer o deposito inicial
        if (resposta.charAt(0) == 's') {
            System.out.println("Entre com o valor do deposito inicial: ");
            double valorDepositoInicial = sc.nextDouble();
            conta = new banco(nomeT, numeroContaT, valorDepositoInicial);
        } else {
            conta = new banco(nomeT, numeroContaT);
        }

        System.out.printf("Dados da conta: %nNome: %s%nNumero da conta: %s%nSaldo: %.2f%n", conta.getNome(),
                conta.getNumeroConta(), conta.getValorSaldoIncial());
        
        System.out.println("");
        System.out.println("Entre com o valor do deposito: ");
        double valorDepositoT = sc.nextDouble();
        conta.deposito(valorDepositoT);
        System.out.printf("Dados da conta atualizados: %nNome: %s%nNumero da conta: %s%nSaldo: %.2f%n", conta.getNome(),
                conta.getNumeroConta(), conta.getValorSaldoIncial());
        System.out.println("");
        System.out.println("Entre com o valor do saque: ");
        double valorSaqueT = sc.nextDouble();
        conta.saque(valorSaqueT);
        System.out.println(conta); // exibindo com o toString ao inves de usar o printf

        

        



        sc.close();
        
    }

    
}