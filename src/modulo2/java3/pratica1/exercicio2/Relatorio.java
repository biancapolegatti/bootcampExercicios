package modulo2.java3.pratica1.exercicio2;

public class Relatorio implements Imprimir {

    private String autor;
    private String revisor;
    private int textoDeComprimento;
    private int numeroDePaginas;

    public Relatorio(String autor, String revisor, int textoDeComprimento, int numeroDePaginas) {
        this.autor = autor;
        this.revisor = revisor;
        this.textoDeComprimento = textoDeComprimento;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Relatorio - " +
                "autor = " + autor +
                ", revisor= " + revisor +
                ", textoDeComprimento = " + textoDeComprimento +
                ", numeroDePaginas = " + numeroDePaginas;
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }
}
