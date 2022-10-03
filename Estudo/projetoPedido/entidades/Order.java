package projetoPedido.entidades;

import projetoPedido.enumeracao.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {

    SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;

    private Client client;
    List<OrderService> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderService> getItems() {
        return items;
    }
    public void addItem(OrderService item){
        items.add(item);
    }
    public void removeItem(OrderService item){
        items.remove(item);
    }
    public double valorTotal() {
        double soma = 0.0;
        for (OrderService item : items) {
            soma += item.subTotal();
        }
        return soma;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordem momento: ");
        sb.append(dataFormatada.format(moment) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(client + "\n");
        sb.append("Itens no pedido: \n");
        for (OrderService item : items) {
            sb.append(item + "\n");
        }
        sb.append("Preço total: $");
        sb.append(String.format("%.2f", valorTotal()));
        return sb.toString();
    }
}
