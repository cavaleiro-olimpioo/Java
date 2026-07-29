package d036;

import java.util.Arrays;

public class d36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {
				{ 2, 3, 4 },
				{ 4, 5, 6 },
				{ 6, 2, 8 }
		};
		
		System.out.println("Matriz original: ");
		
		for(int i0 = 0; i0<3; i0++) {
			System.out.print("[ ");
			for(int i1 = 0; i1<3; i1++) {
				System.out.printf("%d ", matriz[i0][i1]);
			}
			System.out.println("]");
		}
		
		System.out.println("");
		
		System.out.println("Matriz invertida: ");
		
		for (int i0 = 2; i0>=0; i0--) {
			System.out.print("[ ");
			for(int i1 = 2; i1>=0; i1--) {
				System.out.printf("%d ", matriz[i0][i1]);
			}
			System.out.println("]");
		}
	}

}
