package loja.model.produto;
import java.math.BigDecimal;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int estoque;
    private static int contador = 0;

    public Produto(String nome, String descricao, BigDecimal preco, int estoque) {
    	contador++;
        this.codigo = contador;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
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

    
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setPreco(BigDecimal preco) {
        if (preco != null && preco.compareTo(BigDecimal.ZERO) >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser nulo ou negativo.");
        }
    }

    
    public boolean darBaixaEstoque(int quantidadeParaRemover) {
        if (quantidadeParaRemover <= 0) {
            System.out.println("Tentativa de baixa com quantidade inválida (" + quantidadeParaRemover + "). Operação cancelada.");
            return false;
        }
        if (this.estoque >= quantidadeParaRemover) {
            this.estoque -= quantidadeParaRemover;
            System.out.println("Baixa no estoque de " + getNome() + " realizada com sucesso.");
            return true; 

        } else {
            System.out.println("Não temos estoque suficiente de " + getNome());
            return false; //
        }
    }

    public void exibirDetalhes() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.printf("Preço: R$ %.2f%n", getPreco());
        System.out.println("Estoque: " + getEstoque());
    }
}