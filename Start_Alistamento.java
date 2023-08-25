package aplication;

import java.util.Scanner;

import util.AlistamentoMilitar;

public class Start_Alistamento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		AlistamentoMilitar recruta1 = new AlistamentoMilitar(null, null, null, null, null, null, null, null);
		
		recruta1.informarIdade(entrada);
		
		entrada.close();

	}

}