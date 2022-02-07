package application;

import java.util.Scanner;

import entities.pessoa;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sintomas = 0;

		System.out.println("=========================================\n"
				 		  +"\tPosso sair do isolamento?\n"
						  +"=========================================");
		
		System.out.println("Digite o seu nome: ");
		String nome = sc.next();

		System.out.println("\n-----------------------------");
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();

		System.out.println("\n-----------------------------");
		System.out.println("Você tomou vacina? \n1 - Sim\n2 - Não");
		int vacina = sc.nextInt();
		{

			System.out.println("\n-----------------------------");
			System.out.println("Você está com sintomas gripais?\n1 - Sim\n2 - Não");
			sintomas = sc.nextInt();

		}
		if (vacina == 1) {
			System.out.println("\n-----------------------------");
			System.out.println("Parabéns, você está imunizado!!!");
		}

		else {
			System.out.println("\n-----------------------------");
			System.out.println("Por favor, se não tiver com sintomas.\nTome a vacina");

			pessoa ps = new pessoa(sintomas);

			switch (sintomas) {

			case 1:
				// Puxa a parte do com sintomas gripais, ou seja, o primeiro if da classe pessoa
				break;

			case 2:
				// puxa a parte do sem sintomas, ou seja, o segundo if da classe pessoa
				break;

			default:
				System.out.println("Essa opção não existe.");
			}

		}
		sc.close();
	}
}
