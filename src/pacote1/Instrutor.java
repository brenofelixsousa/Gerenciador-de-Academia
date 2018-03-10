package pacote1;

import java.util.Scanner;

public class Instrutor {
	
	Scanner read = new Scanner(System.in);
	
	private String nomeAcademia;
	private String nomeInstrutor;
	private String nomeUsuario;
	private String cpf;
	
	String nomeAcademia () {
		System.out.println("Nome da Academia: ");
		nomeAcademia = read.nextLine();
		return nomeAcademia;
	}
	String nomeInstrutor () {
		System.out.println("Nome do Instrutor: ");
		nomeInstrutor = read.nextLine();
		return nomeInstrutor;
	}
	String nomeUsuario () {
		System.out.println("Nome do Usuário: ");
		nomeUsuario = read.nextLine();
		return nomeUsuario;
	}
	String cpf () {
		System.out.println("Insira o CPF: ");
		cpf = read.next();
		return cpf;
	}
	

}
