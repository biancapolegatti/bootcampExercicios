package modulo2.java3.pratica1.exercicio1;

public class Cobrador implements ConsultaSaldo, SaqueDinheiro {

    @Override
    public void consultarSaldo() {
        System.out.println("Consultando o saldo");
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
