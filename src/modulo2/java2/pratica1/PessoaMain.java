package modulo2.java2.pratica1;

public class PessoaMain {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Bianca", 31, "123");
        Pessoa p3 = new Pessoa("Beatriz", 30, "321", "Feminino", 1.60, 80);
        //  Pessoa p4 = new Pessoa("Beatriz", 30); //não é possível

        System.out.println(p3.calcularIMC());
        System.out.println("Maioridade: " + p3.ehMaiorIdade());
        System.out.println("Todos os dados " + p3.toString());


    }
}
