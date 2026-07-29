package d039;
public class d39v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ast = 1;
		for (int l = 0; l<13; l++) {
			for (int c = 0; c<13; c++) {
				if (c <= 6-ast || c >= 6+ast) { System.out.print("- "); } 
				else { System.out.print("* "); }
			}
			System.out.println("");
			if (l<6) { ast += 1; } 
			else { ast -= 1; } 
		}
		
	}

}
