package modulo2.java3.pratica1.exercicio1;

public class Cobrador {

    ConsultaSaldo consultaSaldo;
    SaqueDinheiro saqueDinheiro;

    public Cobrador() {
        this.consultaSaldo = new ConsultaSaldo();
        this.saqueDinheiro = new SaqueDinheiro();
    }

    public void sacarDinheiro() {
        saqueDinheiro.transacaoOk();
    }

    public void consultarSaldo() {
        consultaSaldo.transacaoOk();
    }

}
