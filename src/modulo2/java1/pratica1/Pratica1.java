package modulo2.java1.pratica1;

public class Pratica1 {

    public static void main(String[] args) {

        String[] cidades = new String[]{"Londres", "Madri", "Nova York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

        int[][] temperaturas = new int[][]{{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int maiorTemperatura = temperaturas[0][0];
        int menorTemperatura = temperaturas[0][0];
        String cidadeMaior = cidades[0];
        String cidadeMenor = cidades[0];


        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                if (temperaturas[i][j] > maiorTemperatura) {
                    maiorTemperatura = temperaturas[i][j];
                    cidadeMaior = cidades[i];
                }
                if (temperaturas[i][j] < menorTemperatura) {
                    menorTemperatura = temperaturas[i][j];
                    cidadeMenor = cidades[i];
                }
            }
        }

        System.out.println("A  maior temperatura é na cidade de " + cidadeMaior + " " + maiorTemperatura);
        System.out.println("A  menor temperatura é na cidade de " + cidadeMenor + " " + menorTemperatura);
    }

}

//deveria ter sido feito separando os laços for, pois na forma como está, ele roda percorre desnecessariamente