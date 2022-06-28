package modulo2.java3.pratica1.exercicio2;

import java.util.List;

public class Curriculo implements Imprimir {

    private String nome;
    private String sobrenome;
    private int idade;
    private String funcao;
    private List<String> habilidades;


    public Curriculo(String nome, String sobrenome, int idade, String funcao, List<String> habilidades) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.funcao = funcao;
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculo - " +
                "nome = " + nome +
                ", sobrenome = " + sobrenome +
                ", idade = " + idade +
                ", funcao = " + funcao +
                ", habilidades = " + habilidades;

    }

    @Override
    public void imprimir() {

        System.out.println(toString());
    }
}
