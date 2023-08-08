package banco.fiap.dominio;

import banco.fiap.DepositoInvalidoException;
import banco.fiap.SaqueInvalidoException;

public class ContaCorrente {

	private double saldo;
	
	public ContaCorrente(double saldo){
		this.saldo = saldo;
	}
	
	public void saque(double valor){
		if(valor > saldo) {
			throw new SaqueInvalidoException("Valor do saque maior que o saldo atual. Saque não realizado");
		}
		else {
			saldo = saldo - valor;
		}
	}
	
	public void deposito(double valor) throws DepositoInvalidoException {
		
		if(valor < 0) {
			throw new DepositoInvalidoException("Valor do deposito não é real. Impossível realizar o deposito.");
		}
		else {
		saldo = saldo + valor;
		}
	}
	
	public double saldo() {
		return saldo;
	}
}
