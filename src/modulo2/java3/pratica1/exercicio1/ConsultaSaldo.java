package modulo2.java3.pratica1.exercicio1;

public class ConsultaSaldo implements  Transacao {

    @Override
    public void transacaoOk() {
        System.out.println("Consulta de saldo ok");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Consulta de saldo não ok");
    }
}
