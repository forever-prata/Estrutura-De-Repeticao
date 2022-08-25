package lista1;

import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = scan.nextInt();
		int m = 1;
		int aux = 0;
		
		for (int i = 0; i < num; i++) {
			aux = aux+1;
			System.out.println(aux+"/"+m);
			m=m+2;
		}
		
		scan.close();
		
	}

}
