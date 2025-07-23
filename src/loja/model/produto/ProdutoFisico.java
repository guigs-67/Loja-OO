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
}