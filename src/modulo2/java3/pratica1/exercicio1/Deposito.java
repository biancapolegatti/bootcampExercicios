package modulo2.java3.pratica1.exercicio1;

public class Deposito implements Transacao {

    @Override
    public void transacaoOk() {
        System.out.println("Depósito ok");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Depósito não ok");
    }
}
