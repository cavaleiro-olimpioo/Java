package d040;

import java.util.Scanner;
import java.util.Arrays;


public class d40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jv[][] = {
				{"  ", "1 ", "2 ", "3 "},
				{"1 ", "  ", "  ", "  "},
				{"2 ", "  ", "  ", "  "},
				{"3 ", "  ", "  ", "  "}
		};
		
		int jogada[] = new int[2];
		
		int analise[] = new int[2];
		
		Scanner input = new Scanner(System.in);
		int count = 0;
		int jogador = 1;
		boolean win = true;
		int winner = 0;
		
		while (win) {
			for (int linha = 0; linha<4; linha++){
				for (int coluna = 0; coluna<4; coluna++) {	
					System.out.print(jv[linha][coluna]);
				}
				System.out.println("");
			}
			
			if (jogador == 1) {
				while (true) {
					System.out.printf("Jogador %d, digite a linha (1-3): ", jogador);
					jogada[0] = input.nextInt();
					
					System.out.printf("Jogador %d, digite a coluna (1-3): ", jogador);
					jogada[1] = input.nextInt();
					
					if (jv[jogada[0]][jogada[1]].equals("  ")) {
						jv[jogada[0]][jogada[1]] = "X ";
						jogador = 2;
						break;
					} else {
						System.out.println("[ERRO] Escolha uma casa vazia!");
					}
				}
			} else {
				while (true) {
					System.out.printf("Jogador %d, digite a linha (1-3): ", jogador);
					jogada[0] = input.nextInt();
					
					System.out.printf("Jogador %d, digite a coluna (1-3): ", jogador);
					jogada[1] = input.nextInt();
					
					if (jv[jogada[0]][jogada[1]].equals("  ")) {
						jv[jogada[0]][jogada[1]] = "O ";
						jogador = 1;
						break;
					} else {
						System.out.println("[ERRO] Escolha uma casa vazia!");
					}
					
				}
			}
			System.out.println("");
			
			
			if (jogador == 1) {
				for (int col = 1; col<3; col++) {
					if (col == 1) {
						for (int lin = 1; lin<3; lin++) {
							if (jv[lin][col] == "X ") {
								count += 1;
							} else {
								count = 0;
								break;
								
							}
						}
						if (count == 3) {
							break;
						}
					}
					else if(col == 2) {
						for (int lin = 1; lin<3; lin++) {
							if (jv[lin][col] == "X ") {
								count += 1;
							} else {
								count = 0;
								break;
								
							}
						}
						if (count == 3) {
							break;
						}
					}
					else {
						for (int lin = 1; lin<3; lin++) {
							if (jv[lin][col] == "X ") {
								count += 1;
							} else {
								count = 0;
								jogador = 2;
								break;
								
							}
						}
						if (count == 3) {
							break;
						}
					}
				}
			
			} else {
				for (int col = 1; col<3; col++) {
					if (col == 1) {
						for (int lin = 1; lin<3; lin++) {
							if (jv[lin][col] == "O ") {
								count += 1;
							} else {
								count = 0;
								break;
								
							}
						}
						if (count == 3) {
							winner = 1;
							break;
						}
					}
					else if(col == 2) {
						for (int lin = 1; lin<3; lin++) {
							if (jv[lin][col] == "O ") {
								count += 1;
							} else {
								count = 0;
								break;
								
							}
						}
						if (count == 3) {
							break;
						}
					}
					else {
						for (int lin = 1; lin<3; lin++) {
							if (jv[lin][col] == "O ") {
								count += 1;
							} else {
								count = 0;
								jogador = 1;
								break;
								
							}
						}
						if (count == 3) {
							winner = 2;
							break;
						}
					}
				}
			}
		
			if (count == 3) {
				win = false;
			}
				
			
		}
		System.out.printf("Vencedor %d", winner);
	}

}
