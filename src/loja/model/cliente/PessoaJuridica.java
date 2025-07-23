package loja.model.cliente;

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getDocumento() {
        return this.cnpj;
    }
    
	@Override
    public void exibirDetalhes() {
		System.out.println("Tipo: Pessoa jurídica.");
	    super.exibirDetalhes();
		System.out.println("CNPJ: " + getCnpj());
	}
}
