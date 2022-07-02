package modulo2.java4.repository;

import modulo2.java4.model.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaRepository implements Repository<Fatura> {

    private List<Fatura> listaFatura;


    public FaturaRepository() {
        this.listaFatura = new ArrayList<>();
    }

    @Override
    public void listar() {
        for (Fatura i : listaFatura) {
            System.out.println(i);
        }
    }


    @Override
    public void adicionar(Fatura objeto) {
        listaFatura.add(objeto);

    }

    @Override
    public void excluir(Fatura objeto) {
        listaFatura.remove(objeto);

    }

    //falta implementar o buscar por ID
    @Override
    public void listarPorId(Integer id) {

    }
}
