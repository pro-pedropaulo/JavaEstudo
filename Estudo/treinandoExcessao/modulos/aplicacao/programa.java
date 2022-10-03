package treinandoExcessao.modulos.aplicacao;

import treinandoExcessao.modulos.entidade.Reserva;
import treinandoExcessao.modulos.excessoes.domainExceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class programa {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    try {
        System.out.print("Quarto: ");
        int quarto = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = dataFormatada.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = dataFormatada.parse(sc.next());

        Reserva reservaFeita = new Reserva(quarto, checkIn, checkOut);
        System.out.println("Reserva: " + reservaFeita);

        System.out.println();
        System.out.println("Entre com os dados para atualizar a reserva:");
        System.out.print("Check-in date (dd/MM/yyyy): ");
        checkIn = dataFormatada.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        checkOut = dataFormatada.parse(sc.next());

        Reserva.atualizarDatas(checkIn, checkOut);
        System.out.println("Reserva: " + reservaFeita);
    }
    catch (ParseException e) {
        System.out.println("Erro na conversão da data");
    }
    catch (domainExceptions e) {
        System.out.println("Erro na reserva: " + e.getMessage());
    }
    catch (RuntimeException e) {
        System.out.println("Erro inesperado");
    }

        sc.close();
    }
}