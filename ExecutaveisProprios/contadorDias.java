package projetos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class contadorDias {

    public static void main(String[] args) {

        List<String> datasImportantes = new ArrayList<>();
        datasImportantes.add("Ano Novo");
        datasImportantes.add("Natal");
        datasImportantes.add("Dia das Crianças");
        datasImportantes.add("Dia da independência");
        datasImportantes.add("Inicio copa do mundo");
        datasImportantes.add("Fim copa do mundo");

        Scanner sc = new Scanner(System.in);
        String dataDesejada = "";
        System.out.println("Eventos importantes ja cadastrados: ");
        for (int i = 0; i < datasImportantes.size(); i++) {
            System.out.printf("["+(i+1)+"] " + datasImportantes.get(i) + " ");
        }
        System.out.println();
        System.out.println("Digite o numero do evento, ou escreva seu proprio evento: ");
        String nomeEvento = sc.nextLine();
        // switch case para escolher o evento
        switch (nomeEvento) {
            case "1":
                dataDesejada = "01/01/2023";
                nomeEvento = datasImportantes.get(0);
                break;
            case "2":
                dataDesejada = "25/12/2022";
                nomeEvento = datasImportantes.get(1);
                break;
            case "3":
                dataDesejada = "12/10/2022";
                nomeEvento = datasImportantes.get(2);
                break;
            case "4":
                dataDesejada = "07/09/2023";
                nomeEvento = datasImportantes.get(3);
                break;
            case "5":
                dataDesejada = "18/11/2022";
                nomeEvento = datasImportantes.get(4);
                break;
            case "6":
                dataDesejada = "18/12/2022";
                nomeEvento = datasImportantes.get(5);
                break;
            default:
                System.out.println("Digite a data do evento no formato dd/mm/aaaa: ");
                dataDesejada = sc.nextLine();
                break;
        }
        LocalDate dataFormatada = LocalDate.parse(dataDesejada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataAtual = LocalDate.now();
        // difference between dates
        long diferenca = dataFormatada.toEpochDay() - dataAtual.toEpochDay();
        if (diferenca < 0) {
            System.out.println("A data do evento ja passou");
        } else {
            System.out.printf("Faltam %d dias para o evento %s%n", diferenca, nomeEvento);
        }



        sc.close();


    }
}
