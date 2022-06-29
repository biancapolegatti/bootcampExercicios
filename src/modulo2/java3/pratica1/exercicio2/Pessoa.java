package modulo2.java3.pratica1.exercicio2;

import java.util.List;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private String funcao;


    public Pessoa(String nome, String sobrenome, int idade, String funcao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.funcao = funcao;

    }

    @Override
    public String toString() {
        return "Curriculo - " +
                "nome = " + nome +
                ", sobrenome = " + sobrenome +
                ", idade = " + idade +
                ", funcao = " + funcao;

    }
}
