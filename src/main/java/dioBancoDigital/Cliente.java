package dioBancoDigital;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class Cliente {

	private String nome;
    
    public abstract String getDocumento();
	public abstract void setDocumento(String documento);

    public Cliente(String nome) {
		this.nome = nome;
	}

}
