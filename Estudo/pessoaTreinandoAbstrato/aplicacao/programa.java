package pessoaTreinandoAbstrato.aplicacao;

import pessoaTreinandoAbstrato.entidades.pessoa;
import pessoaTreinandoAbstrato.entidades.pessoaFisica;
import pessoaTreinandoAbstrato.entidades.pessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {;
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o numero total de pessoas: ");
        int n = sc.nextInt();
        List<pessoa> listaDePessoas = new ArrayList<>();
        double soma = 0;

        for(int i = 1; i <= n; i++) {
            System.out.println("Dados da pessoa #" + i + ":");
            System.out.print("Pessoa fisica ou juridica (f/j)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();
            if (ch == 'f') {
                System.out.print("Gastos com saude: ");
                double gastosSaude = sc.nextDouble();
                pessoa addDadosPF = new pessoaFisica(nome, rendaAnual, gastosSaude);
                listaDePessoas.add(addDadosPF);
            }
            else if (ch == 'j') {
                System.out.print("Numero de funcionarios: ");
                int numeroFuncionarios = sc.nextInt();
                pessoa addDadosPJ = new pessoaJuridica(nome, rendaAnual, numeroFuncionarios);
                listaDePessoas.add(addDadosPJ);
            }
        }

        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");
        for (pessoa p : listaDePessoas) {
            System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.imposto()));
            soma -= p.imposto();
        }
        System.out.println();
        System.out.println("TOTAL DE IMPOSTOS: $ " + String.format("%.2f", Math.abs(soma)));

        sc.close();
    }

}
