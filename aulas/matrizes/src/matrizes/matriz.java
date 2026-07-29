package matrizes;

import java.util.Arrays;
import java.util.Arrays;

public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[3][3];
		int val = 1;
		
		for(int i0 = 0; i0<3; i0++) {
			for(int i1 = 0; i1<3; i1++) {
				matriz[i0][i1] = val;
				val++;
			
			}
		} 
		for (int i = 0; i<3; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}

}
