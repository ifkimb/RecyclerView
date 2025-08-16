package br.com.etecia.myapp;

public class Labubu {

    private String titulo;
    private int image;

    //criando construtor

    public Labubu(String titulo, int image) {
        this.titulo = titulo;
        this.image = image;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
