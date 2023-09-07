package Projetos;

import java.util.Scanner;

public class InformacoesFuncionario {
	
	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Qual o nome do funcionario? ");
			String funcionario = entrada.next();
			
			try (Scanner entrada1 = new Scanner(System.in)) {
				System.out.println("Quantos anos de Empresa? ");
				String anosDeEmpresa = entrada1.next();

				try (Scanner entrada2 = new Scanner(System.in)) {
					System.out.println("Qual o salario do funcionario? ");
					String salario = entrada2.next();
					
					try (Scanner entrada3 = new Scanner(System.in)) {
						System.out.println("Quantas vendas ja tem acumuladas? ");
						String vendas = entrada3.next();	
					
					try (Scanner entrada4 = new Scanner(System.in)) {
						System.out.println("Quantos pontos ja tem acumulados por vendas? ");
						String pontosAcumulados = entrada4.next();
						
						try (Scanner entrada5 = new Scanner(System.in)) {
							System.out.println("O Funcionario esta de ferias? ");
							String estaDeFerias = entrada5.next();

							System.out.println("O Funcionario " + funcionario + " tem " + anosDeEmpresa + " anos de Empresa "
							+ "e seu salario e de " + salario +" Reais.");

							System.out.println("Tem " + pontosAcumulados + " pontos acumulados " + "por " + vendas + " vendas acumuladas");
							System.out.println("O funcionario " + funcionario + " esta de ferias? " + estaDeFerias + ".");
						}
					}
				}
			}
		}
		
	  }
	
	}
}