package pacote1;

import java.util.Scanner;

public class Imc extends Usuario {
Scanner read = new Scanner(System.in);
	
	private String nomeAcademia;
	private String nomeInstrutor;
	private String nomeUsuario;
	private String cpf;
	private int idade;
	private float peso;
	private float altura;
	private double imc;
	
	double imc () {
		System.out.println("Peso (kg): ");
		peso = read.nextFloat();
		System.out.println("Altura (m): ");
		altura = read.nextFloat();
		System.out.println(imc = (peso / Math.pow(altura,2)));
		return imc;
	
	}
}
