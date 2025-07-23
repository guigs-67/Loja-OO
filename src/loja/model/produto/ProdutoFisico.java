package loja.model.produto;
import java.math.BigDecimal;

public class ProdutoFisico extends Produto {

    private double pesoKg;

    public ProdutoFisico(String nome, String descricao, BigDecimal preco,int estoque,double pesoKg) {
        super(nome, descricao, preco,estoque);
        this.pesoKg = pesoKg;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }


    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Estoque: " + getEstoque());
        System.out.println("Peso: " + getPesoKg() + " kg");
    }

    @Override
    public String getTipoProduto() {
        return "Físico";
    }
=======
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
    	System.out.println("Tipo: Produto físico.");
		super.exibirDetalhes();
        System.out.println("Estoque: " + getEstoque());
        System.out.println("Peso: " + getPesoKg());
	}
>>>>>>> bugs-sintaxe
}