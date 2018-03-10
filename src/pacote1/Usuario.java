package pacote1;

import java.util.Scanner;

public class Usuario extends Academia {
	
	Scanner read = new Scanner(System.in);
	
	private String nomeAcademia;
	private String nomeInstrutor;
	private String nomeUsuario;
	private String cpf;
	private int idade;
	private float peso;
	private float altura;
	private float quadril;
	private float peito;
	private float bumbum;
	private float coxaDireita;
	private float coxaEsquerda;
	private float bracoDireito;
	private float bracoEsquerdo;
	private float pernaDireita;
	private float pernaEsquerda;
	
	
	/* Métodos sobrescritos da Classe Academia*/
	
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
	
	/* Métodos particulares da Classe Usuário*/
	
	int idade () {
		System.out.println("Idade do Usuário: " );
		idade = read.nextInt();
		return idade;
	}
	float peso () {
		System.out.println("Insira o seu peso (kg): ");
		peso = read.nextFloat();
		return peso;
	}
	float altura () {
		System.out.println("Insira a sua altura (cm): ");
		altura = read.nextFloat();
		return altura;
	}
	float quadril () {
		System.out.println("Insira o seu quadril (cm): ");
		quadril = read.nextFloat();
		return quadril;
	}
	float peito () {
		System.out.println("Insira o seu peito (cm): ");
		peito= read.nextFloat();
		return peito;
	}
	float bumbum () {
		System.out.println("Insira o tamho do seu Bumbum (cm): ");
		bumbum = read.nextFloat();
		return bumbum;
	}
	float coxaDireita () {
		System.out.println("Insira a coxa Direita (cm): ");
		coxaDireita = read.nextFloat();
		return coxaDireita;
	}
	float coxaEsquerda () {
		System.out.println("Insira a coxa Esquerda (cm): ");
		coxaEsquerda = read.nextFloat();
		return coxaEsquerda;
	}
	float bracoDireito () {
		System.out.println("Insira a braco Direito (cm): ");
		bracoDireito = read.nextFloat();
		return bracoDireito;
	}
	float bracoEsquerdo () {
		System.out.println("Insira a braco Esquerda (cm): ");
		bracoEsquerdo = read.nextFloat();
		return bracoEsquerdo;
	}
	float pernaDireita () {
		System.out.println("Insira a perna Direita (cm): ");
		pernaDireita = read.nextFloat();
		return pernaDireita;
	}
	float pernaEsquerda () {
		System.out.println("Insira a perna Esquerda (cm): ");
		pernaEsquerda = read.nextFloat();
		return pernaEsquerda;
	}

}
