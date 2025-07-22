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
		int opcaoInterna, codigo, estoque,quantidade, ano, mes, dia;
		String nome, descricao, linkDownload, endereco, telefone, cpf, cnpj;
		double pesoKg, tamanhoArquivoMB;
		BigDecimal preco;
		LocalDate dataValidade;
		
		ProdutoDigital proDig;
		ProdutoFisico proFis;
		ProdutoPerecivel proPer;

		PessoaFisica pesFis;
		PessoaJuridica pesJur;
		
		Produto[] BDProduto = new Produto[10];
		Cliente[] BDCliente = new Cliente[10];
		
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
				
				 sc.nextLine();

				if (opcaoInterna == 1) {
					System.out.println("Digite o código, nome, descrição, preço, quantidade em estoque e peso do produto:");
					codigo = sc.nextInt();
					sc.nextLine();
					nome = sc.nextLine();
					descricao = sc.nextLine();
					preco = sc.nextBigDecimal();
					sc.nextLine();
					estoque = sc.nextInt();
					sc.nextLine();
					pesoKg = sc.nextDouble();
					sc.nextLine();
					
					proFis = new ProdutoFisico(codigo, nome, descricao, preco, pesoKg,estoque);
					for(int i = 0; i < BDProduto.length; i++) {
						if(BDProduto[i] == null)
							BDProduto[i] = proFis;
					}
				}
					else if (opcaoInterna == 2) {
						System.out.println("Digite o código, nome, descrição, preço, quantidade em estoque, link de download e tamanho do arquivo em MB:");
						codigo = sc.nextInt();
						sc.nextLine(); 
						nome = sc.nextLine();
						descricao = sc.nextLine();
						preco = sc.nextBigDecimal();
						sc.nextLine(); 
						estoque = sc.nextInt();
						sc.nextLine(); 
						linkDownload = sc.nextLine();
						tamanhoArquivoMB = sc.nextDouble();
						sc.nextLine(); 
						
						proDig = new ProdutoDigital(codigo, nome, descricao, preco, linkDownload, tamanhoArquivoMB);
						for(int i = 0; i < BDProduto.length; i++) {
							if(BDProduto[i] == null)
								BDProduto[i] = proDig;
						}
					}
					else if (opcaoInterna == 3) {
						System.out.println("Digite o código, nome, descrição, preço, quantidade em estoque, peso do produto e data de validade (DD MM YYYY):");
						codigo = sc.nextInt();
						sc.nextLine(); 
						nome = sc.nextLine();
						descricao = sc.nextLine();
						preco = sc.nextBigDecimal();
						sc.nextLine(); 
						estoque = sc.nextInt();
						sc.nextLine(); 
						pesoKg = sc.nextDouble();
						sc.nextLine(); 
						dia = sc.nextInt();
						mes = sc.nextInt();
						ano = sc.nextInt();
						sc.nextLine(); 
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
					System.out.println("1. Pessoa física ;");
					System.out.println("2. Pessoa Jurídica;");
					System.out.println("Digite qual o tipo de cliente que você deseja cadastrar: ");
					opcaoInterna = sc.nextInt();
						
					sc.nextLine();

					if (opcaoInterna == 1) {
						System.out.println("Digite o nome, endereço, telefone, cpf");
						nome = sc.nextLine();
						endereco = sc.nextLine();
						telefone = sc.nextLine(); 
						cpf = sc.nextLine();

						pesFis = new PessoaFisica(nome, endereco, telefone, cpf);
						for (int i = 0; i < BDCliente.length; i++) {
							if (BDCliente[i] == null)
								BDCliente[i] = pesFis;
						}

					} else if (opcaoInterna == 2) {
						System.out.println("Digite o nome, endereço, telefone, cnpj");
						nome = sc.nextLine();
						endereco = sc.nextLine();
						telefone = sc.nextLine(); 
						cnpj = sc.nextLine();
							
						pesJur = new PessoaJuridica(nome, endereco, telefone, cnpj);
						for (int i = 0; i < BDCliente.length; i++) {
							if (BDCliente[i] == null)
								BDCliente[i] = pesJur; 
						}
					}

			case 4:
				// Alterar cliente
				
			case 5:
				// Criar nota de compra (selecionar cliente -> listar/filtrar); adicionar itens até confirmar;
				// perguntar se tem cupom de desconto (só pra ter um extra); resumo subtotal e total
				
			case 6:
				// listar notas emitidas (array de objetos)
				
			case 7:
					System.out.println("\n--- Lista de Produtos Cadastrados ---");
    				boolean encontrouProduto = false;

    				for (Produto produto : BDProduto) {
       				 if (produto != null) {
           				encontrouProduto = true;
            			produto.exibirDetalhes();  
           		        System.out.println("-------------------------------------");
        	}
    	}

    				if (!encontrouProduto) {
       				 System.out.println("Nenhum produto cadastrado no sistema.");
    	}



			case 8:
					System.out.println("\n--- Lista de Clientes Cadastrados ---");
    				boolean encontrouCliente = false;
					for (Cliente cliente : BDCliente) {
        			if (cliente != null) {
            			cliente.exibirDetalhes();
            			System.out.println("-------------------------------------");
            			encontrouCliente = true;
       		 }
   		 }
    				if (!encontrouCliente) {
      				  System.out.println("Nenhum cliente cadastrado no sistema.");
    	}
			
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
