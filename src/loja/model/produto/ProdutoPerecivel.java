package loja.model.produto;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoPerecivel extends ProdutoFisico {

    private LocalDate dataValidade;

    public ProdutoPerecivel(int codigo, String nome, String descricao, BigDecimal preco, int quantidade, double pesoKg, LocalDate dataValidade){

        super(codigo, nome, descricao, preco, quantidade, pesoKg);

        this.dataValidade = dataValidade;

    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(this.dataValidade);
    }
}
