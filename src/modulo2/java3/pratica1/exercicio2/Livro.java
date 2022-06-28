package modulo2.java3.pratica1.exercicio2;

public class Livro implements Imprimir {

    private String titulo;
    private String genero;
    private String nomeDoAutor;
    private int numeroDePaginas;

    public Livro(String titulo, String genero, String nomeDoAutor, int numeroDePaginas) {
        this.titulo = titulo;
        this.genero = genero;
        this.nomeDoAutor = nomeDoAutor;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Livro - " +
                "titulo = " + titulo +
                ", genero = " + genero +
                ", nomeDoAutor = " + nomeDoAutor +
                ", numeroDePaginas = " + numeroDePaginas;
    }

    @Override
    public void imprimir() {
        System.out.println(toString());

    }
}
