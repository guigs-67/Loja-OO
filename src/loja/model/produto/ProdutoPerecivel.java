package loja.model.produto;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoPerecivel extends ProdutoFisico {

    private LocalDate dataValidade;

<<<<<<< HEAD
    public ProdutoPerecivel(String nome, String descricao, BigDecimal preco,int estoque, double pesoKg, LocalDate dataValidade){
=======
    public ProdutoPerecivel(String nome, String descricao, BigDecimal preco, double pesoKg, int estoque, LocalDate dataValidade){

        super(nome, descricao, preco, pesoKg, estoque);
>>>>>>> bugs-sintaxe

        super(nome, descricao, preco,estoque,pesoKg);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }
    
    public void setDataValidade(LocalDate dataValidade) {
    	this.dataValidade = dataValidade;
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(this.dataValidade);
    }

    public void setDataValidade(LocalDate dataValidade){
        this.dataValidade = dataValidade;
    }

    @Override
    public void exibirDetalhes() {
<<<<<<< HEAD
        super.exibirDetalhes();
          System.out.println("Data de Validade: " + getDataValidade());
          if (estaVencido()) {
=======
        System.out.printf("Tipo: Produto perecível e ");
    	super.exibirDetalhes(); 
        System.out.println("Data de Validade: " + getDataValidade());
        if (estaVencido()) {
>>>>>>> bugs-sintaxe
            System.out.println("ATENÇÃO: PRODUTO VENCIDO!");
        } 
    }

    @Override
    public String getTipoProduto() {
        return "Perecível";
    }
}
