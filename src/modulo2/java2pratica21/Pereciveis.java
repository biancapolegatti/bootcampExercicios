package modulo2.java2pratica21;

public class Pereciveis extends Produto {

    public int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer = " + diasParaVencer +
                ", nome = " + nome +
                ", preco = " + preco +
                '}';
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        if (diasParaVencer == 1) {
            return (preco * quantidadeDeProdutos) / 4;
        } else if (diasParaVencer == 2) {
            return (preco * quantidadeDeProdutos) / 3;
        } else if (diasParaVencer == 3) {
        }
        return (preco * quantidadeDeProdutos) / 2;

    }
}
