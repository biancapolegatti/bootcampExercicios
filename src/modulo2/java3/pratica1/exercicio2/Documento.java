package modulo2.java3.pratica1.exercicio2;

public class Documento {

    private String identificacao;

    public Documento(String identificacao) {
        this.identificacao = identificacao;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "identificacao= " + identificacao +
                '}';
    }
}
