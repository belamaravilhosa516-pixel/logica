// Faça um programa que receba um número inteiro entre 1 e 7 e informe o dia da semana correspondente (1 = domingo, 2 = segunda).

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		 System.out.print("Digite um número inteiro entre 1 e 7:");
		 int dia = input.nextInt();

		 String diaSemana;
		 
		 if (dia == 1) {
			 diaSemana = "domingo";
		 } else if (dia == 2) {
			 diaSemana = "segunda-feira";
		 } else if (dia == 3) {
			 diaSemana = "terça-feira";
		 } else if (dia == 4) {
			 diaSemana = "quarta-feira";
		 } else if (dia == 5) {
			 diaSemana = "quinta-feira";
		 } else if (dia == 6) {
			 diaSemana = "sexta-feira";
		 } else if (dia == 7) {
			 diaSemana = "sábado";
		 } else {
			 diaSemana = "número inválido";
		 }
		 
		 System.out.println("Dia da semana: " + diaSemana);

		input.close();
	}
}