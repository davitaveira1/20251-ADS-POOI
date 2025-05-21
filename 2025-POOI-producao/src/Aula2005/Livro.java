package Aula2005;

public class Livro {

    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(){
    }

    public static void main(String[] args) {
        Livro livro = new Livro("O alquimista","Paulo Freire");
        Livro livro2 = new Livro();

    }
}
