package lista1;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de pessoas: ");
		int qntd = scan.nextInt();
		int total = 0;
		int idade = 0;
		
		for (int i = 0; i < qntd; i++) {
			System.out.println("Digite a idade "+(i+1));
			idade = scan.nextInt();
			
			total = total+idade;
		}
		
		int media = total/qntd;
		System.out.println("Média = "+media);
		
		if (media<=25) {
			System.out.println("Turma jovem");
		}else if (media<=60) {
			System.out.println("Turma adulta");
		}else {
			System.out.println("Turma idosa");
		}
		
		scan.close();
	}

}
