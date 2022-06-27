package modulo2.java2.pratica2.exercicio2;

public class Distribuidora {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[10];
        produtos[0] = new Pereciveis("Carne", 50.0, 1); // 12.5
        produtos[1] = new Pereciveis("Danone", 3.0, 1); //  0.75
        produtos[2] = new Pereciveis("Queijo", 5.0, 1); //  1.25
        produtos[3] = new Pereciveis("Alface", 4.0, 1); //  1.00
        produtos[4] = new Pereciveis("Frango", 6.0, 1); // 1.50
        produtos[5] = new NaoPereciveis("Arroz", 20.0, "alimenticio");
        produtos[6] = new NaoPereciveis("Sabonete", 2.0, "higiene");
        produtos[7] = new NaoPereciveis("Sabão em pó", 7.0, "limpeza");
        produtos[8] = new NaoPereciveis("Amaciante", 10.0, "limpeza");
        produtos[9] = new NaoPereciveis("Macarrão", 5.0, "alimenticio");

        double somaValorProdutos = 0;

        for (int i = 0; i < produtos.length; i++) {
            somaValorProdutos += produtos[i].calcular(1);

        }

        System.out.println("O valor total da compra é: " + somaValorProdutos);

    }
}



