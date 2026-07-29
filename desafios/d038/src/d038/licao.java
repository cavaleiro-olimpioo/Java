package d038;

public class licao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {
				{ 2, 3, 4, 0 },
				{ 4, 5, 6, 0 },
				{ 6, 2, 8, 0 },
				{ 0, 0, 0, 0 }
		};
		// linha
		for(int l = 0; l<3; l++) {
			for(int c = 0; c<4; c++) {
				if(c == 3) {
					continue;
				} else {
					matriz[l][3] += matriz[l][c];
				}
			}
		}
		// coluna
		int conta = 0;
		for(int l = 0; l<3; l++) {
			for(int c = 0; c<4; c++) {
				if (l == 3) {
					continue;}
				else {
				matriz[3][c] += matriz[l][c];	
				
				
				}
			}
		}
		
		
		
		
		
		for(int l = 0; l < 4; l++) {
			System.out.print("[ ");
			for(int c = 0; c<4; c++) {
				System.out.printf("%d ", matriz[l][c]);
			}
			System.out.println("]");
		}
	}

}
