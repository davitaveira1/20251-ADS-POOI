package Aula2005;

public class LivroLeitura {

    String titulo;
    String autor;
    int totalPaginas;
    int paginasLidas;

    public LivroLeitura(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        totalPaginas = 100;
        paginasLidas = 0;
    }

    public LivroLeitura(String titulo, String autor, int totalPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
    }

    public LivroLeitura(String titulo, String autor, int totalPaginas, int paginasLidas){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginasLidas = paginasLidas;
    }
}
