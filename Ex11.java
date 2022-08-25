package lista1;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int par = 0;
		int imp = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"º número");
			num = scan.nextInt();
			
			if (num%2 == 0) {
				par = par+1;
			}else {
				imp = imp+1;
			}
		}
		
		System.out.println("Pares = "+par);
		System.out.println("Impares = "+imp);
		
		scan.close();
	}

}
