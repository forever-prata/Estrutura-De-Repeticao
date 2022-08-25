package lista1;

import java.util.Scanner;
public class Ex29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a tabuada: ");
		int tabuada = scan.nextInt();
		
		System.out.println("Digite o inicio");
		int inicio = scan.nextInt();
		
		System.out.println("Digite o fim");
		int fim = scan.nextInt();
		
		if (inicio>fim) {
			int aux = inicio;
			inicio = fim;
			fim = aux;
		}
		
		for (int i = inicio; i <= fim; i++) {
			System.out.println(tabuada+" X "+i+" = "+(i*tabuada));
		}
		
		scan.close();
	}

}
