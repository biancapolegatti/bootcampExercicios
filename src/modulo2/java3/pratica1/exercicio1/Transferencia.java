package modulo2.java3.pratica1.exercicio1;

public class Transferencia implements Transacao {

    public String fazerDeposito(){
        return "Fazendo a transferência";
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
