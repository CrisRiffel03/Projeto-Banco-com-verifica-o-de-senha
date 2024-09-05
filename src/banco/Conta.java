package banco;

import java.util.Scanner;

public class Conta {
	
	public String nomeTitular;
	public int numConta;
	public double saldo;
	protected double taxaSaque = 0.0;
	
	public boolean depositar(double valor) {
		this.saldo = this.saldo + valor;
		return true;
	}
	
	public boolean sacar(double valor) {
		Scanner scan = new Scanner(System.in);
		
		if(valor + this.taxaSaque <= this.saldo) {
			this.saldo = this.saldo - valor - this.taxaSaque;
			System.out.println("Operação realizada com sucesso! ");
			return true;
		}else {
			System.out.println("Não foi possível realizar operação o saldo da conta é " + this.saldo );
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean transferir(Conta contaDestino, double valor) {
		if(this.sacar(valor) == true) {
			contaDestino.depositar(valor);
			return true;
		}else {
			return false;
		}
	}
	

}
