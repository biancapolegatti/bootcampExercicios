package modulo2.java3.pratica1.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImprimirMain {

    public static void main(String[] args) {

        List<String> listaHabilidades = List.of("Programar em java", "Programar em JS", "Conhecimento em JB");

        Pessoa p1 = new Pessoa("Beatriz", "Silva", 18, "Dev");
        Curriculo c1 = new Curriculo("CV", p1, listaHabilidades);
        Imprimir.imprimirDocumento(c1);


        Livro l1 = new Livro("Livro", "Harry Potter e a Pedra Filosofal", "Fantasia", "JK Rowling", 500);
        Imprimir.imprimirDocumento(l1);

        Relatorio r1 = new Relatorio("Relatório", "Caio", "João", 5, 3);
        Imprimir.imprimirDocumento(r1);


    }
}
