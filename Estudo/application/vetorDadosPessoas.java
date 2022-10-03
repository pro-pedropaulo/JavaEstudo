package application;

import negocios.dadosPessoas;

import java.util.Locale;
import java.util.Scanner;

public class vetorDadosPessoas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("quantas pessoas irão ser cadastradas? ");
        int n = sc.nextInt();
        dadosPessoas[] vetorPessoas = new dadosPessoas[n];
        double somaAltura = 0.0;
        double mediaAltura = 0.0;
        double menorIdade = 0.0;
        double porcentagem = 0.0;
        double somaIdade = 0.0;
        double mediaIdade = 0.0;


        for (int i = 0; i < vetorPessoas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            String nomeT = sc.nextLine();
            sc.nextLine();
            System.out.print("Idade: ");
            int idadeT = sc.nextInt();
            if (idadeT < 18) {
                menorIdade++;
            }
            System.out.print("Altura: ");
            double alturaT = sc.nextDouble();
            vetorPessoas[i] = new dadosPessoas(nomeT, idadeT, alturaT);

            somaAltura += vetorPessoas[i].getAltura();
            mediaAltura = somaAltura / vetorPessoas.length;
            somaIdade += vetorPessoas[i].getIdade();
            mediaIdade = somaIdade / vetorPessoas.length;
        }

            System.out.printf("A média de altura das pessoas cadastradas é: %.2f%n", mediaAltura);
            porcentagem = (menorIdade / vetorPessoas.length) * 100;
            System.out.printf("A porcentagem de pessoas com menos de 18 anos é: %.2f%%%n", porcentagem);
            System.out.printf("A soma das idades das pessoas cadastradas é: %.2f%n", somaIdade);
            System.out.printf("A média das idades das pessoas cadastradas é: %.2f%n", mediaIdade);

            sc.close();

    }
}
