// Desenvolva um programa que dado um número, imprima uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3. 

import java.util.Scanner;

<<<<<<< HEAD
public class Exercicio29{
=======
public class Exercicio29 {
>>>>>>> refs/remotes/origin/main
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Digite um número: ");
		int num = input.nextInt();
		
		if (num % 3 == 0) {
			System.out.println("O número é múltiplo de 3.");
		} else {
			System.out.println("O número não é múltiplo de 3.");
		}
		input.close();
	}
}