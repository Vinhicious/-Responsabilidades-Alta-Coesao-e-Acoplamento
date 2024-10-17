package Exercices;

public class Restaurante {
    
    private String nomeRestaurante;
    
    public Restaurante(String nomeRestaurante){
        this.nomeRestaurante = nomeRestaurante;
    }
    
    public Prato prepararPrato(String nome, String ingredientes){
        System.out.println(nomeRestaurante + "está preparando o prato: " + nome);
        return new Prato(nome, ingredientes); 
    }
}
