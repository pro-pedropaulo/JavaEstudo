package application;

import java.util.Scanner;
import java.util.Locale;
import negocios.nota;

public class calcularNotaOO {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome do aluno: ");
        String nome = sc.nextLine();
        
        nota notasAluno;
        notasAluno = new nota();

        System.out.println("Digite as quatros notas do aluno: ");
        notasAluno.a = sc.nextDouble();
        notasAluno.b = sc.nextDouble();
        notasAluno.c = sc.nextDouble();
        notasAluno.d = sc.nextDouble();

        System.out.printf("A media do aluno %s é: %.2f%n", nome, notasAluno.mediaFinal());
        if (notasAluno.mediaFinal() < 5.0) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("APROVADO");
        }


        sc.close();
    }
    
}