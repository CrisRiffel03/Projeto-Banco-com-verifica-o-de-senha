package banco;

public class ContaPagamento extends Conta {
	public boolean sacar(double valor){
		super.taxaSaque = 1.0;
		return super.sacar(valor);
	}

}
