package loja.model.produto;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {

    private double pesoKg;
    private int estoque;
    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, String descricao, BigDecimal preco, double pesoKg,int estoque, LocalDate dataValidade){

        super(nome, descricao, preco);
        this.estoque = estoque;
        this.pesoKg = pesoKg;
        this.dataValidade = dataValidade;

    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(this.dataValidade);
    }
    
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); 
        System.out.println("Data de Validade: " + getDataValidade());
        if (estaVencido()) {
            System.out.println("ATENÇÃO: PRODUTO VENCIDO!");
    }
    }
}
