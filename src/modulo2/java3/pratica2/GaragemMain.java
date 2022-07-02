package modulo2.java3.pratica2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GaragemMain {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Fiesta", "Ford", 1000.00);
        Veiculo v2 = new Veiculo("Focus", "Ford", 1200.00);
        Veiculo v3 = new Veiculo("Explorer", "Ford", 2500.00);
        Veiculo v4 = new Veiculo("Uno", "Fiat", 500.00);
        Veiculo v5 = new Veiculo("Cronos", "Fiat", 1000.00);
        Veiculo v6 = new Veiculo("Torino", "Fiat", 1250.00);
        Veiculo v7 = new Veiculo("Aveo", "Chevrolet", 1250.00);
        Veiculo v8 = new Veiculo("Spin", "Chevrolet", 1250.00);
        Veiculo v9 = new Veiculo("Corola", "Toyota", 1200.00);
        Veiculo v10 = new Veiculo("Fortuner", "Toyota", 4000.00);
        Veiculo v11 = new Veiculo("Logan", "Renault", 950.00);


        List<Veiculo> veiculos = Arrays.asList(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11);
        Garagem garagem = new Garagem(1, veiculos);


        System.out.println("Lista ordenada pelo menor preço");
        garagem.listarVeiculosPorPrecoMenor();


        System.out.println("Lista ordenada pela marca");
        garagem.listarVeiculosPorMarca();

        System.out.println("Lista ordenada pelos valores menor que mil");
        garagem.listarVeiculosMenosQueMil();

        System.out.println("Retornado o preço médio dos veículos" + garagem.mostrarMediaDeValoresDosVeiculos());

    }

}
