package lista1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float popA = 80000;
		float popB = 200000;
		int count = 0;
		
		while (popA<popB) {
			popA = (float) (popA + (popA*0.03));
			popB = (float) (popB + (popB*0.015));
			count = count+1;
		}
		
		System.out.println("Demoraram : "+count+" Anos");
		
		scan.close();
		
	}

}
