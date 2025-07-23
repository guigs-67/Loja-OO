package loja.model.cliente;
public abstract class Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e Setters (permanecem os mesmos)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibirDetalhes() {
        System.out.println("  Nome: " + getNome());
        System.out.println("  Endereço: " + getEndereco());
        System.out.println("  Telefone: " + getTelefone());
        System.out.println("  Documento: " + getDocumento());
    }
    public abstract String getDocumento();
public class Cliente {
	private String nome;
	private String endereco;
	private String telefone;
	
	public Cliente (String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getEndereco () {
		return endereco;
	}
	
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	} 
	
	public String getTelefone () {
		return telefone; 
	}
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
	public void exibirDetalhes() {
	    System.out.println("Nome: " + getNome());
	    System.out.println("Endereço: " + getEndereco());
	    System.out.println("Telefone: " + getTelefone());
		}
}