package lista1;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		int vet[] = new int[6];
		int count = 0;
		
		do {
			System.out.println("Digite seu voto");
			System.out.println("1-Claudio");
			System.out.println("2-Claudioa");
			System.out.println("3-Claudinho");
			System.out.println("4-Clauder");
			System.out.println("5-Nulo");
			System.out.println("6-Voto em Branco");
			input = scan.nextInt();
			if (input>0) {
				count++;
				vet[input-1]++;
			}
		} while (input>0);
		
		for (int i = 0; i < vet.length; i++) {
			float porcent = (float)(vet[i]/count)*100;
			System.out.println("Votos candidato "+i+" = "+vet[i]+" correspondendo a "+porcent+"%");
		}
		
		scan.close();

	}

}
