package lista1;

import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name= "";
		String pass = "";
		
		do {
			System.out.println("---------------------------");
			System.out.println("Digite o nome do Usuário");
			name = scan.nextLine();
			
			System.out.println("Digite a Senha");
			pass = scan.nextLine();
			
			if (pass.equals(name)) {
				System.out.println("Senha igual ao nome de Usuário");
			}
			
		} while (pass.equals(name));
		
		scan.close();
	}
}
