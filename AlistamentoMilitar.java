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
	
	public void informarIdade(Scanner entrada) {
		
		System.out.println("-- Alistamento Militar --\n");
		System.out.print("Informe o ano de seu nascimento: ");
		int anoNascimento = entrada.nextInt();
		anoNascimento = 2023 - anoNascimento;
		anoNascimento(anoNascimento);
		validacaoIdade(entrada);
	}
	
	public void validacaoIdade(Scanner entrada) {
		if(anoNascimento >= 18 && anoNascimento <= 45) {
			cadastroRecruta(entrada);
			exibirInformacoes();
		}else {
			System.out.println("Deve-se ter mais de 18 anos e menos de 45 para se alistar!!");
		}
	}
	
	public void cadastroRecruta(Scanner entrada) {
		System.out.print("Informe seu Nome: ");
		String nome = entrada.next();
		setNome(nome);
		
		System.out.print("Nome do Pai: ");
		String nomeDoPai = entrada.next();
		setNomeDoPai(nomeDoPai);
		
		System.out.print("Nome da Mãe: ");
		String nomeDaMae = entrada.next();
		setNomeDaMae(nomeDaMae);
		
		System.out.print("Telefone: ");
		int telefone = entrada.nextInt();
		setTelefone(telefone);
		
		System.out.print("E-mail: ");
		String email = entrada.next();
		setEmail(email);
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		setAltura(altura);
		
		System.out.print("Peso: ");
		double peso = entrada.nextDouble();
		setPeso(peso);
	}
	
	public void exibirInformacoes() {
		if(getAnoNascimento() >= 20) {
			System.out.println("---------------------------------");
			System.out.println("Nome: " + getNome());
			System.out.println("Ano Nascimento: " + (2023 - getAnoNascimento()));
			System.out.println("Nome da Mãe: " + getNomeDaMae());
			System.out.println("Nome do Pai: " + getNomeDoPai());
			System.out.println("Telefone: " + getTelefone());
			System.out.println("E-mail: " + getEmail());
			System.out.println("Altura: " + getAltura());
			System.out.println("Peso: " + getPeso() + "KG");
			System.out.println("Atenção, Taxa a ser paga R$" + (taxaAlistamento * getAnoNascimento()));
			System.out.println("---------------------------------");
		}else {
			System.out.println("---------------------------------");
			System.out.println("Nome: " + getNome());
			System.out.println("Ano Nascimento: " + (2023 - getAnoNascimento()));
			System.out.println("Nome da Mãe: " + getNomeDaMae());
			System.out.println("Nome do Pai: " + getNomeDoPai());
			System.out.println("Telefone: " + getTelefone());
			System.out.println("E-mail: " + getEmail());
			System.out.println("Altura: " + getAltura());
			System.out.println("Peso: " + getPeso() + "KG");
			System.out.println("---------------------------------");
		}
		
	}
}
