package lista1;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int id = 0;
		int idalto = 0;
		int idbaixo = 0;
		int idmagro = 0;
		int idgordo = 0;
		float peso = 0;
		float altura = 0;
		float maisalto = 0;
		float maisbaixo = 0;
		float maismagro = 0;
		float maisgordo = 0;
		float totalPeso = 0;
		float totalAltura = 0;
		int count = 1;
		
		do {
			System.out.println("Digite o id ou 0 para sair");
			id = scan.nextInt();
			
			if (id!=0) {
				System.out.println("Digite seu peso: ");
				peso = scan.nextFloat();
				
				System.out.println("Digite sua altura: ");
				altura = scan.nextFloat();
				
				if (count == 1) {
					idalto = id;
					idbaixo = id;
					idmagro = id;
					idgordo = id;
					maisalto = altura;
					maisbaixo = altura;
					maismagro = peso;
					maisgordo = peso;
				}
				
				
				if (altura>maisalto) {
					maisalto = altura;
					idalto = id;
				}else if (altura<maisbaixo) {
					maisbaixo = altura;
					idbaixo = id;
				}
				
				if (peso>maisgordo) {
					maisgordo = peso;
					idgordo = id;
				}else if (peso<maismagro) {
					maismagro = peso;
					idmagro = id;
				}
				
				totalPeso += peso;
				totalAltura += altura;
				count++;
				
			}
					
		} while (id!=0);
			
		System.out.println("Mais baixo = "+idbaixo+" com "+maisbaixo+" metros");
		System.out.println("Mais alto = "+idalto+" com "+maisalto+" metros");
		System.out.println("Mais magro = "+idmagro+" com "+maismagro+" Kg");
		System.out.println("Mais gordo = "+idgordo+" com "+maisgordo+" kg");
		
		float mediaPeso = (float)totalPeso/count;
		System.out.println("Peso Médio = "+mediaPeso);
		
		float mediaAltura = (float)totalAltura/count;
		System.out.println("Altura Média = "+mediaAltura);
		
		scan.close();

	}

}
