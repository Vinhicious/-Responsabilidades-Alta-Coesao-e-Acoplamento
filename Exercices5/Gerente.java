package Exercices5;

public class Gerente {

    private Garcom garcom;
    private Cozinheiro cozinheiro;
    private Caixa caixa;

    public Gerente(Garcom garcom, Cozinheiro cozinheiro, Caixa caixa) {
        this.garcom = garcom;
        this.cozinheiro = cozinheiro;
        this.caixa = caixa;
    }

    public void processarPedido(String pedido, double valorConta) {

        String pedidoRecebido = garcom.receberPedido(pedido);

        String pratoPreparado = cozinheiro.prepararPrato(pedidoRecebido);

        garcom.servirPrato(pratoPreparado);

        caixa.cobrarConta(valorConta);
    }
}