/* Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo.
* Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
* Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
* Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º) */

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Digite o triângulo 1: ");
		 int angulo1 = input.nextInt();
		 System.out.print("Digite o triângulo 2: ");
		 int angulo2 = input.nextInt();
		 System.out.print("Digite o triângulo 3: ");
		 int angulo3 = input.nextInt();
		
		 if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			 System.out.println("Triângulo Retângulo");
		 } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			 System.out.println("Triângulo Obtusângulo");
		 } else {
			 System.out.println("Triângulo Acutângulo");
		 }
		
		input.close();
	}
}