package br.com.tvn.main;

import java.util.Scanner;

import br.com.tvn.main.CustomExceptions.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int num1;
			int num2;
			
			System.out.println("Digite o primeiro número:");
			num1 = scanner.nextInt();
			System.out.println("Digite o segundo número");
			num2 = scanner.nextInt();
			
			try {
				contar(num1, num2);
			} catch (ParametrosInvalidosException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois - parametroUm;
		for(int i = 1; i <= contagem; i++) {
			System.out.println(i);
		}
	}

}
