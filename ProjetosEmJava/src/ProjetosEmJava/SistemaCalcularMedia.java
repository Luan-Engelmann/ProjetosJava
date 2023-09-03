package ProjetosEmJava;

import java.util.Scanner;

public class SistemaCalcularMedia {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Qual o nome do aluno? ");
			String nome = entrada.next();
			
			Scanner entrada1 = new Scanner(System.in);
			System.out.print("Quantas notas: ");
			int qntdeNotas = entrada1.nextInt();
			
			double [] notas = new double[qntdeNotas];
			
			for(int i = 0; i < notas.length; i++) {
				System.out.print("Informe a nota " + (i + 1) + " : ");
				notas[i] = entrada1.nextDouble();
			}

			double total = 0;
			for(double nota: notas) {
				total += nota;
			}
			
			double media = total / notas.length;
			System.out.println("A media da nota do aluno " + nome + " e de " + media + " pontos!");
			entrada1.close();
		}	
	}

}