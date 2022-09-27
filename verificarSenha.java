import java.util.Scanner;

public class verificarSenha {
    
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int senha = 1234;
    int senhaDigitada = sc.nextInt();
    int tentativasErradas = 0;
    boolean contaBloqueada = false;

    while(senhaDigitada != senha){
        tentativasErradas++;
        if (tentativasErradas == 3) {
            System.out.println("Senha Bloqueada");
            contaBloqueada = true;
            break;
        }
        if (tentativasErradas == 1) {
            System.out.printf("voce digitou a senha errada %d vez%n", tentativasErradas);
        }
        else if (tentativasErradas == 2) {
            System.out.printf("voce digitou a senha errada %d vez%n", tentativasErradas);
            System.out.println("caso erre mais uma vez sua conta sera bloqueada");
        } 
        else {
            System.out.printf("voce digitou a senha errada %d vezes%n", tentativasErradas);
        }
        System.out.println("Digite novamente");
        senhaDigitada = sc.nextInt();
    }
    if (contaBloqueada == false) {
        System.out.println("Senha correta acesso liberado");    
    }
    

    sc.close();

}
}