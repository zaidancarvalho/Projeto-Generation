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
		
		//está com sintomas
		if (sintomas == 1) {
			
			int rc;	//armazena as respostas das perguntas
			int dias = 0;	//armazena a quantidade de dias com sintomas

			do {
				System.out.println("\n-----------------------------");
				System.out.println("Está com mais de 2 dias de sintomas?\n1 - Sim\n2 - Não");
				rc = sc.nextInt();
				if (rc == 2) {
					System.out.println("\n-----------------------------");
					System.out.println("Aguarde para fazer o teste!\n\n");
				}
			} while (rc != 1);
			System.out.println("\n-----------------------------");
			System.out.println("REALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - Não");
			rc = sc.nextInt();
			if (rc == 2) {
				System.out.println("\n-----------------------------");
				System.out.println("Realize o teste, por favor!");
			} else {
				System.out.println("\n-----------------------------");
				System.out.println("O resultado deu positivo?\n1 - Sim\n2 - Não");
				rc = sc.nextInt();
				if (rc == 2) {
					System.out.println("\n-----------------------------");
					System.out.println("Procure uma orientação médica!");
				} else {
					System.out.println("\n-----------------------------");
					System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

					do {
						System.out.println("\n-----------------------------");
						System.out.println("Você possui quantos dias com sintomas?");
						dias = sc.nextInt();

						if (dias < 7) {
							System.out.println("\n-----------------------------");
							System.out.println("Mantenha isolamento!");
						} else if (dias >= 7 && dias < 10) {
							System.out.println("\n-----------------------------");
							System.out.println("Mantenha o isolamento!");
						} else if (dias >= 10) {
							System.out.println("\n-----------------------------");
							System.out.println("Procure um médico!");
						}
						System.out.println("\n-----------------------------");
						System.out.println("Continua com sintomas?\n1 - Sim\n2 - Não");
						rc = sc.nextInt();
					} while (rc != 2);
					System.out.println("\n-----------------------------");
					System.out.println("Fim do isolamento, se cuide.");
				}
			}
		}
		
		//não está com sintoma
		if (sintomas == 2) {

			int rc;
			int dias;

			System.out.println("\n-----------------------------");
			System.out.println("Teve contato com algum caso confirmado?\n1 - Sim\n2 - Não");
			rc = sc.nextInt();

			if (rc == 2) {
				System.out.println("\n-----------------------------");
				System.out.println("Sem suspeita mas, faça um teste.");
			} else {
				
				//se tiver tido contato com caso confirmado
				System.out.println("\n-----------------------------");
				System.out.println("O último contato foi há 5 dias?\n1 - Sim\n2 - Não");
				rc = sc.nextInt();

				if (rc == 1) {
					System.out.println("\n-----------------------------");
					System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - Não");
					rc = sc.nextInt();
					if (rc == 2) {
						System.out.println("\n-----------------------------");
						System.out.println("Realize o teste, por favor!");
					} else {
						System.out.println("\n-----------------------------");
						System.out.println("O resultado deu positivo?\n1 - Sim\n2 - Não");
						rc = sc.nextInt();
						if (rc == 2) {
							System.out.println("\n-----------------------------");
							System.out.println("Procure orientação médica! Para outro diagnóstico ");
						} else {
							System.out.println("\n-----------------------------");
							System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

							do {
								System.out.println("\n-----------------------------");
								System.out.println("Você possui quantos dias com sintomas?");
								dias = sc.nextInt();

								if (dias < 7) {
									System.out.println("\n-----------------------------");
									System.out.println("Mantenha isolamento!");
								} else if (dias >= 7 && dias < 10) {
									System.out.println("\n-----------------------------");
									System.out.println("Mantenha o isolamento!");
								} else if (dias >= 10) {
									System.out.println("\n-----------------------------");
									System.out.println("Procure um médico!");
								}
								System.out.println("\n-----------------------------");
								System.out.println("Continua com sintomas?\n1 - Sim\n2 - Não");
								rc = sc.nextInt();
								if (rc == 2) {
									System.out.println("\n-----------------------------");
									System.out.println("Procure o médico");
								}
							} while (rc != 2);
							System.out.println("\n-----------------------------");
							System.out.println("Fim do isolamento, se cuide.");

						}
					}
				}
				
				//se não tiver tido contato com algum caso confirmado
				if (rc == 2) {
					System.out.println("\n-----------------------------");
					System.out.println("Aguarde alguns dias.\n\nMantém assintomático?\n1 - Sim\n2 - Não");
					rc = sc.nextInt();
					if (rc == 1) {
						System.out.println("\n-----------------------------");
						System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - Não");
						rc = sc.nextInt();
						if (rc == 2) {
							System.out.println("\n-----------------------------");
							System.out.println("Realize o teste, por favor!");
						} else {
							System.out.println("\n-----------------------------");
							System.out.println("O resultado deu positivo?\n1 - Sim\n2 - Não");
							rc = sc.nextInt();
							if (rc == 2) {
								System.out.println("\n-----------------------------");
								System.out.println("Procure uma orientação médica!");
							} else {
								System.out.println("\n-----------------------------");
								System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

								do {
									System.out.println("\n-----------------------------");
									System.out.println("Você possui quantos dias com sintomas?");
									dias = sc.nextInt();

									if (dias < 7) {
										System.out.println("\n-----------------------------");
										System.out.println("Mantenha isolamento!");
									} else if (dias >= 7 && dias < 10) {
										System.out.println("\n-----------------------------");
										System.out.println("Mantenha o isolamento!");
									} else if (dias > 10) {
										System.out.println("\n-----------------------------");
										System.out.println("Procure um médico!");
									}
									System.out.println("\n-----------------------------");
									System.out.println("Continua com sintomas?\n1 - Sim\n2 - Não");
									rc = sc.nextInt();
								} while (rc != 2);
								System.out.println("\n-----------------------------");
								System.out.println("Fim do isolamento, se cuide.");

							}
						}
					}
					
					//não mantém assintomático
					if (rc == 2) {
						do {
							System.out.println("\n-----------------------------");
							System.out.println("Está com mais de 2 dias de sintomas?\n1 - Sim\n2 - Não");
							rc = sc.nextInt();
							if (rc == 2) {
								System.out.println("\n-----------------------------");
								System.out.println("Aguarde para fazer o teste!\n\n");
							}
						} while (rc != 1);
						System.out.println("\n-----------------------------");
						System.out.println("\nREALIZE O TESTE PARA COVID!\n\nRealizou o teste?\n1 - Sim\n2 - Não");
						rc = sc.nextInt();
						if (rc == 2) {
							System.out.println("\n-----------------------------");
							System.out.println("Realize o teste, por favor!");
						} else {
							System.out.println("\n-----------------------------");
							System.out.println("O resultado deu positivo?\n1 - Sim\n2 - Não");
							rc = sc.nextInt();
							if (rc == 2) {
								System.out.println("\n-----------------------------");
								System.out.println("Procure uma orientação médica!");
							} else {
								System.out.println("\n-----------------------------");
								System.out.println("CASO CONFIRMADO! MANTENHA ISOLAMENTO!\n\n");

								do {
									System.out.println("\n-----------------------------");
									System.out.println("Você possui quantos dias com sintomas?");
									dias = sc.nextInt();

									if (dias < 7) {
										System.out.println("\n-----------------------------");
										System.out.println("Mantenha isolamento!");
									} else if (dias >= 7 && dias < 10) {
										System.out.println("\n-----------------------------");
										System.out.println("Mantenha o isolamento!");
									} else if (dias > 10) {
										System.out.println("\n-----------------------------");
										System.out.println("Procure um médico!");
									}
									System.out.println("\n-----------------------------");
									System.out.println("Continua com sintomas?\n1 - Sim\n2 - Não");
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