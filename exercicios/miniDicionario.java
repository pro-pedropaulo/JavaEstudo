import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class miniDicionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual palavra deseja traduzir?");
        String word = sc.nextLine();
        String url = "https://translate.google.com.br/#view=home&op=translate&sl=auto&tl=pt&text=" + word;
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
