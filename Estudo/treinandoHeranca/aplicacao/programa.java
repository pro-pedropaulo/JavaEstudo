package treinandoHeranca.aplicacao;

import treinandoHeranca.utilitarios.Conta;
import treinandoHeranca.utilitarios.Poupanca;
import treinandoHeranca.utilitarios.contaEmpresarial;

public class programa {
    public static void main(String[] args) {

        Conta contaPessoal1 = new Conta(001, "Pedro", 0.0);
        contaEmpresarial contaE1 = new contaEmpresarial(002, "Tinta", 0.0, 1000.0);
        // upccasting //
        Conta contaPessoal2 = contaE1;
        Conta contaPessoal3 = new contaEmpresarial(003, "Maria", 0.0, 1000.0);
        Conta contaPoupanca1 = new Poupanca(004, "Alex", 0.0, 0.01);

        // downcasting //
        contaEmpresarial contaE2 = (contaEmpresarial) contaPessoal3;

        if (contaPoupanca1 instanceof contaEmpresarial) {
            contaEmpresarial contaE4 = (contaEmpresarial) contaPoupanca1;
            contaE4.emprestimo(100.0);
            System.out.println("Emprestimo!");
        }
        if (contaPoupanca1 instanceof Poupanca) {
            Poupanca contaPoupanca2 = (Poupanca) contaPoupanca1;
            contaPoupanca2.atualizarSaldo();
            System.out.println("Atualizado!");
        }

        Conta contaPedro  = new Conta(001, "Pedro", 200.0);
        Conta contaRenata = new Conta(002, "Renata", 400.0);
        Conta contaPedroPoupanca = new Poupanca(003, "Pedro", 50.0, 0.01);
        contaEmpresarial contaMahle = new contaEmpresarial(003, "Mahle", 14000.0, 1000.0);
        Poupanca contaPoupancaAlex = new Poupanca(004, "Alex", 1000.0, 0.01);
        contaPedro.saque(50.0);
        System.out.println(contaPedro.getValor());
        contaPoupancaAlex.saque(100.0);
        System.out.println(contaPoupancaAlex.getValor());
        contaPoupancaAlex.atualizarSaldo();
        System.out.println(contaPoupancaAlex.getValor());
        contaMahle.saque(1000.0);
        System.out.println(contaMahle.getValor());
        contaMahle.emprestimo(1000.0);
        System.out.println(contaMahle.getValor());
        contaPedro.transferencia(contaRenata, 45.0);
        System.out.println(contaPedro.getValor());
        System.out.println(contaRenata.getValor());
        System.out.println(contaPedroPoupanca.getValor());



    }
}

