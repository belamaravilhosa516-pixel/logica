// Criar um programa que leia pelo teclado um valor inteiro e diga se é par ou ímpar.

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Digite um valor inteiro: ");
		int valor = input.nextInt();
		
		if (valor % 2 == 0) {
			System.out.println("O valor é par.");
		} else {
			System.out.println("O valor é ímpar.");
		}
		
		input.close();
	}
}