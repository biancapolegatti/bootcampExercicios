package modulo2.java3.pratica1.exercicio1;

public class Deposito implements Transacao {

    public String fazerDeposito() {
        return "Fazendo o depósito";
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
