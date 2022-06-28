package modulo2.java2.pratica1;

public class Pessoa {

    private String nome;
    private int idade;
    private String id;
    private String sexo;
    private double altura;
    private double peso;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }


    public Pessoa(String nome, int idade, String id, String sexo, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String calcularIMC() {
        double formulaIMC = peso / Math.pow(altura, 2);
        if (formulaIMC < 20) {
            return "Você está abaixo do peso";
        } else if (formulaIMC > 20 && formulaIMC <= 25) {
            return "Você está com peso saudável";
        } else if (formulaIMC < 25) {

        }
        return "Você está com sobrepeso";

    }

    public boolean ehMaiorIdade() {
        if (idade >= 18) {
            return true;
        } else return false;

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome= " + nome +
                ", idade= " + idade +
                ", id= " + id +
                ", sexo= " + sexo +
                ", altura= " + altura +
                ", peso= " + peso +
                '}';
    }
}
