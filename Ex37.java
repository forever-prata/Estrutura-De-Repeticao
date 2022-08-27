package lista1;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String vetor[] = new String[10];
		String resposta[] = new String[10];
		
		int proximo = 0;
		int acertos = 0;
		int maisAcertos = -1;
		int menosAcertos = 11;
		
		vetor[0]="a";
		vetor[1]="b";
		vetor[2]="c";
		vetor[3]="d";
		vetor[4]="e";
		vetor[5]="e";
		vetor[6]="d";
		vetor[7]="c";
		vetor[8]="b";
		vetor[9]="a";
		
		do {
			proximo=0;
			acertos=0;
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("Digite a resposta da questão "+(i+1));
				resposta[i]= scan.nextLine().toLowerCase();
				
				if (resposta [i] == vetor[i]) {
					acertos++;
				}
				
				if (acertos<menosAcertos) {
					menosAcertos = acertos;
				}else if (acertos>maisAcertos) {
					maisAcertos = acertos;
				}
			}
			
			System.out.println("Outro aluno vai usar o sistema? 1-sim 0-nao");
			proximo=scan.nextInt();
		} while (proximo==1);
		
		System.out.println("Menor acerto = "+menosAcertos);
		System.out.println("Maior acerto = "+maisAcertos);
		scan.close();
	}

}
