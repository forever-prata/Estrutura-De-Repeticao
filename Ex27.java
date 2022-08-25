package lista1;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		float valor,total = 0;
		int i = 1;
		
		do {
			System.out.print("Digite o valor do produto "+i+" ");
			valor = scan.nextFloat();
			
			total = total+valor;
			i++;
			
		} while (valor!=0);
		
		System.out.print("Pagamento: ");
		float pagamento = scan.nextFloat();
		
		System.out.println("----------------------------");
		String resultado = String.format("%.2f", total);
		System.out.println("Valor total da compra : R$"+resultado);
		
		resultado = String.format("%.2f", pagamento);
		System.out.println("Pagamento = "+resultado);
		
		resultado = String.format("%.2f", pagamento-total);
		System.out.println("Troco = "+resultado);
		
		scan.close();
	}

}
