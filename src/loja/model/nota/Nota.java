package loja.model.nota;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import loja.model.cliente.*;
import loja.model.produto.*;

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
        this.itens = itens; 
        this.subtotalFinal = subtotalFinal;
        this.frete = frete; 
        this.total = total;
        this.id = 1;
        this.data = LocalDate.now();
        this.ProxPosicao = 0;
        for(ItemNota item : itens){
            if (item != null) {
                this.ProxPosicao++;
            }
        }
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
    
    public int getProxPosicao() {
    	return ProxPosicao;
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

    public BigDecimal somaSubtotalFinal() {
        BigDecimal acc = new BigDecimal("0.0"); 
        for (int i = 0; i < this.ProxPosicao; i++) {
            acc = acc.add(( this.itens[i]).getPrecoFinalItem());
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

   public void exibirNotaFiscal() {
    System.out.println("\n=============================================");
    System.out.println("            NOTA FISCAL                  ");
    System.out.println("=============================================");
    System.out.println("ID da Nota: " + this.getId());
    System.out.println("Data de Emissão: " + this.getData());
    System.out.println("---------------------------------------------");
    System.out.println("CLIENTE:");
    this.getCliente().exibirDetalhes();
    System.out.println("---------------------------------------------");
    System.out.println("ITENS DA COMPRA:");

    for (int i = 0; i < this.ProxPosicao; i++) {
        ItemNota item = this.itens[i];
        Produto produto = item.getProduto();

        System.out.println(
            item.getQuantidade() + "x " +
            produto.getNome() +
            " (R$ " + produto.getPreco() + ")" +
            " - Subtotal: R$ " + item.getPrecoFinalItem()
        );
    }
    System.out.println("---------------------------------------------");
    System.out.println("SUBTOTAL: R$ " + this.somaSubtotalFinal());
    System.out.println("FRETE: R$ " + this.getFrete());
    System.out.println("=============================================");
    System.out.println("TOTAL A PAGAR: R$ " + this.somaTotalFinal());
    System.out.println("=============================================\n");
}
}