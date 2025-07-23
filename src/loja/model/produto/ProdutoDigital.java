package loja.model.produto;
import java.math.BigDecimal;

public class ProdutoDigital extends Produto {

    private String linkDownload;
    private double tamanhoArquivoMB;

    public ProdutoDigital(String nome, String descricao, BigDecimal preco, int estoque, String linkDownload, double tamanhoArquivoMB) {
        super(nome, descricao, preco, estoque);
        this.linkDownload = linkDownload;
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    public String getLinkDownload() {
        return linkDownload;
    }

    public void setLinkDownload(String linkDownload) {
        this.linkDownload = linkDownload;
    }

    public double getTamanhoArquivoMB() {
        return tamanhoArquivoMB;
    }

   public void setTamanhoArquivoMB(double tamanhoArquivoMB){
       this.tamanhoArquivoMB = tamanhoArquivoMB;
   }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho: " + getTamanhoArquivoMB() + " MB");
        System.out.println("Link: " + getLinkDownload());
    }
    
    @Override
    public String getTipoProduto() {
        return "Digital";
    }
}