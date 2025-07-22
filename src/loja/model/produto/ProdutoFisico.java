package loja.model.produto;
import java.math.BigDecimal;

public class ProdutoFisico extends Produto {

    private double pesoKg;
    private int estoque;

    public ProdutoFisico(String nome, String descricao, BigDecimal preco, double pesoKg,int estoque) {
        super(nome, descricao, preco);

        this.pesoKg = pesoKg;
        this.estoque = estoque;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
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

    @Override 
     public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Estoque: " + getEstoque());
        System.out.println("Peso: " + getPesoKg());
    }
}