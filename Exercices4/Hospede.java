
package Exercices4;

public class Hospede {
    private String nome;
    private int numeroQuarto;

    public Hospede(String nome, int numeroQuarto) {
        this.nome = nome;
        this.numeroQuarto = numeroQuarto;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void exibirInformacoes() {
        System.out.println("Hóspede: " + nome + " | Quarto: " + numeroQuarto);
    }
}
