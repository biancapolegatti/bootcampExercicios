package modulo2.java4.repository;

import java.util.List;

public interface Repository<T> {

    void listar();

    void adicionar(T objeto); //O T é algo generico

    void excluir(T objeto);

    void listarPorId(Integer id);

}


//eu havia feito já delimitando os objetos, porque implementei primeiro o cliente, mas tem
//que se atentar que a interface será usada por todos, por isso deve ser genérico para
//depois as classes específicas fazer as respectivas implementações
