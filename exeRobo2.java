package exeRobo2;

import java.util.Scanner;

import java.util.Random;

public class exeRobo2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		
		int x = 0, y = 0,
		bateria = 0, distancia = 0,
		distanciaTotal = 0, bateriaNecessaria = 0,
		aleatorio = 0, numAleatorio = 0, indcAleatorio = 0;
		String comando = " ";
		char resp = 'S', coletar, confirmBateria = 'S';
		boolean perdeu = false, bateriaZerada = false;
		String[] poderes = {"Pular linha" , "Avançar casas" , "Mais Bateria"};
		String[] azar = {"Perda de Posição" , "Perda de bateria" , "Azar máximo"};
		int[] num = new int [6];
		for (int r = 0; r < 6; r++) {
			num[r] = r + 1;
		}
		
		while (resp == 'S' || confirmBateria == 'S') {
			
		perdeu = false;
		
		
		
		
		
		System.out.println("====JOGO DO ROBO====");
		System.out.println("Para manipular a movimentação do robo use os comandos:");
		System.out.println("FRENTE, TRAS, DIREITA, ESQUERDA.");
		System.out.println("Não esqueça de digitar a distância também (ex: 5, 7, 10.");
		System.out.println();
		
		System.out.println("Quanto de bateria o robo possui?");
		bateria = scanner.nextInt();

		while (!(x == 10) && !(y==1) && bateria > 0) {
			
			
		
		
		System.out.println("Comando: ");
		comando = scanner.next();
		
		
		while (!(comando.equalsIgnoreCase("FRENTE")) &&
				!(comando.equalsIgnoreCase("TRAS")) &&
				!(comando.equalsIgnoreCase("ESQUERDA")) &&
				!(comando.equalsIgnoreCase("DIREITA")) ) {
			System.out.println("Comando inválido!");
			System.out.println("FRENTE, TRAS, DIREITA ou ESQUERDA: ");
			comando = scanner.next();
			
		}
		
		 y = 1;
		 x = 4;
	
		
//		 primeira linha	 
		 while (!(comando.equalsIgnoreCase("FRENTE"))) {
			 System.out.println("Digite o comando correto para a linha: ");
			 comando = scanner.next();
			 
		 }
		 
	
		 
		 while (!(y==10)) {
			 
		
		
			if (comando.equalsIgnoreCase("FRENTE")) {
			 System.out.println("Digite a distância: ");
			 distancia = scanner.nextInt();
			 y += distancia;
			 bateria -= distancia;
			 if (bateria <= 0) {
					System.out.println("Você colocou uma bateria de iphone nesse robo?");
					bateriaZerada = true;
					break;
			} else if (y == 6) {
				System.out.println("O robo achou um baú, você quer abri-lo?");
				coletar = scanner.next().toUpperCase().charAt(0);
				while (!(coletar == 'S') && !(coletar == 'N')) {
					System.out.println("Digite S ou N!?");
					coletar = scanner.next().toUpperCase().charAt(0);
				}
				
				if (coletar == 'S') {
					aleatorio = random.nextInt(poderes.length);
					String boostAleatorio = poderes[aleatorio];
					System.out.println("O robo encontrou: " + boostAleatorio);
					
					if (boostAleatorio.equals("Pular linha")) {
						System.out.println("O robo saltou para a próxima linha!");
						System.out.println();
						x = 4;
						y = 10;
					} else if (boostAleatorio.equals("Avançar casas")) {
						indcAleatorio = random.nextInt(num.length);
						numAleatorio = num[indcAleatorio];
						System.out.println("O robo ganhou um avanço de " + numAleatorio + " casas.");
						y += numAleatorio;
						int coordAntiga = y - numAleatorio;
						System.out.println("O robo estava nas coordenadas: " + "(" + x + ")" + "," + "(" + coordAntiga + ")");
						System.out.println("Agora o robo esta nas coordenadas: " + "(" + x + ")" + "," + "(" + y + ")");
						System.out.println();
						
					
					} else if (boostAleatorio.equals("Mais Bateria")) {
						if (numAleatorio == 0) {
							numAleatorio = 1 ;
						}
						bateria += numAleatorio;
						System.out.println("o robo ganhou um carregamento grátis de " + numAleatorio + "%");
						System.out.println("Bateria atual: " + bateria + "%");
						System.out.println();
					}
				} else {
					System.out.println("O robo deixou o baú para tras, continue o fazendo avançar.");
				}
				
			 }if (y == 10) {
				 distanciaTotal += distancia;
				 System.out.println("Primeira linha concluída!");
				 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
			 }else if (y > 10) {
				 System.out.println("O robo explodiu na parede!");
				 perdeu = true;
				 break;
			 }else {
				 System.out.println("Você permanece na primeira linha. ");
				 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
				 
			 }
			 
			}
			
			
		 }
		 
		 if (perdeu || bateriaZerada) {
			 break;
		 }
		
		 
			System.out.println();
			comando = "";
			System.out.println("Comando: ");
			comando = scanner.next();
	
			
		
			
			

//			segunda linha
			 while (!(comando.equalsIgnoreCase("DIREITA"))) {
				 System.out.println("Digite o comando correto para a linha: ");
				 comando = scanner.next();
				
			 }	 
		
			 
			 while (!(x==9)) {
				 
				 
			
			 
				if (comando.equalsIgnoreCase("DIREITA")) {
				 System.out.println("Digite a distância: ");
				 distancia = scanner.nextInt();
				 x += distancia;
				 bateria -= distancia;
				 if (bateria <= 0) {
						System.out.println("A bateria do robo se foi...");
						bateriaZerada = true;
						break;
				 } else if (x == 9) {
					 distanciaTotal += distancia;
					 System.out.println("Segunda linha concluída!");
					 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
				
				 } else if (x > 9) {
					 System.out.println("O robo descobriu o que tem atras da parede!");
					 perdeu = true;
					 break;
				 } else {
					 System.out.println("Você permanece na segunda linha. ");
					 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
					 
					 
				 }
				 
				}
				
			 }
			 
			 if (perdeu || bateriaZerada) {
				 break;
			 }
				
			 
			
				System.out.println();
				comando = "";
				System.out.println("Comando: ");
				comando = scanner.next();
				
				
//				terceira linha
				while (!(comando.equalsIgnoreCase("FRENTE"))) {
					 System.out.println("Digite o comando correto para a linha: ");
					 comando = scanner.next();
					
				 }	 
				 
				 while (!(y == 14)) {
				 
					if (comando.equalsIgnoreCase("FRENTE")) {
					 System.out.println("Digite a distância: ");
					 distancia = scanner.nextInt();
					 y += distancia;
					 bateria -= distancia;
					 if (bateria <= 0) {
							System.out.println("A bateria ficou < 0...");
							bateriaZerada = true;
							break;
							
					 } else if (y == 12) {
						 System.out.println("O robo foi atacado por inimigos!");
						 aleatorio = random.nextInt(azar.length);
						 String azarAleatorio = azar[aleatorio];
						 System.out.println("Com o ataque o robo recebeu: " + azarAleatorio);
						 if (azarAleatorio.equals("Perda de Posição")) {
							 indcAleatorio = random.nextInt(num.length);
							 numAleatorio = num[indcAleatorio];
							 y -= numAleatorio;
							 int coordPerdeu = y + numAleatorio;
							 System.out.println("O robo voltou " + numAleatorio + " casas para tras!");
							 System.out.println("O robo estava nas coordenadas: " + "(" + x + ")" + "," + "(" + coordPerdeu + ")");
							 System.out.println("Agora o robo esta nas coordenadas: " + "(" + x + ")" + "," + "(" + y + ")");
							 System.out.println();
							  
						 } else if (azarAleatorio.equals("Perda de bateria")) {
							 indcAleatorio = random.nextInt(num.length);
							 numAleatorio = num[indcAleatorio];
							 bateria -= numAleatorio;
							 System.out.println("O robo perdeu " + numAleatorio + "% de bateria!");
							 System.out.println("Bateria atual: " + bateria + "%");
							 System.out.println();
							 
						 }
						
						 
					 }
					 
					 	if (y == 14) {
						 distanciaTotal += distancia;
						 System.out.println("Terceira linha concluída!");
						 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
				
					 } else if (y > 14) {
						 System.out.println("O robo virou purê!");
						 perdeu = true;
						 break;
					 } else {
						 System.out.println("Você permanece na terceira linha. ");
						 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
						 
					 }
					 
					}
				 }
				 
				 if (perdeu || bateriaZerada) {
					 break;
				 }
				
					
					
					
					System.out.println();
					comando = "";
					System.out.println("Comando: ");
					comando = scanner.next();
					

					
// 					quarta linha
					while (!(comando.equalsIgnoreCase("DIREITA"))) {
						 System.out.println("Digite o comando correto para a linha: ");
						 comando = scanner.next();
						
					 }	 
					
//					x = 9;
//					y = 14;
					
					
					while (!(x == 14)) {
						if (comando.equalsIgnoreCase("DIREITA")) {
						 System.out.println("Digite a distância: ");
						 distancia = scanner.nextInt();
						 x += distancia;
						 bateria -= distancia;
						 if (bateria <= 0) {
								System.out.println("O robo não estava carregado o suficiente...");
								bateriaZerada = true;
								break;
						 } else if (x == 14) {
							 distanciaTotal += distancia;
							 System.out.println("Quarta linha concluída!");
							 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
		
						 } else if (x > 14) {
							 System.out.println("Você fez o robo conhecer jesus!");
							 perdeu = true;
							 break;
						 } else {
							 System.out.println("Você permanece na quarta linha. ");
							 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
							 
						 }
						 
						}
					}
					
					 if (perdeu || bateriaZerada) {
						 break;
					 }
					
						
					
					
						System.out.println();
						comando = "";
						System.out.println("Comando: ");
						comando = scanner.next();
						
//						quinta linha
						
						while (!(comando.equalsIgnoreCase("TRAS"))) {
							 System.out.println("Digite o comando correto para a linha: ");
							 comando = scanner.next();
							
						 }	
						
//						x = 14;
//						y = 14;
						
						while (!(y == 4)) {
							if (comando.equalsIgnoreCase("TRAS")) {
							 System.out.println("Digite a distância: ");
							 distancia = scanner.nextInt();
							 y -= distancia;
							 bateria -= distancia;
							 if (bateria <= 0) {
									System.out.println("A bateria do robo ficou abaixo de 0...");
									bateriaZerada = true;
									break;
							 } else if (y == 4) {
								 distanciaTotal += distancia;
								 System.out.println("Quinta linha concluída!");
								 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
			
							 } else if (y < 4){
								 System.out.println("O robo foi obliterado!");
								 perdeu = true;
								 break;
							 } else {
								 System.out.println("Você permanece na quinta linha. ");
								 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
								 
							 }
							 
							}
						}
							
						System.out.println();
						comando = "";
						System.out.println("Comando: ");
						comando = scanner.next();
							
//							sexta linha
							
						while (!(comando.equalsIgnoreCase("ESQUERDA"))) {
							 System.out.println("Digite o comando correto para a linha: ");
								comando = scanner.next();
								
						 }	
						

						
						while (!(x == 10)) {
						
							if (comando.equalsIgnoreCase("ESQUERDA")) {
								System.out.println("Digite a distância: ");
								distancia = scanner.nextInt();
								x -= distancia;
								bateria -= distancia;
								 if (bateria <= 0) {
										System.out.println("A bateria do robo se esvaiu...");
										bateriaZerada = true;
										break;
								 } else if (x == 10) {
									distanciaTotal += distancia;
									System.out.println("Sexta linha concluída!");
									System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
				
								} else if (x < 10) {
									System.out.println("O robo parou na parede!");
									perdeu = true;
									break;
								 } else {
									 System.out.println("Você permanece na setxa linha. ");
									 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
								 }
								 
								}
						}
						
						 if (perdeu || bateriaZerada) {
							 break;
						 }
						
								
							System.out.println();
							comando = "";
							System.out.println("Comando: ");
							comando = scanner.next();
								
							
//							sétima linha
							
//							x = 10
//							y = 4
								
							while (!(comando.equalsIgnoreCase("TRAS"))) {
									System.out.println("Digite o comando correto para a linha: ");
									comando = scanner.next();
									
								}
							
							while (!(y == 1))
								if (comando.equalsIgnoreCase("TRAS")) {
									System.out.println("Digite a distância: ");
									distancia = scanner.nextInt();
									y -= distancia;
									bateria -= distancia;
									 if (bateria <= 0) {
											System.out.println("Acabou-se a bateria...");
											bateriaZerada = true;
											break;
									 } else if (y == 1) {
										distanciaTotal += distancia;
										System.out.println("Sétima linha concluída!");
										System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
					
									} else if (y < 1) {
										System.out.println("De acordo com a física, a parede bateu no robo!");
										perdeu = true;
										break;
									} else {
										System.out.println("Você permanece na sétima linha. ");
										System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
									}
									 
								}
							
							 if (perdeu || bateriaZerada) {
								 break;
							 }
		}
		if (bateriaZerada) {
			System.out.println("A energia acabou.");
			System.out.println("Colocou o robo para carregar? S/N");
			confirmBateria = scanner.next().toUpperCase().charAt(0);
			if (confirmBateria == 'S'){
				System.out.println("O jogo ser� reiniciado.");
			} else {
				break;
			}
			while (!(confirmBateria == 'S') && !(confirmBateria == 'N')) {
			System.out.println("S ou N : ");
			confirmBateria = scanner.next().toUpperCase().charAt(0);
		}
					
					
		}
		
		//fora do while
		bateriaNecessaria = bateria - distanciaTotal;
		
		while (x == 10 && y == 1) {
		System.out.println();
		System.out.println("Parabéns!!!! Você terminou o jogo.");
		System.out.println("Posição final do robo: " + "(" + x + ")" + "," + "(" + y + ")");
		System.out.println("Bateria usada: " + bateriaNecessaria + "%");
		System.out.println("Jogar de novo?");
		resp = scanner.next().toUpperCase().charAt(0);
		} 
		
		
		if (perdeu) {
			System.out.println("Você perdeu!");
			System.out.println("Posição de  onde perdeu: " + "(" + x + ")" + "," + "(" + y + ")");
			
			System.out.println("Tentar de novo?");
			resp = scanner.next().toUpperCase().charAt(0);
			
		} 
		
		
		
		

			
		}
		
		//fora de todas as repeti��es
		
		if (bateriaZerada || perdeu){
			System.out.println("Quem sabe na pr�xima...");
		} else {
			System.out.println("Obrigado por jogar!");
			scanner.close();
		}
		
		

		
		}
	
	}

// notas da atualiza��o
// o robo pode encontrar um bau com vantagens
// o robo pode ser atacado por inimigos e perder atributos
// agora, a posi��o ficar� travada para cada linha
// O jogo pode ser perdido se a bateria acabar, ou se a posi��o estiver
//fora dos padr�es.
		 
		
//		 1° comando: FRENTE, 9
//		 2° comando: DIREITA, 5
//		 3° comando : FRENTE, 4
//		 4° comando : DIREITA, 5
//		 5° comando : TRAS, 10
//		 6° comando : ESQUERDA, 4
// 		 7° comando : TRAS, 3
//		 bateria total gasta = 40
