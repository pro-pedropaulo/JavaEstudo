package treinandoExcessao.modulos.entidade;

import treinandoExcessao.modulos.excessoes.domainExceptions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {
    private static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    private Integer quarto;
    private Date checkIn;
    private Date checkOut;



    public Reserva(Integer quarto, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new domainExceptions("Erro na reserva: a data de check-out deve ser posterior a data de check-in");
        }
        this.quarto = quarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getQuarto() {
        return quarto;
    }

    public void setQuarto(Integer quarto) {
        this.quarto = quarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao() {
        long diferenca = checkOut.getTime() - checkIn.getTime();
        return (diferenca / (1000 * 60 * 60 * 24));
    }

    public static void atualizarDatas(Date checkIn, Date checkOut) {
        Date agora = new Date();
        if (checkIn.before(agora) || checkOut.before(agora)) {
            throw new domainExceptions("Erro na reserva: as datas para atualizar a reserva devem ser futuras");
        }
        if (!checkOut.after(checkIn)) {
            throw new domainExceptions("Erro na reserva: a data de check-out deve ser posterior a data de check-in");
        }
    }
    @Override
    public String toString() {
        return "Quarto "
                + quarto
                + ", check-in: "
                + dataFormatada.format(checkIn)
                + ", check-out: "
                + dataFormatada.format(checkOut)
                + ", "
                + duracao()
                + " noites";
    }
}
