package lista1;

import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a tabuada: ");
		int tabuada = scan.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(tabuada+" X "+i+" = "+(i*tabuada));
		}
		
		scan.close();
	}

}
