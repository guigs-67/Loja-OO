package loja.model.produto;
import java.math.BigDecimal;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int quantidade;

    public Produto(int codigo, String nome, String descricao, BigDecimal preco,int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public BigDecimal getPreco() {
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setPreco(BigDecimal preco) {
        if (preco != null && preco.compareTo(BigDecimal.ZERO) >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser nulo ou negativo.");
        }
    }
}