package modulo2.java3.pratica1.exercicio1;

public class Executivo {

    Deposito deposito;
    Transferencia transferencia;

    public Executivo() {
        this.deposito = new Deposito();
        this.transferencia = new Transferencia();
    }

    public void efetuarDeposito(){
        deposito.transacaoOk();
           }

    public void efetuarTransferencia(){
        transferencia.transacaoOk();
        }
}
