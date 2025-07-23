package loja.model.cliente;

public class PessoaFisica extends Cliente {
	private String cpf;
	
	public PessoaFisica (String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone);
		this.cpf = cpf; 
	}
	
	public String getCpf () {
		return cpf; 
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	} 

	@Override
	public void exibirDetalhes() {
		System.out.println("Tipo: Pessoa física.");
	    super.exibirDetalhes();
		 System.out.println("CPF: " + getCpf());
	}
}
