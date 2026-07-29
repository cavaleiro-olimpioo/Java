package d037;

import java.util.Arrays;

public class d37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1, s2, s3;
		int[][] matriz = {
				{ 2, 3, 4, 0 },
				{ 4, 5, 6, 0 },
				{ 6, 2, 8, 0 }
		};
		
		// c = Coluna
		// l = linha
		
		for(int l = 0; l<3; l++) {
			for(int c = 0; c<4; c++) {
				if(c == 3) {
					continue;
				} else {
					matriz[l][3] += matriz[l][c];
				}
			}
		}
		
		for(int l = 0; l<3; l++) {
			System.out.print("[ ");
			for(int c = 0; c<4; c++) {
				System.out.printf("%d ", matriz[l][c]);
			}
			System.out.println("]");
		}
	}
}
