package banco;

public class Banco {

	public static void main(String[] args) {
		
		Conta c1 = new ContaPagamento();
		Conta c2 = new ContaPoupanca();
		UsuarioESenha1 autenticarc1 = new UsuarioESenha1();
		UsuarioESenha2 autenticarc2 = new UsuarioESenha2();
		
	
		c1.nomeTitular = "Cristiano";
		c1.numConta = 001;
		
		
		
		c2.nomeTitular = "Tamara";
		c2.numConta = 002;
		
		System.out.println("Saldo da conta " + c1.numConta + " é " + c1.getSaldo());
		c1.depositar(100);
		
		System.out.println();
		
		
		System.out.println("Saldo da conta " + c2.numConta + " é " + c2.getSaldo());
		c2.depositar(50);
		
		System.out.println();
		
		autenticarc1.validarSenha(null);
		
		c1.sacar(80);
		System.out.println("Saldo da conta " + c1.numConta + " após o saque é " + c1.getSaldo());
		
		System.out.println();
		
		autenticarc2.validarSenha(null);
		c2.sacar(32);
		System.out.println("Saldo da conta " + c2.numConta + " após o saque é " + c2.getSaldo());
	}

}
