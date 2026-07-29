package d035;
import java.util.Scanner;
public class d35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double altura, peso;
		String grauImc = "";
		
		System.out.print("Digite sua altura: ");
		altura = input.nextDouble();
		
		System.out.print("Digite seu peso (kg): ");
		peso = input.nextDouble();
		
		double imc = peso/(altura*altura);
		
		if(imc < 18.5) {
			grauImc = "abaixo do peso";
		} else if (imc >= 18.5 && imc < 25) {
			grauImc = "peso normal";
		} else if (imc >= 25 && imc < 30) {
			grauImc = "sobrepeso";
		} else if (imc >= 30 && imc < 35) {
			grauImc = "obesidade grau I";
		} else if (imc >= 35 && imc < 40) {
			grauImc = "obesidade grau II";
		} else if (imc >= 40) {
			grauImc = "obesidade grau III";
		}
		
		System.out.printf("Seu IMC é de %.2f%n, seu grau é %s", imc, grauImc);
	}

}
