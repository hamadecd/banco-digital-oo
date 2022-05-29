package dioBancoDigital;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Agencia {
	
	private String nome;
	private int numero;
	
	public Agencia(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}

}
