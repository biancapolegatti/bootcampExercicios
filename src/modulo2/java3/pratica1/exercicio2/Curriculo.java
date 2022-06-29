package modulo2.java3.pratica1.exercicio2;

import java.util.List;

public class Curriculo extends Documento {

    private Pessoa pessoa;
    private List<String> habilidades;


    public Curriculo(String identificacao, Pessoa pessoa, List<String> habilidades) {
        super(identificacao);
        this.pessoa = pessoa;
        this.habilidades = habilidades;
    }


    @Override
    public String toString() {
        return "Curriculo{" +
                "pessoa=" + pessoa +
                ", habilidades=" + habilidades +
                '}';
    }
}
