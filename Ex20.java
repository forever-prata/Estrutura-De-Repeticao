package lista1;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas: ");
		int qntd = scan.nextInt();
		float total = 0;
		float nota = 0;
		
		for (int i = 0; i < qntd; i++) {
			System.out.println("Digite a nota "+(i+1));
			nota = scan.nextInt();
			
			total = total+nota;
		}
		
		System.out.println("Média = "+(total/qntd));
		
		scan.close();
	}

}
