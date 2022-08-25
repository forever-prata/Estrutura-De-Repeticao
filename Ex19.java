package lista1;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Mostrar todo os números primos entre 1 e :");
		int num = scan.nextInt();
		int div = 0;
		int ndiv = 0;
		
		for (int i = 1; i <= num; i++) {
			div = 0;
			for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					div = div+1;
				}
				ndiv = ndiv+1;
			}
			if (div == 2) {
				System.out.println(i);
			}
		}
		System.out.println(ndiv+" Divisões");
		scan.close();
		
	}

}
