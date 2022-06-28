package modulo2.java3.pratica1.exercicio1;

public class SaqueDinheiro implements Transacao {

    @Override
    public void transacaoOk() {
        System.out.println("Saque em dinheiro ok");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Saque em dinheiro não ok");
    }
}
