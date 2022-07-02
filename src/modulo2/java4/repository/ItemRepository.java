package modulo2.java4.repository;

import modulo2.java4.model.Cliente;
import modulo2.java4.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository implements Repository<Item> {

    List<Item> listaItens;

    public ItemRepository() {
        this.listaItens = new ArrayList<>();
    }

    @Override
    public void listar() {
        for (Item i : listaItens) {
            System.out.println(i);
        }
    }

    @Override
    public void adicionar(Item objeto) {
        listaItens.add(objeto);

    }

    @Override
    public void excluir(Item objeto) {
        listaItens.remove(objeto);

    }

    @Override
    public void listarPorId(Integer id) {

    }
}
