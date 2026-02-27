/* Escreva um programa para ler a altura, peso e gênero para calcular o IMC.
*/

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int genero;
		double altura, pesoIdeal = 0;
		
		System.out.print("Digite o sexo (1 - feminino, 2 - masculino): ");
		genero = input.nextInt();
		
		System.out.print("Digite a altura: ");
		altura = input.nextDouble();
		
		 System.out.println("Gênero: " + (genero == 1 ? "Feminino" : "Masculino"));
		
		 if (genero == 1) {
			 pesoIdeal = (62.1 * altura) - 44.7;
		 } else if (genero == 2) {
			 pesoIdeal = (72.7 * altura) - 58;
		 } else {
			 System.out.println("Gênero inválido.");
			 input.close();
			 return;
		 }
		 
		input.close();
	}
}