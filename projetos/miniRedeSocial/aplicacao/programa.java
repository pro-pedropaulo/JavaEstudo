package miniRedeSocial.aplicacao;

import miniRedeSocial.entidades.Comment;
import miniRedeSocial.entidades.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date horarioPostagem = dataFormatada.parse("19/09/2022 13:05:44");
        String tituloPostagem = "Viajando com a familia";
        String CounteudoPost = "Vou viajar para o Japão, estou muito feliz!";
        Integer curtidasPost = 45;
        Post p1 = new Post(horarioPostagem, tituloPostagem, CounteudoPost, curtidasPost);
        System.out.printf("Quantos Comentarios terão no Post? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o comentario: ");
            String writeComentario = sc.nextLine();
            p1.addComentario(new Comment(writeComentario));
        }
        System.out.println(p1);



        sc.close();
    }

}
