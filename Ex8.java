package lista1;

import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Digite outro número: ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			int aux = num2;
			num2 = num1;
			num1 = aux;
		}
		
		for (int i = num1+1; i <= num2-1; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		System.out.println("soma = "+num1+num2);
		
		scan.close();

	}

}
