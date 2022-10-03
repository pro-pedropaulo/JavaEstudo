public class valorPorLigacao {

    public static void main(String[] args) throws Exception {

        int tempoLigacao = 102;

        if (tempoLigacao < 100) {
            System.out.println("você não estourou o plano de 100 minutos o valor é de R$ 50,00 reais");
        } 
        else if (tempoLigacao > 100) {
            int TempoExcedente = tempoLigacao - 100;
            System.out.printf("Você estourou o plano de 100 minutos o valor é de R$ %.2f reais", TempoExcedente * 2.0 + 50.0);
        }
      
    
    }
}