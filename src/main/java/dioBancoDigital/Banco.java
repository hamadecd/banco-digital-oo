package dioBancoDigital;

import java.util.List;

public class Banco {
	
	private String nomeBanco;
	private int numeroBanco;
	private List<Conta> contas;
	
	public String getNome() {
		return nomeBanco;
	}
	
	public void setNome(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	
	public int getNumeroBanco() {
		return numeroBanco;
	}

	public void setNumeroBanco(int numeroBanco) {
		this.numeroBanco = numeroBanco;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
