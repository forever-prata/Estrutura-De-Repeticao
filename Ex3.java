package lista1;

import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String name = "";
		
		do {
			System.out.print("Digite o nome: ");
			name = scan.nextLine();
		} while (name.length()< 3);
		
		
		int age = 0;
		
		do {
			System.out.print("Digite a idade: ");
			age = scan.nextInt();
		} while (age <= 0 || age >= 150);
		
		
		float salary = 0;
		
		do {
			System.out.print("Digite o salário: ");
			salary = scan.nextFloat();
		} while (salary < 0);
		
		
		String sex = "";
		scan.nextLine();
		
		do {
			System.out.print("Digite o sexo: ");
			sex = scan.nextLine();
		} while (!sex.toUpperCase().equals("F") && !sex.toUpperCase().equals("M"));
		
		
		String civilState = "";
		
		do {
			System.out.print("Digite o estado civil: ");
			civilState= scan.nextLine();
		} while (!civilState.toUpperCase().equals("S") && !civilState.toUpperCase().equals("C") && !civilState.toUpperCase().equals("V") && !civilState.toUpperCase().equals("D"));
		
		
		scan.close();
	}

}
