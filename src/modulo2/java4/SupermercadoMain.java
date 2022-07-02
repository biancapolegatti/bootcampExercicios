package modulo2.java4;

import modulo2.java4.model.Cliente;
import modulo2.java4.model.Fatura;
import modulo2.java4.model.Item;
import modulo2.java4.repository.ClienteRepository;
import modulo2.java4.repository.FaturaRepository;
import modulo2.java4.repository.ItemRepository;

import java.util.ArrayList;
import java.util.List;

public class SupermercadoMain {

    public static void main(String[] args) {

        ClienteRepository clienteRepository = new ClienteRepository();
        FaturaRepository faturaRepository = new FaturaRepository();
        ItemRepository itemRepository = new ItemRepository();


        Cliente b1 = new Cliente(0, "Bia", "Silva");
        Cliente b2 = new Cliente(1, "Belinha", "Sousa");
        Cliente b3 = new Cliente(2, "Tata", "Farias");

        clienteRepository.adicionar(b1);
        clienteRepository.adicionar(b2);
        clienteRepository.adicionar(b3);

        clienteRepository.listar();

        System.out.println("Excluindo o cliente Bia");
        clienteRepository.excluir(b1);

        System.out.println("Imprimindo a nova lista");
        clienteRepository.listar();


        Item item1 = new Item(1,1, "Bolacha", 1.99);
        Item item2 = new Item(2,1, "Arroz", 3.99);
        Item item3 = new Item(1,3, "Macarrão", 5.99);
        itemRepository.adicionar(item1);
        itemRepository.adicionar(item2);
        itemRepository.adicionar(item3);


        itemRepository.listar();

      //  Fatura f1 = new Fatura(b2, item.ge);


      //  clienteRepository.listarPorId(2); //não está funcionando direito caso o ID não existe, necessário refatorar


    }

}



