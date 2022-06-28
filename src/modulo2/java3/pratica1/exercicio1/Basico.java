package modulo2.java3.pratica1.exercicio1;

public class Basico {

    ConsultaSaldo consultaSaldo;
    PagamentoServicos pagamentoServicos;
    SaqueDinheiro saqueDinheiro;

    public Basico() {
        this.consultaSaldo = new ConsultaSaldo();
        this.pagamentoServicos = new PagamentoServicos();
        this.saqueDinheiro = new SaqueDinheiro();
    }

    public void consultarSaldo(){
        consultaSaldo.transacaoOk();
    }

    public void pagarServicos(){
        pagamentoServicos.transacaoOk();
    }

    public void sacarDinheiro(){
        saqueDinheiro.transacaoOk();
    }

}
