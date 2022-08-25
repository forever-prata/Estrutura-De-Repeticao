package lista1;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float total = 0;
		int count = 0;
		float input = 0;
		float max = 0;
		float min = 0;
		boolean primeiro = true;
		
		do {
			System.out.println("Digite a temperatura ou 100 para sair");
			input = scan.nextFloat();
			
			if (primeiro) {
				max = input;
				min = input;
				primeiro = false;
			}else {
				if (input<min) {
					min = input;
				}else if (input>max) {
					max = input;
				}
			}
			
			if (input != 100) {
				total = total+input;
				count++;
			}
			
		} while (input!=100);
		
		
		System.out.println("Média das temperaturas = "+(total/count));
		System.out.println("Temperatura máxima = "+max);
		System.out.println("Temperatura mínima = "+min);
		
		scan.close();
	}

}
