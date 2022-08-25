package lista1;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de CD's na coleção: ");
		int qtd = scan.nextInt();
		int valor = 0;
		int total = 0;
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite o valor do CD "+(i+1));
			valor = scan.nextInt();
			
			total = total+valor;
		}
		
		System.out.println("Valor total investido = "+total);
		System.out.println("Valor médio por CD = "+(total/qtd));
		
		scan.close();
	}

}
