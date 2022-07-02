package modulo2.java4.model;

import java.util.List;

public class Fatura {

    private Cliente cliente;
    private List<Item> listaItens;
    private Double totalCompra;

    public Fatura(Cliente cliente, List<Item> itens) {
        this.cliente = cliente;
        this.listaItens = listaItens;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return listaItens;
    }

    public void setItens(List<Item> itens) {
        this.listaItens = itens;
    }

    public Double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Double totalCompra) {
        this.totalCompra = totalCompra;
    }


    @Override
    public String toString() {
        return "Fatura{" +
                "cliente = " + cliente +
                ", itens= " + listaItens +
                ", totalCompra= " + totalCompra +
                '}';
    }
}
