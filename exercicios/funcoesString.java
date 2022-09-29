public class funcoesString {

    public static void main(String[] args) throws Exception {

        String original = "abcd EF GHIJ ABC abc DEFG     ";
        String tudoMinuscula = original.toLowerCase();
        String tudoMaiuscula = original.toUpperCase();
        String soPrimeiraLetraMaiuscula = original.substring(0, 1).toUpperCase() + original.substring(1).toLowerCase();
        String tirarEspacos = original.trim();
        String recortarString = original.substring(2, 10);
        String substituirString = original.replace("abc", "xy"); 
        int posicao = original.indexOf("G");
        int UltimaPosicao = original.lastIndexOf("F");
        int tamanho = original.length();

        System.out.println("Original: " + original); // abcd EF GHIJ ABC abc DEFG
        System.out.println("Tudo minuscula: " + tudoMinuscula); // tudo minuscula
        System.out.println("Tudo maiuscula: " + tudoMaiuscula); // tudo maiuscula
        System.out.println("So primeira letra maiuscula: " + soPrimeiraLetraMaiuscula); // Abcd ef ghiJ abc abc defg
        System.out.println("Tirar espacos: " + tirarEspacos); // tirar espacos no inicio e no fim
        System.out.println("Recortar string: " + recortarString); // recortar string
        System.out.println("Substituir string: " + substituirString); // substituir string
        System.out.println("Posicao: " + posicao); // posicao
        System.out.println("Ultima posicao: " + UltimaPosicao); // ultima posicao
        System.out.println("Tamanho: " + tamanho); // tamanho

    }
    
}