package Exercícios;
import java.util.Scanner;
public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//01)  Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
		//senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada
		//corretamente deve ser impressa a mensagem "Acesso Permitido"e o algoritmo encerrado. Considere que
		//a senha correta é o valor 2002.

		
		double valor;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a senha: ");
		valor = sc.nextDouble();

		while(valor!=2002) {
			System.out.println("Senha Inválida");
			System.out.println("Digite a senha: ");
			valor = sc.nextDouble();
		}
		
		System.out.printf("Acesso Permitido");
		
		sc.close();
		
	}

}
