package banco;

import java.util.Scanner;

public class UsuarioESenha2 {

Scanner scan = new Scanner(System.in);
	
	public boolean usuario = false;
	public boolean password = false;
	public String nome;
	public String senha;
	
	public void validarUsuario(String nome) { 
 
	
	do {
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		
	if(!nome.equalsIgnoreCase("Julia")) {
			System.out.println("Usuário inválido! Digite novamente: ");
		}else {
			usuario = true;
		}
	}while(!usuario);
	}
	
	public void validarSenha(String senha) {
	do {
		System.out.println("Digite sua senha para realizar a operação: ");
		senha = scan.next();
		
		if(!senha.equalsIgnoreCase("1235")) {
			System.out.println("Senha inválida! Digite novamente: ");
		}else {
			password = true;
			System.out.println("Login realizado com sucesso! ");
		}
	}while (!password);
	
}
}
