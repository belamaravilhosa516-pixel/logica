/*
 Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
 * Calcular e imprimir o seguinte:
 * Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área.
 * Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
 * Se o número de lados for igual a 5 escrever PENTÁGONO. 
*/

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número de lados do polígono regular: ");
		int numLados = input.nextInt();
		
		System.out.print("Digite a medida do lado (em cm): ");
		double medidaLado = input.nextDouble();
		
		if (numLados == 3) {
			double area = (medidaLado * medidaLado * Math.sqrt(3)) / 4;
			System.out.println("TRIÂNGULO");
			System.out.println("Área: " + area + " cm²");
		} else if (numLados == 4) {
			double area = medidaLado * medidaLado;
			System.out.println("QUADRADO");
			System.out.println("Área: " + area + " cm²");
		} else if (numLados == 5) {
			System.out.println("PENTÁGONO");
		} else {
			System.out.println("Número de lados inválido.");
		}
		
		input.close();
	}
}