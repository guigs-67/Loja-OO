package loja.model.nota;

import java.math.BigDecimal;
import loja.model.produto;
import loja.model.cliente;

public class ItemNota{
    private Produto produto;
    private int quantidade;

    public ItemNota(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public Produto getProduto(){
        return produto;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public BigDecimal getPrecoFinalItem(){
        return produto.getPreco().multiply(new BigDecimal(this.quantidade));
    }
}
