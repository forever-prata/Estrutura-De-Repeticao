package lista1;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = scan.nextInt();
		int div = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				div = div+1;
			}
		}
		
		if (div==2) {
			System.out.println("é primo");
		}else {
			System.out.println("não é primo");
		}
		
		scan.close();

	}

}
