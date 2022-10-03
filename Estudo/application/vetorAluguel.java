package application;

import java.util.Locale;
import java.util.Scanner;
import negocios.aluguel;


public class vetorAluguel {

    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("quanto quartos serão alugados? ");
    int n = sc.nextInt();
    while(true) {
        if(n > 10 || n < 1) {
            System.out.println("Erro de entrada, digite um valor entre 1 e 10");
            System.out.print("quanto quartos serão alugados? ");
            n = sc.nextInt();
        } else {
            break;
        }

    }




    aluguel[] vetorAluguel = new aluguel[n];


    for(int i=0; i<n; i++) {
        sc.nextLine();
        System.out.println("Alocação numero #" + (i+1) + ":");
        System.out.print("nome: ");
        String nomeT = sc.nextLine();
        System.out.print("email: ");
        String emailT = sc.nextLine();
        System.out.println("esses são os quartos disponiveis: ");
        System.out.print("qual quarto você deseja: ");
        int quartoT = sc.nextInt();
        vetorAluguel[i] = new aluguel(nomeT, emailT, quartoT);
        // ordenar quartos
        for(int j=0; j<i; j++) {
            if(vetorAluguel[j].getQuarto() > vetorAluguel[j+1].getQuarto()) {
                aluguel aux = vetorAluguel[j];
                vetorAluguel[j] = vetorAluguel[j+1];
                vetorAluguel[j+1] = aux;
            }
        }


    }
    System.out.println("quartos ocupados: ");
    for(int i=0; i<n; i++) {
        System.out.println(vetorAluguel[i].getQuarto() + ": " + vetorAluguel[i].getNome() + ", " + vetorAluguel[i].getEmail());
    }

    sc.close();

}
}
