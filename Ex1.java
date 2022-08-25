package lista1;

import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		do {
			System.out.println("Digite um número entre 0 e 10");
			num = scan.nextInt();
			
			if (num < 0 || num > 10) {
				System.out.println("Número inválido");
			}
			
		} while (num < 0 || num > 10);
		
		scan.close();
	}
}
