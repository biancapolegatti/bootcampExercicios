package modulo2.java3.pratica1.exercicio1;

public class Executivo implements Deposito, Transferencia {


    @Override
    public void fazerDeposito() {
        System.out.println("Fazendo o depósito");

    }


    @Override
    public void fazerTransferencia() {
        System.out.println("Fazendo a transferência");

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
