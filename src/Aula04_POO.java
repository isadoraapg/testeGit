import java.util.Scanner;

public class Aula04_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//classe - objeto - herança - polimorfismo - encapsulamento
		//interfaces - abstração - composição
		
		
		//Exercício slide: area dos triangulos, dizer ql é a maior
		
		
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Entre com as medidas do triângulo x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triângulo y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		
		
		double xP = (xA + xB + xC)/2.0;
		
		double areaX = Math.sqrt(xP*(xP - xA) * (xP - xB) * ( xP - xC));
		
		
		double yP = (yA + yB + yC)/2.0;
		
		double areaY = Math.sqrt(yP*(yP - yA) * (yP - yB) * ( yP - yC));
		
		
		System.out.println("A área do triângulo X: " + areaX);
		System.out.println("A área do triângulo Y: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("A área do triângulo X é a maior");
		}else {
			System.out.println("A área do triângulo Y é a maior");
		}
		
	}

}
