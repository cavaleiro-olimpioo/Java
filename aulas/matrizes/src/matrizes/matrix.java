package matrizes;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {
				{ 2, 3, 4 },
				{ 4, 5, 6 },
				{ 6, 2, 8 }
		};
		
		for (int ic = 0; ic<3; ic++) {
			System.out.print("[ ");
			for (int il = 0; il<3; il++) {
				if (ic == il) {
					System.out.printf("%d ", matriz[ic][il]);
					
				} else {
					System.out.print("- ");
				}
			}
			System.out.println("]");
		}
	}

}
