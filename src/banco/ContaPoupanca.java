package banco;

public class ContaPoupanca extends Conta{
	public boolean sacar(double valor) {
		super.taxaSaque = 0.0;
		return super.sacar(valor);
	}

}
