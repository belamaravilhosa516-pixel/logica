// Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. 
// Considere fixo o juro da poupança em 0.70% a. m.

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		 
		 System.out.print("Digite o valor depositado: ");
		 double valorDepositado = input.nextDouble();
		 
		 double juros = 0.007;
		 double valorComRendimento = valorDepositado + (valorDepositado * juros);
		 
		 System.out.println("Valor com rendimento após um mês: R$ " + valorComRendimento);

		input.close();
	}
}