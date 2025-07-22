package loja.model.produto;
import java.math.BigDecimal;

public class ProdutoDigital extends Produto {

    private String linkDownload;
    private double tamanhoArquivoMB; 

    public ProdutoDigital(int codigo, String nome, String descricao, BigDecimal preco, String linkDownload, double tamanhoArquivoMB) {
        super(codigo, nome, descricao, preco);

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

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); 
        System.out.println("Tamanho: " getTamanhoArquivoMB());
        System.out.println("Link: " getLinkDownload());
    }
}