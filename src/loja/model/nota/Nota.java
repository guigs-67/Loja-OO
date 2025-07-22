package loja.model.nota;

import java.math.BigDecimal;
import java.time.*;
import java.time.format.DateTimeFormatter;

import loja.model.cliente;
import loja.model.produto;

public class Nota {

    private Cliente cliente;
    private ItemNota[] itens;
    private BigDecimal subtotalFinal;
    private BigDecimal frete;
    private BigDecimal total;
    private int id;
    private LocalDate data;
    private int ProxPosicao;


    public Nota(Cliente cliente, ItemNota[] itens, BigDecimal subtotalFinal, BigDecimal desconto, BigDecimal frete, BigDecimal total){

        this.cliente = cliente;
        this.itens = new ItemNota[10];
        this.subtotalFinal = subtotalFinal;
        this.frete = new BigDecimal(50);
        this.total = total;
        this.id = 1;
        this.data = LocalDate.now(0);
        this.ProxPosicao = 0;
    }

    public void setSubtotalFinal(BigDecimal subtotalFinal){
        this.subtotalFinal = subtotalFinal;
    }

    public void setFrete(BigDecimal frete){
        this.frete = frete;
    }

    public void setTotal(BigDecimal total){
        this.total = total;
    }

    public void setId(int id){
        this.id = id;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public ItemNota[] getItemNota(){
        return itens;
    }

    public BigDecimal getSubtotalFinal(){
        return subtotalFinal;
    }

    public BigDecimal getFrete(){
        return frete;
    }

    public BigDecimal getTotal(){
        return total;
    }
    
    public int getId(){
        return id;
    }

    public String getData(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatador);
    }

    public void adicionarItem(ItemNota novoItem){
        if(ProxPosicao == itens.length){
            ItemNota[] aux = new ItemNota[ProxPosicao + 10];
            for (int i = 0; i < itens.length; i++){
                aux[i] = itens[i];
            }
            itens = aux;
        }
        itens[ProxPosicao] = novoItem;
        ProxPosicao++;
    }

    public BigDecimal somaSubtotalFinal(){
        BigDecimal acc = new BigDecimal(0);
        for(int i = 0; i < itens.length; i++){
            acc = acc.add(itens[i].getPrecoFinalItem());
        }
        return acc;
    }

    public BigDecimal somaTotalFinal(){
        BigDecimal acc = new BigDecimal(0);
        acc = this.somaSubtotalFinal().add(this.getFrete());
        return acc;
    }
    
    public int atualizaID(){
        return this.id = this.id + 1;
    }
}

