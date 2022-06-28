package modulo2.java3.pratica1.exercicio1;

public class Consulta implements  Transacao {

    public String fazerConsultaDeSaldo(){
        return "Fazendo a consulta do saldo";
    }

    @Override
    public String transacaoOk() {
        return "Transação ok";
    }

    @Override
    public String transacaoNaoOk() {
        return "Transação ok";
    }
}
