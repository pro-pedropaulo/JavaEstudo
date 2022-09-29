package projetos;

import java.util.Random;
import java.util.Scanner;

public class geradorSenha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de Caracteres que terã sua senha: ");
        int n = sc.nextInt();
        System.out.println(senhaAleatoria(n));




        sc.close();




    }

    // criar classe que digita o tamanho da string e retorna uma senha aleatória
    public static String senhaAleatoria(int tamanho) {
        String senha = "";
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*";
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            senha += caracteres.charAt(random.nextInt(caracteres.length()));
        }
        return senha;
    }
}
