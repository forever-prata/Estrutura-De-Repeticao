package lista1;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número de turmas");
		int nturma = scan.nextInt();
		int qtd = 0;
		int total = 0;
		
		for (int i = 0; i < nturma; i++) {
			System.out.println("Digite o número de alunos da turma "+(i+1));
			qtd = scan.nextInt();
			
			total = total+qtd;
		}
		
		System.out.println("Média de alunos por turma = "+(total/nturma));
		
		scan.close();
	}

}
