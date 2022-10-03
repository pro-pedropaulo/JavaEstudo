package praticandoInterface.modulo.servicos;

import praticandoInterface.modulo.entidades.AluguelCarro;
import praticandoInterface.modulo.entidades.Fatura;

public class ServicoAluguel {
    private Double precoPorDia;
    private Double precoPorHora;

    private TaxaServico taxaBrasileira;

    public ServicoAluguel(Double precoPorDia, Double precoPorHora, TaxaServico taxaBrasileira) {
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.taxaBrasileira = taxaBrasileira;
    }
    public void processandoFatura(AluguelCarro aluguelCarro) {
    long t1 = aluguelCarro.getInicio().getTime();
    long t2 = aluguelCarro.getFim().getTime();
    double horas = (double) (t2 - t1) / 1000 / 60 / 60;  // converte para horas

        double pagamentoBasico;
        if (horas <= 12) {
            pagamentoBasico = precoPorHora * Math.ceil(horas);
        } else {
            pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
        }

          double taxa = taxaBrasileira.taxa(pagamentoBasico);

        aluguelCarro.setFatura(new Fatura(pagamentoBasico, taxa));
    }
}
