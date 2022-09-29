import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class treinandoLista {
     public static void main(String[] args) {

         List<String> minhaLista = new ArrayList<String>(); //criando uma lista
         minhaLista.add("Pedro");  //adicionando elementos na lista
         minhaLista.add("Maria");
         minhaLista.add("João");
         minhaLista.add("José");
         minhaLista.add("Paulo");
         minhaLista.add("Renata");

         for(String nome : minhaLista) { // for each para percorrer a lista
             System.out.println(nome);
         }

         int TamanhoLista = minhaLista.size(); // tamanho da lista
         System.out.println("Tamanho da lista: " + TamanhoLista);
         minhaLista.remove("José"); // removendo um elemento da lista
         minhaLista.removeIf(nome -> nome.startsWith("R")); // removendo elementos que começam com r
         for(String nome : minhaLista) { // for each para percorrer a lista
             System.out.println(nome);
         }
         System.out.println("Posição do nome Pedro: " + minhaLista.indexOf("Pedro"));
            if(minhaLista.contains("Correia")) {
                System.out.println("O nome correia está na lista");
            } else {
                System.out.println("O nome correia não está na lista");
            }



         List <String>  resultado = minhaLista.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());
        for(String nome : resultado) { // for each para percorrer a lista
            System.out.println(nome);
        }

}
}
