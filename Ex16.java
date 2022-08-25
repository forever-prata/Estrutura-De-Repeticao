package lista1;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero de termos: ");
		int qnt = scan.nextInt();
		
		int menor = 0;
		int maior = 0;
		int total = 0;
		int num = 0;
		
		for (int i = 0; i < qnt; i++) {
			System.out.println("Digite o número");
			num = scan.nextInt();
			
			if (i == 0) {
				menor = num;
				maior = num;
			}else {
				if (num<menor) {
					menor = num;
				}else if (num>maior) {
					maior=num;
				}
			}
			
			total = total+num;
			
		}
		
		System.out.println("Menor termo = "+menor);
		System.out.println("Maior termo = "+maior);
		System.out.println("Soma dos termos = "+total);
		
		scan.close();
		

	}

}
