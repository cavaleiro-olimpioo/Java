package d039;
import java.util.Scanner;


public class d39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o tamanho do triângulo (min: 5): ");
		int nc = input.nextInt()/2;
		System.out.println("");	
		
		int ev = nc;
		int ep = 1;
		for (int l = 0; l<nc; l++) {
			for (int espv1 = 0; espv1 < ev; espv1++) { System.out.print("- "); }
			for (int espp = 0; espp < ep; espp++) { System.out.print("* "); }
			for (int espv2 = 0; espv2 < ev; espv2++) { System.out.print("- "); }
			System.out.println("");
			ev -= 1;
			ep += 2;
		}
		for (int l = 0; l<nc+1; l++) {
			for (int espv1 = 0; espv1 < ev; espv1++) { System.out.print("- "); }
			for (int espp = 0; espp < ep; espp++) { System.out.print("* "); }
			for (int espv2 = 0; espv2 < ev; espv2++) { System.out.print("- "); }
			System.out.println("");
			ev += 1;
			ep -= 2;
		}
	}

}
