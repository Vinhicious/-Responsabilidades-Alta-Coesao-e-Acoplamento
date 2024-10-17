package Exercices3;

public class Cinegrafista {
    private ICamera camera;

    public Cinegrafista(ICamera camera) {
        this.camera = camera;
    }

    public void trocarCamera(ICamera novaCamera) {
        this.camera = novaCamera;
    }

    public void gravarFilme() {
        camera.gravarFilme();
    }
}

