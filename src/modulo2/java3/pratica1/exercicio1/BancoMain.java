package modulo2.java3.pratica1.exercicio1;

public class BancoMain {

    public static void main(String[] args) {

        Executivo e1 = new Executivo();
        Basico b1 = new Basico();
        Cobrador c1 = new Cobrador();

        e1.efetuarDeposito();
        e1.efetuarTransferencia();

        System.out.println("==========================");

        b1.consultarSaldo();
        b1.pagarServicos();
        b1.sacarDinheiro();

        System.out.println("=========================");

        c1.sacarDinheiro();
        c1.consultarSaldo();

    }
}
