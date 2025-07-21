package loja.model.produto;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoPerecivel extends ProdutoFisico {

    private LocalDate dataValidade;

    public ProdutoPerecivel(int codigo, String nome, String descricao, BigDecimal preco, double pesoKg, int quantidade, LocalDate dataValidade){

        super(codigo, nome, descricao, preco, pesoKg, quantidade);

        this.dataValidade = dataValidade;

    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(this.dataValidade);
    }
}
