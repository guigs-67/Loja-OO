package loja.model.produto;
import java.math.BigDecimal;

public class ProdutoFisico extends Produto {

    private double pesoKg;

    public ProdutoFisico(String nome, String descricao, BigDecimal preco,int estoque, double pesoKg) {
        super(nome, descricao, preco, estoque);
        this.pesoKg = pesoKg;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    @Override
    public String getTipoProduto() {
        return "Físico";
    }
    
    @Override
	public void exibirDetalhes() {
    	System.out.println("Tipo: " + getTipoProduto());
		super.exibirDetalhes();
        System.out.println("Estoque: " + getEstoque());
        System.out.println("Peso: " + getPesoKg());
	}
}