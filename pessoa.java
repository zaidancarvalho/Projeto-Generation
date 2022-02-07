package entities;

import java.util.Scanner;

public class pessoa {

	Scanner sc = new Scanner(System.in);

	private int sintomas;
	private String nome;
	private int vacina;

	public pessoa() {

	}

	public pessoa(int sintomas) {
		setSintomas(sintomas);
		
		//est� com sintomas
		if (sintomas == 1) {
			
			int rc;	//armazena as respostas das perguntas
			int dias = 0;	//armazena a quantidade de dias com sintomas

			do {
				System.out.println("\n-----------------------------");
				System.out.println("Est� com mais de 2 dias de sintomas?\n1 - Sim\n2 - N�o");
				rc = sc.nextInt();
				if (rc == 2) {
					System.out.println("\n-----------------------------");
					System.out.println("Aguarde para fazer o teste!\n\n");
				}
			} while (rc != 1);
			System.out.println("\n-----------------------------");
			System.out.println("REALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - N�o");
			rc = sc.nextInt();
			if (rc == 2) {
				System.out.println("\n-----------------------------");
				System.out.println("Realize o teste, por favor!");
			} else {
				System.out.println("\n-----------------------------");
				System.out.println("O resultado deu positivo?\n1 - Sim\n2 - N�o");
				rc = sc.nextInt();
				if (rc == 2) {
					System.out.println("\n-----------------------------");
					System.out.println("Procure uma orienta��o m�dica!");
				} else {
					System.out.println("\n-----------------------------");
					System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

					do {
						System.out.println("\n-----------------------------");
						System.out.println("Voc� possui quantos dias com sintomas?");
						dias = sc.nextInt();

						if (dias < 7) {
							System.out.println("\n-----------------------------");
							System.out.println("Mantenha isolamento!");
						} else if (dias >= 7 && dias < 10) {
							System.out.println("\n-----------------------------");
							System.out.println("Mantenha o isolamento!");
						} else if (dias >= 10) {
							System.out.println("\n-----------------------------");
							System.out.println("Procure um m�dico!");
						}
						System.out.println("\n-----------------------------");
						System.out.println("Continua com sintomas?\n1 - Sim\n2 - N�o");
						rc = sc.nextInt();
					} while (rc != 2);
					System.out.println("\n-----------------------------");
					System.out.println("Fim do isolamento, se cuide.");
				}
			}
		}
		
		//n�o est� com sintoma
		if (sintomas == 2) {

			int rc;
			int dias;

			System.out.println("\n-----------------------------");
			System.out.println("Teve contato com algum caso confirmado?\n1 - Sim\n2 - N�o");
			rc = sc.nextInt();

			if (rc == 2) {
				System.out.println("\n-----------------------------");
				System.out.println("Sem suspeita mas, fa�a um teste.");
			} else {
				
				//se tiver tido contato com caso confirmado
				System.out.println("\n-----------------------------");
				System.out.println("O �ltimo contato foi h� 5 dias?\n1 - Sim\n2 - N�o");
				rc = sc.nextInt();

				if (rc == 1) {
					System.out.println("\n-----------------------------");
					System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - N�o");
					rc = sc.nextInt();
					if (rc == 2) {
						System.out.println("\n-----------------------------");
						System.out.println("Realize o teste, por favor!");
					} else {
						System.out.println("\n-----------------------------");
						System.out.println("O resultado deu positivo?\n1 - Sim\n2 - N�o");
						rc = sc.nextInt();
						if (rc == 2) {
							System.out.println("\n-----------------------------");
							System.out.println("Procure orienta��o m�dica! Para outro diagn�stico ");
						} else {
							System.out.println("\n-----------------------------");
							System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

							do {
								System.out.println("\n-----------------------------");
								System.out.println("Voc� possui quantos dias com sintomas?");
								dias = sc.nextInt();

								if (dias < 7) {
									System.out.println("\n-----------------------------");
									System.out.println("Mantenha isolamento!");
								} else if (dias >= 7 && dias < 10) {
									System.out.println("\n-----------------------------");
									System.out.println("Mantenha o isolamento!");
								} else if (dias >= 10) {
									System.out.println("\n-----------------------------");
									System.out.println("Procure um m�dico!");
								}
								System.out.println("\n-----------------------------");
								System.out.println("Continua com sintomas?\n1 - Sim\n2 - N�o");
								rc = sc.nextInt();
								if (rc == 2) {
									System.out.println("\n-----------------------------");
									System.out.println("Procure o m�dico");
								}
							} while (rc != 2);
							System.out.println("\n-----------------------------");
							System.out.println("Fim do isolamento, se cuide.");

						}
					}
				}
				
				//se n�o tiver tido contato com algum caso confirmado
				if (rc == 2) {
					System.out.println("\n-----------------------------");
					System.out.println("Aguarde alguns dias.\n\nMant�m assintom�tico?\n1 - Sim\n2 - N�o");
					rc = sc.nextInt();
					if (rc == 1) {
						System.out.println("\n-----------------------------");
						System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - N�o");
						rc = sc.nextInt();
						if (rc == 2) {
							System.out.println("\n-----------------------------");
							System.out.println("Realize o teste, por favor!");
						} else {
							System.out.println("\n-----------------------------");
							System.out.println("O resultado deu positivo?\n1 - Sim\n2 - N�o");
							rc = sc.nextInt();
							if (rc == 2) {
								System.out.println("\n-----------------------------");
								System.out.println("Procure uma orienta��o m�dica!");
							} else {
								System.out.println("\n-----------------------------");
								System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

								do {
									System.out.println("\n-----------------------------");
									System.out.println("Voc� possui quantos dias com sintomas?");
									dias = sc.nextInt();

									if (dias < 7) {
										System.out.println("\n-----------------------------");
										System.out.println("Mantenha isolamento!");
									} else if (dias >= 7 && dias < 10) {
										System.out.println("\n-----------------------------");
										System.out.println("Mantenha o isolamento!");
									} else if (dias > 10) {
										System.out.println("\n-----------------------------");
										System.out.println("Procure um m�dico!");
									}
									System.out.println("\n-----------------------------");
									System.out.println("Continua com sintomas?\n1 - Sim\n2 - N�o");
									rc = sc.nextInt();
								} while (rc != 2);
								System.out.println("\n-----------------------------");
								System.out.println("Fim do isolamento, se cuide.");

							}
						}
					}
					
					//n�o mant�m assintom�tico
					if (rc == 2) {
						do {
							System.out.println("\n-----------------------------");
							System.out.println("Est� com mais de 2 dias de sintomas?\n1 - Sim\n2 - N�o");
							rc = sc.nextInt();
							if (rc == 2) {
								System.out.println("\n-----------------------------");
								System.out.println("Aguarde para fazer o teste!\n\n");
							}
						} while (rc != 1);
						System.out.println("\n-----------------------------");
						System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - N�o");
						rc = sc.nextInt();
						if (rc == 2) {
							System.out.println("\n-----------------------------");
							System.out.println("Realize o teste, por favor!");
						} else {
							System.out.println("\n-----------------------------");
							System.out.println("O resultado deu positivo?\n1 - Sim\n2 - N�o");
							rc = sc.nextInt();
							if (rc == 2) {
								System.out.println("\n-----------------------------");
								System.out.println("Procure uma orienta��o m�dica!");
							} else {
								System.out.println("\n-----------------------------");
								System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

								do {
									System.out.println("\n-----------------------------");
									System.out.println("Voc� possui quantos dias com sintomas?");
									dias = sc.nextInt();

									if (dias < 7) {
										System.out.println("\n-----------------------------");
										System.out.println("Mantenha isolamento!");
									} else if (dias >= 7 && dias < 10) {
										System.out.println("\n-----------------------------");
										System.out.println("Mantenha o isolamento!");
									} else if (dias > 10) {
										System.out.println("\n-----------------------------");
										System.out.println("Procure um m�dico!");
									}
									System.out.println("\n-----------------------------");
									System.out.println("Continua com sintomas?\n1 - Sim\n2 - N�o");
									rc = sc.nextInt();
								} while (rc != 2);
								System.out.println("\n-----------------------------");
								System.out.println("Fim do isolamento, se cuide.");

							}
						}
					}
				}

			}
		}

	}

	public int getSintomas() {
		return sintomas;
	}

	public void setSintomas(int sintomas) {
		this.sintomas = sintomas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVacina() {
		return vacina;
	}

	public void setVacina(int vacina) {
		this.vacina = vacina;
	}

}