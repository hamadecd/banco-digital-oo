package dioBancoDigital;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Banco {
	
	private String nomeBanco;
	private int numeroBanco;
	private List<Conta> contas;
	
}
