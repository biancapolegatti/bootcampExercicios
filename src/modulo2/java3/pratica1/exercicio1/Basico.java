package modulo2.java3.pratica1.exercicio1;

public class Basico implements ConsultaSaldo, PagamentoServicos, SaqueDinheiro {

    @Override
    public void consultarSaldo() {
        System.out.println("Consultando o saldo");
    }

    @Override
    public void pagarServicos() {
        System.out.println("Fazendo o pagamento dos serviços");
    }

    @Override
    public void sacarDinheiro() {
        System.out.println("Sacando o dinheiro");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Transação ok");

    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação não ok");

    }
}
