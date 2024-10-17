package Exercices;

public class Main {
    public static void main(String[] args){
        Restaurante restaurante = new Restaurante("Sabor Delicia ");
        
        Prato prato1 = restaurante.prepararPrato("Lasanha", "Massa, Queijo, Molho de Tomate");
        Prato prato2 = restaurante.prepararPrato("Pizza", "Massa, Queijo, Molho de Tomate, Majericão");
        
        prato1.exibirDetalhes();
        prato2.exibirDetalhes();
    }
}
