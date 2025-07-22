 package loja;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

import loja.model.produto.*;
import loja.model.cliente.*;
import loja.model.nota.*;


public class Main {
	
	private static int ultimoProduto = 0;
	private static int ultimoCliente = 0;
	private static int ultimaNota = 0;

	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner (System.in);
		int opcaoInterna, estoque, quantidade, ano, mes, dia;
		String nome, descricao, linkDownload, endereco, telefone, cpf, cnpj;
		double pesoKg, tamanhoArquivoMB;
		BigDecimal preco;
		LocalDate dataValidade;
		
		ProdutoDigital proDig;
		ProdutoFisico proFis;
		ProdutoPerecivel proPer;

		PessoaFisica pesFis;
		PessoaJuridica pesJur;
		
		Produto[] BDProduto = new Produto[1];
		Cliente[] BDCliente = new Cliente[1];
		Nota[] BDNota = new Nota[10];
		
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

				if (ultimoProduto == BDProduto.length) {
					Produto[] aux = new Produto[BDProduto.length + 1];
					for (int i = 0; i < BDProduto.length; i++) {
						aux[i] = BDProduto[i];
						}
					BDProduto = aux;
					}
				 
				if (opcaoInterna == 1) {
					System.out.println("Digite o nome do produto: ");
					nome = sc.nextLine();
					System.out.println("Digite a descrição do produto: ");
					descricao = sc.nextLine();
					System.out.println("Digite o preço do produto: ");
					preco = sc.nextBigDecimal();
					sc.nextLine();
					System.out.println("Digite a quantidade em estoque do produto: ");
					estoque = sc.nextInt();
					sc.nextLine();
					System.out.println("Digite o peso em kg do produto: ");
					pesoKg = sc.nextDouble();
					sc.nextLine();
					
					proFis = new ProdutoFisico(nome, descricao, preco, pesoKg,estoque);
					BDProduto[ultimoProduto] = proFis; 
					ultimoProduto++;
					}
				else if (opcaoInterna == 2) {
					System.out.println("Digite o nome do produto: ");
					nome = sc.nextLine();
					System.out.println("Digite a descrição do produto: ");						
					descricao = sc.nextLine();
					System.out.println("Digite o preço do produto: ");
					preco = sc.nextBigDecimal();
					sc.nextLine();
					System.out.println("Digite o link para download: ");
					linkDownload = sc.nextLine();
					System.out.println("Digite o tamanho do arquivo em MB:");
					tamanhoArquivoMB = sc.nextDouble();
					sc.nextLine(); 
						
					proDig = new ProdutoDigital(nome, descricao, preco, linkDownload, tamanhoArquivoMB);
					BDProduto[ultimoProduto] = proDig; 
					ultimoProduto++;
					}
				else if (opcaoInterna == 3) {
					System.out.println("Digite o nome do produto: ");
					nome = sc.nextLine();
					System.out.println("Digite a descrição do produto: ");;
					descricao = sc.nextLine();
					System.out.println("Digite o preço do produto: ");
					preco = sc.nextBigDecimal();
					sc.nextLine();
					System.out.println("Digite a quantidade em estoque do produto: ");
					estoque = sc.nextInt();
					sc.nextLine();
					System.out.println("Digite o peso em kg do produto: ");
					pesoKg = sc.nextDouble();
					sc.nextLine();
					System.out.println("Digite o dia da data de validade: ");
					dia = sc.nextInt();
					System.out.println("Digite o mês da data de validade: ");
					mes = sc.nextInt();
					System.out.println("Digite o ano da data de validade: ");
					ano = sc.nextInt();
					sc.nextLine(); 
					dataValidade = LocalDate.of(ano, mes, dia);
					
					proPer = new ProdutoPerecivel(nome, descricao, preco, pesoKg,estoque, dataValidade);
					BDProduto[ultimoProduto] = proPer;
					ultimoProduto++;
					}
				break;
			case 2:
				// Alterar produto
				
			case 3:
				System.out.println("1. Pessoa física ;");
				System.out.println("2. Pessoa Jurídica;");
				System.out.println("Digite qual o tipo de cliente que você deseja cadastrar: ");
				opcaoInterna = sc.nextInt();
						
				sc.nextLine();
					
				if (ultimoCliente == BDCliente.length) {
					Cliente[] aux = new Cliente[BDCliente.length + 1];
					for (int i = 0; i < BDCliente.length; i++) {
						aux[i] = BDCliente[i];
						}
					BDCliente = aux;
					
					if (opcaoInterna == 1) {
						System.out.println("Digite o nome do cliente");
						nome = sc.nextLine();
						System.out.println("Digite o endereço do cliente: ");
						endereco = sc.nextLine();
						System.out.println("Digite o telefone do ciente: ");
						telefone = sc.nextLine(); 
						System.out.println("Digite o CPF do cliente: ");
						cpf = sc.nextLine();

						pesFis = new PessoaFisica(nome, endereco, telefone, cpf);
						BDCliente[ultimoProduto] = pesFis; 
						ultimoProduto++;

					} 
					else if (opcaoInterna == 2) {
						System.out.println("Digite o nome do cliente");
						nome = sc.nextLine();
						System.out.println("Digite o endereço do cliente: ");
						endereco = sc.nextLine();
						System.out.println("Digite o telefone do ciente: ");
						telefone = sc.nextLine(); 
						System.out.println("Digite o CNPJ do cliente: ");
						cnpj = sc.nextLine();
							
						pesJur = new PessoaJuridica(nome, endereco, telefone, cnpj);
						BDCliente[ultimoProduto] = pesJur; 
						ultimoProduto++;
						}
					}
			case 4:
				// Alterar cliente
				
			case 5:
				// Criar nota de compra (selecionar cliente -> listar/filtrar); adicionar itens até confirmar;
				// perguntar se tem cupom de desconto (só pra ter um extra); resumo subtotal e total
				
			case 6:
				System.out.println("\n--- Lista de Notas Emitidas ---");
				boolean encontrouNota = false;
				for (Nota nota : BDNota) {
					if (nota != null) {
						nota.exibirNotaFiscal();
						encontrouNota = true;
						}
					}
				if (!encontrouNota) {
					System.out.println("Nenhuma nota fiscal foi emitida no sistema.");
					}
				break; 	
								
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
       			System.out.println("-------------------------------------");
       			}
    			break;
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
					System.out.println("-------------------------------------");
					}
				break;
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
