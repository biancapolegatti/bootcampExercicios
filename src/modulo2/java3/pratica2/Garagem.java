package modulo2.java3.pratica2;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;


public class Garagem {

    private int id;
    private List<Veiculo> veiculos;

    public Garagem(int id, List<Veiculo> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public void listarVeiculosPorPrecoMenor() {
        veiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getPreco))
                .forEach(System.out::println);
    }

    public void listarVeiculosPorMarca() {
        veiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getMarca))
                .forEach(System.out::println);

    }


    public void listarVeiculosMenosQueMil() {
        veiculos.stream()
                .filter(v -> v.getPreco() < 1000)
                .forEach(System.out::println);


    }

    public OptionalDouble mostrarMediaDeValoresDosVeiculos() {
        return veiculos.stream()
                .mapToDouble(Veiculo::getPreco)
                .average();
    }


}
