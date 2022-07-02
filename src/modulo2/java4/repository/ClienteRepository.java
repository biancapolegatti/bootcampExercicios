package modulo2.java4.repository;

import modulo2.java4.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository implements Repository<Cliente> {

    List<Cliente> listaClientes;

    public ClienteRepository() {
        this.listaClientes = new ArrayList<>();
    }

    @Override
    public void listar() {
        for (Cliente c : listaClientes) {
                System.out.println(c);
            }
        }


    @Override
    public void adicionar(Cliente objeto) {
        listaClientes.add(objeto);
    }

    @Override
    public void excluir(Cliente objeto) {
        listaClientes.remove(objeto);

    }

    @Override
    public void listarPorId(Integer id) {
        for (Cliente c : listaClientes) {
            if (c.getId().equals(id)) {
                System.out.println(c.toString());
            }

            if (!(c.getId().equals(id))) {
                System.out.println("Cliente não existente, informe outro ID");
            }
        }
    }
}