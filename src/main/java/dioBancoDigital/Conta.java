package dioBancoDigital;

import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

	private static int SEQUENCIAL = 1;
	protected int conta;
	protected double saldo;
	private Cliente cliente;
	private Agencia agencia;

	public Conta(Cliente cliente, Agencia agencia) {
		this.agencia = agencia;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	protected void imprimirInfosConta() {
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %s", agencia.getNome()));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public String toString() {
		return "Conta: \nagencia= " + agencia.getNome() + ", conta= " + conta + ", saldo= " + saldo + ", cliente= "
				+ cliente.getNome() + "\n";
	}
}
