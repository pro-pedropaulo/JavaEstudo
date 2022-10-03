package application;

import negocios.calculoAumento;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class listCalculandoAumento {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();
        List<calculoAumento> minhaLista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            calculoAumento temp = new calculoAumento(id, nome, salario);
            minhaLista.add(temp);
        }

        for (calculoAumento mostrarTodaLista : minhaLista) {
            System.out.println(mostrarTodaLista);
        }
        System.out.println("Digite o id do funcionário que terá aumento: ");
        int idFuncAumento = sc.nextInt();

        // verifica se o id digitado existe na lista
        Integer pos = conferirId(minhaLista, idFuncAumento);
        while (true) {
            if (pos == null) {
                System.out.println("Esse id não existe!");
                System.out.println("Digite o id do funcionário que terá aumento: ");
                idFuncAumento = sc.nextInt();
                pos = conferirId(minhaLista, idFuncAumento);
            } else {
                System.out.printf("Digite a porcentagem de aumento do funcionário %s: ", minhaLista.get(pos).getNome());
                double porcentagem = sc.nextDouble();
                minhaLista.get(pos).aumentarSalario(porcentagem);
                break;
            }
        }

        System.out.println("Lista atualizada: ");
        for (calculoAumento mostrarTodaLista : minhaLista) {
            System.out.println(mostrarTodaLista);
        }



        sc.close();

    }

    private static Integer conferirId(List<calculoAumento> minhaLista, int idFuncAumento) {
        for (int i = 0; i < minhaLista.size(); i++) {
            if (minhaLista.get(i).getId() == idFuncAumento) {
                return i;
            }
        }
        return null;
    }
}
