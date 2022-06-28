package modulo2.java3.pratica1.exercicio1;

public class Saque implements Transacao {

    public String fazerSaqueComDinheiro() {
        return "Fazendo saque com dinheiro";

    }


    @Override
    public String transacaoOk() {
        return "Transação ok";
    }

    @Override
    public String transacaoNaoOk() {
        return "Transação ok";
    }
}
