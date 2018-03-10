package pacote1;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Vector usuarios = new Vector();

		Academia a = new Academia();
		Instrutor in = new Instrutor();
		Usuario u = new Usuario();
		Imc i = new Imc();
		Treinos t = new Treinos();
		Lista l = new Lista();
		
		int login;
		String nomeUsuario;
		int opInst;
		String nomeAcademia;
		String nomeInstrutor;
		String cpf;
		int idade;
		
		System.out.println("Olá, seja bem-vindo!");
		System.out.println("Digite 1 para fazer Login: ");
		System.out.println("Digite 2 para Cadastrar-se: ");
		System.out.println("Digite 0 para Sair: ");
		login = read.nextInt();
		
		switch (login) {
		case (0):
			break;
		case (1):
			break;
		case (2):
			System.out.println("Você é um Instrutor?");
			System.out.println("Digite 1 para sim ou 0 para não: ");
			opInst = read.nextInt();
			if (opInst == 1) {
				usuarios.add(u.nomeAcademia());
				usuarios.add(u.nomeInstrutor());
				usuarios.add(u.cpf());
				
			} else if (opInst == 0) {
					usuarios.add(u.nomeAcademia());
					usuarios.add(u.nomeUsuario());
					usuarios.add(u.nomeInstrutor());
					usuarios.add(u.idade());
					usuarios.add(u.peso());
					usuarios.add(u.altura());
					usuarios.add(u.quadril());
					usuarios.add(u.peito());
					usuarios.add(u.bumbum());
					usuarios.add(u.coxaDireita());
					usuarios.add(u.coxaEsquerda());
					usuarios.add(u.bracoDireito());
					usuarios.add(u.bracoEsquerdo());
					usuarios.add(u.pernaDireita());
					usuarios.add(u.pernaEsquerda());
					
				
			} else {
				System.out.println("Opção inválida!");
				System.exit(1);
			}
			break;
			default:
				System.out.println("Você digitou uma opção não reconhecida!");
				break;	
		}
		//System.out.println(usuarios.get(1));
		
	}

}
