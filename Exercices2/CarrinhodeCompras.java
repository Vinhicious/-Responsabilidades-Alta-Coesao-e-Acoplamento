package Exercices2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {
    
    private List<Produto> produtos;
    
    public CarrinhodeCompras() {
        produtos = new ArrayList<>(); // Corrigido
    }
   
    public void adicionarProduto(Produto produto) { // Ajuste no nome do parâmetro
        this.produtos.add(produto); // Corrigido para adicionar à lista de produtos
        System.out.println(produto.getNome() + " adicionado ao carrinho"); // Corrigido espaço na mensagem
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}
