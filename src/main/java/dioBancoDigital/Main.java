package dioBancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco();
		banco.setNomeBanco("Itau");
		banco.setNumeroBanco(1);

		Cliente fulano = new PessoaFisica("Fulano", "08906191668");
		Cliente ciclano = new PessoaFisica("Ciclano", "07898745225");
		Cliente beltrano = new PessoaFisica("Beltrano", "12345678909");

		Agencia agenciaCentro = new Agencia("Agencia Centro", 1);
		Agencia agenciaJardimAmerica = new Agencia("Agencia Jardim America", 2);
		Agencia agenciaCandolas = new Agencia("Agencia Candolas", 3);

		List<Conta> listaContas = new ArrayList<Conta>();
		Conta contaPoupancaFulano;
		// adicionando na lista de Contas, assim garanto que toda conta instanciada ja vai
		// estar na lista
		listaContas.add(contaPoupancaFulano = new ContaPoupanca(fulano, agenciaCentro));
		Conta contaCorrenteFulano;
		listaContas.add(contaCorrenteFulano = new ContaCorrente(fulano, agenciaCentro));
		Conta contaPoupancaCiclano;
		listaContas.add(contaPoupancaCiclano = new ContaPoupanca(ciclano, agenciaJardimAmerica));
		Conta contaCorrenteCiclano;
		listaContas.add(contaCorrenteCiclano = new ContaCorrente(ciclano, agenciaJardimAmerica));
		Conta contaPoupancaBeltrano;
		listaContas.add(contaPoupancaBeltrano = new ContaPoupanca(beltrano, agenciaCandolas));
		Conta contaCorrenteBeltrano;
		listaContas.add(contaCorrenteBeltrano = new ContaCorrente(beltrano, agenciaCandolas));

		contaCorrenteFulano.depositar(1300);
		contaCorrenteFulano.sacar(500);
		contaCorrenteFulano.transferir(300, contaPoupancaFulano);
		contaCorrenteCiclano.depositar(2000);
		contaCorrenteCiclano.transferir(500, contaPoupancaCiclano);
		contaCorrenteCiclano.imprimirExtrato();
		contaPoupancaCiclano.imprimirExtrato();
		contaCorrenteFulano.imprimirExtrato();
		contaPoupancaFulano.imprimirExtrato();
		contaCorrenteBeltrano.imprimirExtrato();
		contaPoupancaBeltrano.imprimirExtrato();

		banco.setContas(listaContas);
		System.out.println(banco.getContas());

	}

}
