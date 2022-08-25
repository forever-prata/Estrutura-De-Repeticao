package lista1;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = scan.nextInt();
		int fibo = 1;
		int fiboant = 0;
		int aux = 0;
		
		
		for (int i = 0; i <num; i++) {
			System.out.println(fibo);
			aux = fibo;
			fibo = fibo+fiboant;
			fiboant = aux;
		}
		
		scan.close();
		
	}

}
