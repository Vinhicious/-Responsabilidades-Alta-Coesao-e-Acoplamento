package Exercices2;

public class Main {
    public static void main(String[] args) {
        CarrinhodeCompras carrinho = new CarrinhodeCompras();
        
        Produto produto1 = new Produto("Camisa", 49.90);
        Produto produto2 = new Produto("Calça", 79.90);
        
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        
        System.out.println("Total do carrinho: R$" + carrinho.calcularTotal());
    }
}
