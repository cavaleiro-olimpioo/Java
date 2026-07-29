package d032;

import java.util.Arrays;

public class d32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maior = 0;
		int[] lista = { 10, 4, 2, 8, 1 };
		
		for(int i = 0; i < lista.length; i++) {
			if (lista[i] > maior) {
				maior = lista[i];
			}
		}
		
		System.out.print(Arrays.toString(lista));
		System.out.printf("\nMaior: %d", maior);
	}

}
