package lista1;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número de votantes");
		int num = scan.nextInt();
		int voto = 0;
		int cand1 = 0;
		int cand2 = 0;
		int cand3 = 0;
		int invalido = 0;
		
		for (int i = 0; i < num; i++) {
			System.out.println("Digite seu voto");
			System.out.println("---------------");
			System.out.println("1 , 2 , 3");
			System.out.println("---------------");
			voto = scan.nextInt();
			
			if (voto==1) {
				cand1=cand1+1;
			}else if (voto==2) {
				cand2=cand2+1;
			}else if (voto==3) {
				cand3=cand3+1;
			}else {
				System.out.println("Voto inválida contabilizado");
				invalido=invalido+1;
			}
			
		}
		
		System.out.println("----Resultado----");
		System.out.println("-----------------");
		System.out.println("Candidato 1 = "+cand1);
		System.out.println("Candidato 2 = "+cand2);
		System.out.println("Candidato 3 = "+cand3);
		System.out.println("-----------------");
		System.out.println("Inválidos = "+invalido);
		
		scan.close();

	}

}
