package projetosPessoais;

import java.util.Scanner;

public class CalculadoraBinária {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int multiplicador = 1;
		
		System.out.print("Digite um número para a conversão");
		int numero = entrada.nextInt();
		
		while(multiplicador < numero) {
			multiplicador = multiplicador * 2;
			
			System.out.println(multiplicador);
		}
		
		if(multiplicador - numero != -numero) {
			System.out.println("1");
		}
		
		entrada.close();
	}
}
