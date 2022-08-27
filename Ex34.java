package lista1;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		int div1 = 0;//0-25
		int div2 = 0;//26-50
		int div3 = 0;//51-75
		int div4 = 0;//76-100
		
		do {
			System.out.println("Digite um número positivo, ou um negativo para sair");
			num = scan.nextInt();
			
			if (num!=0) {
				if (num<=25) {
					div1++;
				}else if (num<=50) {
					div2++;
				}else if (num<=75) {
					div3++;
				}else if (num<=100) {
					div4++;
				}
				
			}else {
				System.out.println("Saindo");
			}
		} while (num>=0);
		
		System.out.println("intervalo (0-25) = "+div1);
		System.out.println("intervalo (26-50) = "+div2);
		System.out.println("intervalo (51-75) = "+div3);
		System.out.println("intervalo (76-100) = "+div4);
		scan.close();
	}

}
