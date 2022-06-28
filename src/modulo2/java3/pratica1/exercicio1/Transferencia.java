package modulo2.java3.pratica1.exercicio1;

public class Transferencia implements Transacao {

    @Override
    public void transacaoOk() {
        System.out.println("Transferência ok");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transferência não ok");
    }
}
