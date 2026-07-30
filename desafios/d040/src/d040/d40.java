package d040;

import java.util.Scanner;
import java.util.Arrays;

public class d40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// Cuida da tabela do jogo da velha
		String jv[][] = {
				{"  ", "1 ", "2 ", "3 "},
				{"1 ", "  ", "  ", "  "},
				{"2 ", "  ", "  ", "  "},
				{"3 ", "  ", "  ", "  "}
		};

		// Cuida das jogadas de coluna e linha
		int jogada[] = new int[2];

		// Variável do vencedor
		int winner = 0;

		// Jogador
		int jogador = 1;

		// Define o símbolo que será jogado com base no jogador
		String symbol;

		// Variável que controla o andamento da partida
		boolean win = true;

		// Conta para detectar de há vitória
		int count = 0;

		while (win) {
			// Exibe o jogo da velha completo atualizado
			for (int linha = 0; linha < 4; linha++) {
				for (int coluna = 0; coluna < 4; coluna++) { System.out.print(jv[linha][coluna]); }
				System.out.println("");
			}

			// Define p símbolo com base no jogador atual
			if (jogador == 1) { symbol = "X "; }
			else { symbol = "O "; }

			// Jogada atual
			while (true) {
				System.out.printf("Jogador %d, digite a linha (1-3): ", jogador);
				jogada[0] = input.nextInt();

				System.out.printf("Jogador %d, digite a coluna (1-3): ", jogador);
				jogada[1] = input.nextInt();

				// Se a casa estiver vazia e dentro do índice ele aceita, senão, volta o loop
				if (jv[jogada[0]][jogada[1]].equals("  ") || jogada[0] <= 3 || jogada[1] <= 3) {
					jv[jogada[0]][jogada[1]] = symbol;
					break;
				} else { System.out.println("[ERRO] Escolha uma casa vazia e um valor dentro do índice (1 - 3)!"); }
			}
			System.out.println("");

			// Verifica se há um vencedor
			for (int rep = 0; rep < 2; rep++) {

				// Faz com que ele verifique uma vez com o jogador atual, e logo após inverta o jogador
				if (rep == 1 && jogador == 1) { jogador = 2; }
				else if ( rep == 1 && jogador == 2) { jogador = 1; }

				if (jogador == 1) { symbol = "X "; }
				else { symbol = "O "; }

				// loop de detecção para linhas e colunas
				for (int i = 1; i<4; i++){

					// Detecta se há alguma vitória em uma das linha
					if (jv[i][1].equals(symbol) && jv[i][2].equals(symbol) && jv[i][3].equals(symbol)){
						winner = jogador;
						win = false;
					}

					// Detecta se há alguma vitória em uma das colunas
					if (jv[1][i].equals(symbol) && jv[2][i].equals(symbol) && jv[3][i].equals(symbol)){
						winner = jogador;
						win = false;
					}
				}

				// Detecta se há alguma vitória nas diagonais
				if ((jv[1][1].equals(symbol) && jv[2][2].equals(symbol) && jv[3][3].equals(symbol)) || jv[1][3].equals(symbol) && jv[2][2].equals(symbol)  && jv[3][1].equals(symbol)){
					winner = jogador;
					win = false;
				}

			}

			// Detecta se o jogo acabou em empate
			for (int linha = 0; linha < 4; linha++) {
				for (int coluna = 0; coluna < 4; coluna++) {
					if (jv[linha][coluna].equals("  ")) {
						break;
					} else {
						count++;
					}
				}
			}

			if (count == 9){
				winner = 3;
				win = false;
			}
		}
		System.out.println("-=-=-=-=-=-=-=-= FIM =-=-=-=-=-=-=-=-=-=-");
		if  (winner <= 2) {
			System.out.printf("\nO vencedor é jogador o %d\n", winner);

			// Exibe a tabela final do jogo
			for (int linha = 0; linha < 4; linha++) {
				for (int coluna = 0; coluna < 4; coluna++) {
					System.out.print(jv[linha][coluna]);
				}
				System.out.println("");
			}
		} else {
			System.out.println("\nEmpate! Deu velha\n");
		}
	}
}
