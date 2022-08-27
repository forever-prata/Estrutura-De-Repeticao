package lista1;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int id = 0;
		int veiculos = 0;
		int acidente = 0;
		int idMaiorAcd = 0;
		int idMenorAcd = 0;
		int maiorAcd = 0;
		int menorAcd = 0;
		int totalVeic = 0;
		int totalAcd = 0;
		int count = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o id da cidade: ");
			id = scan.nextInt();
			
			System.out.println("Digite o número de veiculos de passeio: ");
			veiculos = scan.nextInt();
			
			System.out.println("Digite o número de acidentes de transito com vítimas: ");
			acidente = 0;
			
			if (i == 0) {
				idMaiorAcd = id;
				idMenorAcd = id;
				maiorAcd = acidente;
				menorAcd = acidente;
			}
			
			if (acidente>maiorAcd) {
				maiorAcd = acidente;
				idMaiorAcd = id;
			}else if (acidente<menorAcd) {
				menorAcd = acidente;
				idMenorAcd = id;
			}
			
			
			totalVeic += veiculos;
			
			if (veiculos<2000) {
				totalAcd += acidente;
				count++;
			}
		}
		
		
		System.out.println("Mais acidentes = cidade "+idMaiorAcd+" com "+maiorAcd+" acidentes");
		System.out.println("Menos acidentes = cidade "+idMenorAcd+" com "+menorAcd+" acidentes");
		
		float mediaVeic = totalVeic/5;
		System.out.println("Média de veículos = "+mediaVeic);
		
		float media2K = totalAcd/count;
		System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos = "+media2K);
		
		
		
		scan.close();

	}

}
