package modulo2.java4.model;

public class Item {

    private Integer codigo;
    private Integer quantidade;
    private String nome;
    private Double preco;


    public Item(Integer codigo, Integer quantidade, String nome, Double preco) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codigo = " + codigo +
                ", quantidade =" + quantidade +
                ", nome = " + nome +
                ", preco = " + preco +
                '}';
    }
}
