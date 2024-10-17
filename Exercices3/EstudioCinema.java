package Exercices3;

public class EstudioCinema {
    public static void main(String[] args) {
        
        ICamera dslr = new CameraDSLR();
        Cinegrafista cinegrafista = new Cinegrafista(dslr);
        
        
        cinegrafista.gravarFilme();
        
        
        ICamera cinema = new CameraCinema();
        cinegrafista.trocarCamera(cinema);
        
        
        cinegrafista.gravarFilme();
    }
}