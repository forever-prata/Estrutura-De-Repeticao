package lista1;

public class Ex26 {

	public static void main(String[] args) {
		
		final float preco = (float) 0.18;
		String resultado="";
		
		System.out.println("Preço do pão: R$ 0.18");
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		
		for (int i = 0; i < 50; i++) {
			resultado = String.format("%.2f", preco*(i+1));
			System.out.println((i+1)+" - R$"+resultado);
		}
		
	}

}