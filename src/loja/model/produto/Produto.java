package loja.model.produto;
import java.math.BigDecimal;
public abstract class Produto {

    private int codigo;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private static int contador = 0;

    public Produto(String nome, String descricao, BigDecimal preco) {
        contador++;
        this.codigo = contador;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(BigDecimal preco) {
        if (preco != null && preco.compareTo(BigDecimal.ZERO) >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser nulo ou negativo.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.printf("Preço: R$ %.2f%n", getPreco());
    }
    public abstract String getTipoProduto();
}