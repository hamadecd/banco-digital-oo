package dioBancoDigital;

public class PessoaJuridica extends Cliente {

	private String cnpj;
	
	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	@Override
	public String getDocumento() {
		return cnpj;
	}

	@Override
	public void setDocumento(String documento) {
		this.cnpj = documento;
	}
}
