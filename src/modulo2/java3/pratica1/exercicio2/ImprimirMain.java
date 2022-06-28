package modulo2.java3.pratica1.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImprimirMain {

    public static void main(String[] args) {

        List<String> listaHabilidades = List.of("Programar em java", "Programar em JS", "Conhecimento em JB");

        Curriculo c1 = new Curriculo("Isabela", "Silva", 18, "Secretaria", listaHabilidades);
        c1.imprimir();

        Livro l1 = new Livro("Harry Potter e a Pedra Filosofal", "Fantasia", "JK Rowling", 500);
        l1.imprimir();

        Relatorio r1 = new Relatorio("Caio", "João", 5, 3);
        r1.imprimir();


    }
}
