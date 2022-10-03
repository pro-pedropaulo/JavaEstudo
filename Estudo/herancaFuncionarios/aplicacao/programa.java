package herancaFuncionarios.aplicacao;

import herancaFuncionarios.entidades.funcionario;
import herancaFuncionarios.entidades.tercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero de funcionarios: ");
        int n = sc.nextInt();
        List<funcionario> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            System.out.println("Funcionario #" + i + " terceirizado? (s/n)");
            char ch = sc.next().charAt(0);
            System.out.println("Digite o nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite as horas: ");
            int horas = sc.nextInt();
            System.out.println("Digite o valor por hora: ");
            double valorPorHora = sc.nextDouble();
            if(ch == 's') {
                System.out.println("Digite o valor adicional: ");
                double valorAdicional = sc.nextDouble();
                tercerizado novoTercerizado = new tercerizado(nome, horas, valorPorHora, valorAdicional);
                System.out.println("Nome: " + novoTercerizado.getNome());
                System.out.println("Horas: " + novoTercerizado.getHoras());
                System.out.println("Valor por hora: " + novoTercerizado.getValorPorHora());
                System.out.println("Valor adicional: " + novoTercerizado.getAdicional());
            } else {
                funcionario novoFuncionario = new funcionario(nome, horas, valorPorHora);
                System.out.println("Nome: " + novoFuncionario.getNome());
                System.out.println("Horas: " + novoFuncionario.getHoras());
                System.out.println("Valor por hora: " + novoFuncionario.getValorPorHora());
                System.out.println("Pagamento: " + novoFuncionario.pagamento());
                list.add(novoFuncionario);
            }
        }

        System.out.println("PAGAMENTOS: ");
        for(funcionario func : list) {
            System.out.println(func.getNome() + " - $ " + func.pagamento());
        }






        sc.close();
    }
}
