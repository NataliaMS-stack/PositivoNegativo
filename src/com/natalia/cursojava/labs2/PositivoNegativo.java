package com.natalia.cursojava.labs2;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com um número: ");
			
			int num = scan.nextInt();
			
			if (num >= 0) {
				System.out.println("O número é positivo.");
			} else {
				System.out.println("O número é negativo.");
			}
		}
		

	}

}
