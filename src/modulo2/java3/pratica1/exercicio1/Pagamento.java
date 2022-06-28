package modulo2.java3.pratica1.exercicio1;

public class Pagamento implements Transacao {

    public String pagarServico() {
        return "Pagamento de Serviço";

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
