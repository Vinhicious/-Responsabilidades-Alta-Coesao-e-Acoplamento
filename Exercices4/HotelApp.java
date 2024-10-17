package Exercices4;

public class HotelApp {

    public static void main(String[] args) {
        Hospede hospede1 = new Hospede("Carlos", 101);
        Hospede hospede2 = new Hospede("Ana", 202);

        Recepcionista recepcionista = new Recepcionista();
        Camareiro camareiro = new Camareiro();
        Gerente gerente = new Gerente();

        recepcionista.checkIn(hospede1);
        recepcionista.checkIn(hospede2);

        camareiro.limparQuarto(hospede1.getNumeroQuarto());
        camareiro.limparQuarto(hospede2.getNumeroQuarto());

        gerente.administrarHotel();
        gerente.resolverProblema(hospede2);

        recepcionista.checkOut(hospede1);
        recepcionista.checkOut(hospede2);
    }
}
