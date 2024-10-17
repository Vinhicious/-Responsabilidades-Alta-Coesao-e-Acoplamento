package Exercices4;

public class Recepcionista {

    public void checkIn(Hospede hospede) {
        System.out.println("Check-in realizado para o hóspede: " + hospede.getNome());
    }

    public void checkOut(Hospede hospede) {
        System.out.println("Check-out realizado para o hóspede: " + hospede.getNome());
    }
}
