package Exercices;


public class Prato {

    private String nome;
    private String ingredientes;
    
    public Prato(String nome,String ingredientes){
        this.nome = nome;
        this.ingredientes = ingredientes;
    }
    public String getNome(){
        return nome;
    }

    public String getIngredientes(){
        return ingredientes;
    }
    
    public void exibirDetalhes(){
        System.out.println ("Prato: " + nome + " | Ingrediente: " + ingredientes);
    }
}
