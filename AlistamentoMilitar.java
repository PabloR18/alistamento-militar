package util;

import java.util.Scanner;

public class AlistamentoMilitar {
	
	private static final int taxaAlistamento = 5;
	private String alistamentoMilitar[] = new String[8];
	
	public AlistamentoMilitar(String nome, String anoNascimento, String nomeDoPai, String nomeDaMae, String telefone, String email, String altura, String peso) {
		this.alistamentoMilitar[0] = anoNascimento;
		this.alistamentoMilitar[1] = nome;
		this.alistamentoMilitar[2] = nomeDoPai;
		this.alistamentoMilitar[3] = nomeDaMae;
		this.alistamentoMilitar[4] = telefone;
		this.alistamentoMilitar[5] = email;
		this.alistamentoMilitar[6] = altura;
		this.alistamentoMilitar[7] = peso;
	}
	
	public String[] getAlistamentoMilitar() {
		return alistamentoMilitar;
	}
	
	public void informarIdade(Scanner entrada) {
		
		System.out.println("-- Alistamento Militar --\n");
		System.out.print("Informe o ano de seu nascimento: ");
		int anoNascimento = entrada.nextInt();
		anoNascimento = 2023 - anoNascimento;
		anoNascimento(anoNascimento);
		validacaoIdade(entrada);
	}
	
	public void anoNascimento(String anoNascimento) {
		this.alistamentoMilitar[0] = anoNascimento;
	}
	
	public void nome(String nome) {
		this.alistamentoMilitar[1] = nome;
	}
	
	public void nomeDoPai(String nomeDoPai) {
		this.alistamentoMilitar[2] = nomeDoPai;
	}
	
	public void nomeDaMae(String nomeDaMae) {
		this.alistamentoMilitar[3] = nomeDaMae;
	}
	
	public void telefone(String telefone) {
		this.alistamentoMilitar[4] = telefone;
	}
	
	public void email(String email) {
		this.alistamentoMilitar[5] = email;
	}
	
	public void altura(String altura) {
		this.alistamentoMilitar[6] = altura;
	}
	
	public void peso(String peso) {
		this.alistamentoMilitar[7] = peso;
	}
	
	
	public void validacaoIdade(Scanner entrada) {
		if(anoNascimento() >= 18 && anoNascimento() <= 45) {
			cadastroRecruta(entrada);
			exibirInformacoes();
		}else {
			System.out.println("Deve-se ter mais de 18 anos e menos de 45 para se alistar!!");
		}
	}
	
	public void cadastroRecruta(Scanner entrada) {
		System.out.print("Informe seu Nome: ");
		String nome = entrada.next();
		nome(nome);
		
		System.out.print("Nome do Pai: ");
		String nomeDoPai = entrada.next();
		nomeDoPai(nomeDoPai);
		
		System.out.print("Nome da Mãe: ");
		String nomeDaMae = entrada.next();
		nomeDaMae(nomeDaMae);
		
		System.out.print("Telefone: ");
		int telefone = entrada.nextInt();
		telefone(telefone);
		
		System.out.print("E-mail: ");
		String email = entrada.next();
		email(email);
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		altura(altura);
		
		System.out.print("Peso: ");
		double peso = entrada.nextDouble();
		peso(peso);
	}
	
	public void exibirInformacoes() {
		if(getAlistamentoMilitar()[0] >= 20) {
			System.out.println("---------------------------------");
			System.out.println("Nome: " + getAlistamentoMilitar()[1]);
			System.out.println("Ano Nascimento: " + (2023 - getAlistamentoMilitar()[0]));
			System.out.println("Nome do Pai: " + getAlistamentoMilitar()[2]);
			System.out.println("Nome da Mãe: " + getAlistamentoMilitar()[3]);
			System.out.println("Telefone: " + getAlistamentoMilitar()[4]);
			System.out.println("E-mail: " + getAlistamentoMilitar()[5]);
			System.out.println("Altura: " + getAlistamentoMilitar()[6]);
			System.out.println("Peso: " + getAlistamentoMilitar()[7] + "KG");
			System.out.println("Atenção, Taxa a ser paga R$" + (taxaAlistamento * getAlistamentoMilitar()[0]));
			System.out.println("---------------------------------");
		}else {
			System.out.println("---------------------------------");
			System.out.println("Nome: " + getAlistamentoMilitar()[1]);
			System.out.println("Ano Nascimento: " + (2023 - getAlistamentoMilitar()[0]));
			System.out.println("Nome do Pai: " + getAlistamentoMilitar()[2]);
			System.out.println("Nome da Mãe: " + getAlistamentoMilitar()[3]);
			System.out.println("Telefone: " + getAlistamentoMilitar()[4]);
			System.out.println("E-mail: " + getAlistamentoMilitar()[5]);
			System.out.println("Altura: " + getAlistamentoMilitar()[6]);
			System.out.println("Peso: " + getAlistamentoMilitar()[7] + "KG");
			System.out.println("---------------------------------");
		}
		
	}
}