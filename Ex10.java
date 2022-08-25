package lista1;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o expoente");
		int num2 = scan.nextInt();
		
		int aux = num1;
		
		for (int i = 0; i+1 < num2; i++) {
			num1 = num1*aux;
		}
		
		System.out.println(num1);
		
		scan.close();

	}

}
