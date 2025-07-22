package loja.model.produto;
import java.math.BigDecimal;

public class ProdutoFisico extends Produto {

    private double pesoKg;

    public ProdutoFisico(int codigo, String nome, String descricao, BigDecimal preco, int quantidade, double pesoKg) {
        super(codigo, nome, descricao, preco, quantidade);

        this.pesoKg = pesoKg;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

}