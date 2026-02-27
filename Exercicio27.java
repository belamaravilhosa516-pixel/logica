/* Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.
 * Triângulo Equilátero: possui os 3 lados iguais.
 * Triângulo Isósceles: possui 2 lados iguais.
 * Triângulo Escaleno: possui 3 lados diferentes. */

import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		 System.out.print("Digite o primeiro lado do triângulo: ");
		 int lado1 = input.nextInt();
		 System.out.print("Digite o segundo lado do triângulo: ");
		 int lado2 = input.nextInt();
		 System.out.print("Digite o terceiro lado do triângulo: ");
		 int lado3 = input.nextInt();
		
		 if (lado1 == lado2 && lado2 == lado3) {
			 System.out.println("Triângulo Equilátero");
		 } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			 System.out.println("Triângulo Isósceles");
		 } else {
			 System.out.println("Triângulo Escaleno");
		 }
		
		input.close();
	}
}