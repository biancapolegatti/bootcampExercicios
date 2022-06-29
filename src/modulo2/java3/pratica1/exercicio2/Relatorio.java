package modulo2.java3.pratica1.exercicio2;

public class Relatorio extends Documento {

    private String autor;
    private String revisor;
    private int textoDeComprimento;
    private int numeroDePaginas;

    public Relatorio(String identificacao, String autor, String revisor, int textoDeComprimento, int numeroDePaginas) {
        super(identificacao);
        this.autor = autor;
        this.revisor = revisor;
        this.textoDeComprimento = textoDeComprimento;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                ", textoDeComprimento=" + textoDeComprimento +
                ", numeroDePaginas=" + numeroDePaginas +
                '}';
    }
}
