// Escrever um programa que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.

import java.util.Scanner; 

public class Exercicio1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);   
		 
		 int x;
		 int y; // primeiro número e segundo número 
		 int soma, subt, div, mult; // operações  
		 
		 System.out.print("Digite o primeiro número: " );   
		 x = input.nextInt();   
		 System.out.print("Digite o segundo número: " );   
		 y = input.nextInt();   
		 
		 while(true) {
			Scanner entrada = new Scanner(System.in);
	        System.out.println("Escolha a operação: 1 - Soma, 2 - Subtração, 3- Multiplicação, 4 - Divisão");

			if(entrada.hasNextInt()) {
				int numeros = entrada.nextInt();
				soma = x + y;
				System.out.println("A soma é: " + soma);
			} else if(entrada.hasNextInt()) {
				int numeros = entrada.nextInt();
				subt = x - y;
				System.out.println("A subtração é: " + subt);
			} else if(entrada.hasNextInt()) {
				int numeros = entrada.nextInt();
				mult = x*y;
				System.out.println("A multiplicação é: " + mult);
			} else if(entrada.hasNextInt()) {
				int numeros = entrada.nextInt();
				div = x/y;
				System.out.println("A divisão é: " + div);
			} else {
				System.out.println("Opção inválida.");
			}
			break;
		 }

		 input.close();
	}
}