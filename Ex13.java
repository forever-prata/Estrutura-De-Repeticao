package lista1;

import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o fatorial");
		int fato = scan.nextInt();
		int aux = fato-1;
		
		for (int i = 0; i <= aux; i++) {
			
			fato = fato*aux;
			aux = aux-1;
		}
		
		System.out.println(fato);
		scan.close();

	}

}
