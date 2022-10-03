package praticandoInterface.aplicacao;

import praticandoInterface.modulo.entidades.AluguelCarro;
import praticandoInterface.modulo.entidades.Veiculo;
import praticandoInterface.modulo.servicos.ServicoAluguel;
import praticandoInterface.modulo.servicos.TaxaBrasileira;
import praticandoInterface.modulo.entidades.Fatura;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    try {
        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String modeloCarro = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        Date inicio = dataFormatada.parse(sc.nextLine());
        System.out.print("Devolução (dd/MM/yyyy hh:mm): ");
        Date fim = dataFormatada.parse(sc.nextLine());

        AluguelCarro aluguel = new AluguelCarro(inicio, fim, new Veiculo(modeloCarro));

        System.out.print("Entre com o preço por hora: ");
        double precoHora = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double precoDia = sc.nextDouble();
        ServicoAluguel servicoAluguel = new ServicoAluguel(precoHora, precoDia, new TaxaBrasileira());

        servicoAluguel.processandoFatura(aluguel);
        System.out.println("FATURA");
        System.out.println("Pagamento básico: " + String.format("%.2f", aluguel.getFatura().getPagamentoBasico()));
        System.out.println("Taxa: " + String.format("%.2f", aluguel.getFatura().getTaxa()));
        System.out.println("Total: "+ String.format("%.2f", aluguel.getFatura().totalPagamento()));
    }
    catch(ParseException e) {
        System.out.println("Erro na conversão da data");
    }
        sc.close();

    }
}
