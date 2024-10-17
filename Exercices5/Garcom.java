package Exercices5;

public class Garcom {

    public String receberPedido(String pedido) {
        System.out.println("Garçom: Pedido recebido - " + pedido);
        return pedido;
    }

    public void servirPrato(String prato) {
        System.out.println("Garçom: Servindo o prato - " + prato);
    }
}