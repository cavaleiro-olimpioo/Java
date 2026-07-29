package d033;

import java.util.Scanner;

public class d33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um número: ");
		n = input.nextInt();
		
		for(int i = 0; i<10; i++) {
			System.out.printf("%d x %d = %d\n", n, i+1, n*(i+1));
		}
	}

}
