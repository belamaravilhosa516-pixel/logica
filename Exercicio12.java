// Faça um programa que receba um número inteiro entre 1 e 12 e informe o mês correspondente (1 = janeiro, 2 = fevereiro),

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		 System.out.print("Digite um número inteiro entre 1 e 12: ");
		int mes = input.nextInt();

		String nomeMes;
		
		 if (mes == 1) {
			 nomeMes = "janeiro";
		 } else if (mes == 2) {
			 nomeMes = "fevereiro";
		 } else if (mes == 3) {
			 nomeMes = "março";
		 } else if (mes == 4) {
			 nomeMes = "abril";
		 } else if (mes == 5) {
			 nomeMes = "maio";
		 } else if (mes == 6) {
			 nomeMes = "junho";
		 } else if (mes == 7) {
			 nomeMes = "julho";
		 } else if (mes == 8) {
			 nomeMes = "agosto";
		 } else if (mes == 9) {
			 nomeMes = "setembro";
		 } else if (mes == 10) {
			 nomeMes = "outubro";
		 } else if (mes == 11) {
			 nomeMes = "novembro";
		 } else if (mes == 12) {
			 nomeMes = "dezembro";
		 } else {
			 nomeMes = "número inválido";
		 }
		 
		 System.out.println("Mês correspondente: " + nomeMes);
		input.close();
	}
}