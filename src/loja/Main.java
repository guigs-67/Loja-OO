package loja;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

import loja.model.produto.*;
import loja.model.cliente.*;
import loja.model.nota.*;


public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner (System.in);
		int opcaoInterna, codigo, estoque, ano, mes, dia;
		String nome, descricao, linkDownload, endereco, telefone, cpf, cnpj;
		double pesoKg, tamanhoArquivoMB;
		BigDecimal preco;
		LocalDate dataValidade;
		
		ProdutoDigital proDig;
		ProdutoFisico proFis;
		ProdutoPerecivel proPer;
		
		Produto[] BDProduto = new Produto[10];
		
		menu();
		int opcao = sc.nextInt();
		while (opcao != 0) {
			switch (opcao) {
			case 1:
				System.out.println("1. Produto físico;");
				System.out.println("2. Produto digital;");
				System.out.println("3. Produto perecível;");
				System.out.println("Digite qual o tipo de produto que você deseja cadastrar: ");
				opcaoInterna = sc.nextInt();
				
				if (opcaoInterna == 1) {
					System.out.println("Digite o código, nome, descrição, preço, quantidade em estoque e peso do produto:");
					codigo = sc.nextInt();
					nome = sc.nextLine();
					descricao = sc.nextLine();
					preco = sc.nextBigDecimal();
					quantidade = sc.nextInt();
					pesoKg = sc.nextDouble();
					
					proFis = new ProdutoFisico(codigo, nome, descricao, preco, pesoKg,estoque);
					for(int i = 0; i < BDProduto.length; i++) {
						if(BDProduto[i] == null)
							BDProduto[i] = proFis;
					}
				}
					else if (opcaoInterna == 2) {
						System.out.println("Digite o código, nome, descrição, preço, quantidade em estoque, link de download e tamanho do arquivo em MB:");
						codigo = sc.nextInt();
						nome = sc.nextLine();
						descricao = sc.nextLine();
						preco = sc.nextBigDecimal();
						quantidade = sc.nextInt();
						linkDownload = sc.nextLine();
						tamanhoArquivoMB = sc.nextDouble();
						
						proDig = new ProdutoDigital(codigo, nome, descricao, preco, linkDownload, tamanhoArquivoMB);
						
						for(int i = 0; i < BDProduto.length; i++) {
							if(BDProduto[i] == null)
								BDProduto[i] = proDig;
						}
					}
						else if (opcaoInterna == 3) {
							System.out.println("Digite o código, nome, descrição, preço, quantidade em estoque, peso do produto e data de validade (DD MM YYYY):");
							codigo = sc.nextInt();
							nome = sc.nextLine();
							descricao = sc.nextLine();
							preco = sc.nextBigDecimal();
							quantidade = sc.nextInt();
							pesoKg = sc.nextDouble();
							dia = sc.nextInt();
							mes = sc.nextInt();
							ano = sc.nextInt();
							dataValidade = LocalDate.of(ano, mes, dia);
							
							proPer = new ProdutoPerecivel(codigo, nome, descricao, preco, pesoKg,estoque, dataValidade);
							for(int i = 0; i < BDProduto.length; i++) {
								if(BDProduto[i] == null)
									BDProduto[i] = proPer;
							}
						}
			case 2:
				// Alterar produto
				
			case 3:
				// Cadastro do cliente (perguntar se é pf ou pj)
				
			case 4:
				// Alterar cliente
				
			case 5:
				// Criar nota de compra (selecionar cliente -> listar/filtrar); adicionar itens até confirmar;
				// perguntar se tem cupom de desconto (só pra ter um extra); resumo subtotal e total
				
			case 6:
				// listar notas emitidas (array de objetos)
				
			case 7:
				// listar produtos (array de objetos)
				
			case 8:
				// listar clientes (array de objetos)
			
			}
			
			menu();
			opcao=sc.nextInt();
	}
		
	}
	
	public static void menu() {
		
		System.out.println("1. Cadastrar produto;");
		System.out.println("2. Alterar Produto;");
		System.out.println("3. Cadastrar cliente;");
		System.out.println("4. Alterar cliente;");
		System.out.println("5. Criar Nota de Compra;");
		System.out.println("6. Listar Notas Emitidas;");
		System.out.println("7. Listar Produtos;");
		System.out.println("8. Listar Clientes;");
		System.out.println("0. Sair.");
		System.out.println("Digite a opção: ");
		
	}

}
