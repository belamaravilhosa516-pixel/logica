/* Acrescente as seguintes mensagens à solução da tarefa 14 conforme o caso.
 * Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
 * Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. */

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		 System.out.print("Digite o número de lados do polígono regular: ");
		 int numLados = input.nextInt();
		
		 if (numLados < 3) {
			 System.out.println("NÃO É UM POLÍGONO.");
		 } else if (numLados > 5) {
			 System.out.println("POLÍGONO NÃO IDENTIFICADO.");
		 } else {
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
			 }
		 }
		
		input.close();
	}
}