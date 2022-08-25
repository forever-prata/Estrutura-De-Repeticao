package lista1;

public class Ex15 {

	public static void main(String[] args) {
		
		int num1 = 37;
		int num2 = 38;
		int num3 = 1;
		float total = 0;
		
		for (int i = 1; i <= 37; i++) {
			total = total + (num1*num2)/num3;
			num1--;
			num2--;
			num3++;
		}
		System.out.println(total);

	}

}
