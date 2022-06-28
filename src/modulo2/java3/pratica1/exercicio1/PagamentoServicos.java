package modulo2.java3.pratica1.exercicio1;

public class PagamentoServicos implements Transacao {

    @Override
    public void transacaoOk() {
        System.out.println("Pagamento de serviços ok");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Pagamento de serviços não ok");
    }
}
