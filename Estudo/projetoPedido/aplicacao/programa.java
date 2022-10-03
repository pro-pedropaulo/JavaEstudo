package projetoPedido.aplicacao;

import projetoPedido.entidades.Client;
import projetoPedido.entidades.Order;
import projetoPedido.entidades.OrderService;
import projetoPedido.entidades.Product;
import projetoPedido.enumeracao.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date dataNascimento = dataFormatada.parse(sc.next());
        Client client = new Client(nome, email, dataNascimento);
        System.out.println("Entre com os dados do pedido: ");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

        System.out.print("Quantos itens para este pedido? ");
        int n = sc.nextInt();
        Order order = new Order(new Date(), orderStatus, client);

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do #" + i + " item: ");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            Product p = new Product(nomeProduto, precoProduto);
            OrderService item = new OrderService(quantidade, precoProduto, p);
            order.addItem(item);
        }

        System.out.println();
        System.out.printf(order.toString());

        sc.close();

    }
}
