package loja.model.produto;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoPerecivel extends ProdutoFisico {

    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, String descricao, BigDecimal preco, double pesoKg,int estoque, LocalDate dataValidade){

        super(nome, descricao, preco, pesoKg,estoque);

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
