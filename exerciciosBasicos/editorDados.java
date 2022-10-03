public class editorDados {

    public static void main(String[] args) throws Exception {

        String nomeCompleto = "pedro paulo barros correia da silva";
        String nomeMae = "gildenisce Barros dE souZA";
        String nomePai = "antonio Correia da Silva";
        String diaNascimento = "02";
        String mesNascimento = "04";
        String anoNascimento = "1995";

        String nomeCompletoMaiusculo = nomeCompleto.toUpperCase();
        String nomeMaeMaiusculo = nomeMae.toUpperCase();
        String nomePaiMaiusculo = nomePai.toUpperCase();
        String mesNascimentoExtenso = "";

        String[] nomeCompletoArray = nomeCompleto.split(" ");

        String[] nomeMaeArray = nomeMae.split(" ");

        String[] nomePaiArray = nomePai.split(" ");

        for (int i = 0; i < nomeCompletoArray.length; i++) {
            System.out.print(nomeCompletoArray[i].substring(0, 1).toUpperCase() + nomeCompletoArray[i].substring(1) + " ");

        }
        System.out.println();
        System.out.println();
        System.out.println(nomeCompletoMaiusculo);
        System.out.println();
        System.out.println();

        for(int i = 0; i < nomeMaeArray.length; i++){
            System.out.print(nomeMaeArray[i].substring(0, 1).toUpperCase() + nomeMaeArray[i].substring(1) + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println(nomeMaeMaiusculo);
        System.out.println();

        for (int i = 0; i < nomePaiArray.length; i++) {
            System.out.print(nomePaiArray[i].substring(0, 1).toUpperCase() + nomePaiArray[i].substring(1) + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println(nomePaiMaiusculo);
        System.out.println();

        switch (mesNascimento) {
            case "01":
                mesNascimentoExtenso = "Janeiro";
                break;
            case "02":
                mesNascimentoExtenso = "Fevereiro";
                break;
            case "03":
                mesNascimentoExtenso = "Março";
                break;
            case "04":
                mesNascimentoExtenso = "Abril";
                break;
            case "05":
                mesNascimentoExtenso = "Maio";
                break;
            case "06":
                mesNascimentoExtenso = "Junho";
                break;
            case "07":
                mesNascimentoExtenso = "Julho";
                break;
            case "08":
                mesNascimentoExtenso = "Agosto";
                break;
            case "09":
                mesNascimentoExtenso = "Setembro";
                break;
            case "10":
                mesNascimentoExtenso = "Outubro";
                break;
            case "11":
                mesNascimentoExtenso = "Novembro";
                break;
            case "12":
                mesNascimentoExtenso = "Dezembro";
                break;
            default:
                mesNascimentoExtenso = "Mês inválido";
                break;
        }

        System.out.println(diaNascimento + " de " + mesNascimentoExtenso +  " de " + anoNascimento);


        
        




    }
    
}