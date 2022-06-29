package modulo2.java3.pratica1.exercicio2;

public class Livro extends Documento {

    private String titulo;
    private String genero;
    private String nomeDoAutor;
    private int numeroDePaginas;


    public Livro(String identificacao, String titulo, String genero, String nomeDoAutor, int numeroDePaginas) {
        super(identificacao);
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

}
