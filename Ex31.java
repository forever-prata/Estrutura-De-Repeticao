package lista1;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int id = 0;
		int idalto = 0;
		int idbaixo = 0;
		float altura = 0;
		float maisAlto = 0;
		float maisBaixo = 0;
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o id");
			id = scan.nextInt();
			
			System.out.println("Digite sua altura: ");
			altura = scan.nextFloat();
			
			if (i == 0) {
				idalto = id;
				idbaixo = id;
				maisAlto = altura;
				maisBaixo = altura;
			}
			
			if (altura>maisAlto) {
				maisAlto = altura;
				idalto = id;
			}else if (altura<maisBaixo) {
				maisBaixo = altura;
				idbaixo = id;
			}
		}
	
			
		System.out.println("Mais baixo = "+idbaixo+" com "+maisBaixo+" metros");
		System.out.println("Mais alto = "+idalto+" com "+maisAlto+" metros");
		
		scan.close();

	}

}
