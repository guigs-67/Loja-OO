package loja;

import java.utils.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Colocar dentro de um loop pra só parar se o usuário digitar 0?
		
		System.out.println("Digite o número de qual operação você deseja efetuar:/n");
		System.out.println("1. Cadastrar produto;");
		System.out.println("2. Alterar Produto;");
		System.out.println("3. Cadastrar cliente;");
		System.out.println("4. Alterar cliente;");
		System.out.println("5. Criar Nota de Compra;");
		System.out.println("6. Listar Notas Emitidas;");
		System.out.println("7. Listar Produtos;");
		System.out.println("8. Listar Clientes;");
		System.out.println("0. Sair.");

		switch (sc) {
		case 1:
			// Cadastro do produto (perguntar o tipo de produto (fisico, digital ou perecível) e armazenar)
			
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
			
		case 0:
			break;
		}
	}

}
