package lista1;

import java.util.Scanner;

public class Ex35 {

	public static String format(float x) {
	    return String.format("%.2f", x);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		int qtd = 0;
		
		float vet[][] = new float[6][2];
		
		vet[0][0]= (float) 1.2;
		vet[1][0]= (float) 1.3;
		vet[2][0]= (float) 1.5;
		vet[3][0]= (float) 1.2;
		vet[4][0]= (float) 1.3;
		vet[5][0]= (float) 1.0;
		
		do {
			System.out.println("Digite o número do item");
			System.out.println("-----------------------------");
			System.out.println("*100 Cachorro Quente R$ 1,20");
			System.out.println("");
			System.out.println("*101 Bauru Simples R$ 1,30");
			System.out.println("");
			System.out.println("*102 Bauru com ovo R$ 1,50");
			System.out.println("");
			System.out.println("*103 Hambúrguer R$ 1,20");
			System.out.println("");
			System.out.println("*104 Cheeseburguer R$ 1,30");
			System.out.println("");
			System.out.println("*105 Refrigerante5 R$ 1,00");
			input = scan.nextInt()-100;
			
			if (input>=0) {
				System.out.println("Digite a quantidade do item");
				qtd = scan.nextInt();
				
				vet[input][1] = (float)qtd*vet[input][0];
			}
		} while (input>=0);
		
		float total = 0;
		
		for (int i = 0; i < 6; i++) {
			if (vet[i][1]>0) {
				System.out.println("Total do item "+(i+1)+" = R$"+format(vet[i][1]));
				total = total+vet[i][1];
			}
		}
		
		System.out.println("Total = R$"+format(total));
		scan.close();

	}

}
