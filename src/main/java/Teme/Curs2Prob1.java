package Teme;

import java.util.Scanner;

public class Curs2Prob1 {
	
public static void main(String[] args) {
		
		/**
		 * Problema1 - Program care intreaba utilizatorul punctajul unui test
		 * Daca utilizatorul intreoduce o valoare intre 0 si 65 atunci printeaza
		 * "Ai picat. Se pare ca n-ai invatat " 
		 * Daca utilizatorul introduce o valoare intre mai mare sau egala cu 66 atunci
		 * printeaza "Felicitari, ai trecut"
		 */
		
		System.out.println("Baga punctele de la test: ");
		Scanner sc = new Scanner(System.in);
		int nr = sc.nextInt();
		sc.close();
		
		if (nr <=65 ) {
			
			System.out.println("Ai picat. Se pare ca n-ai invatat dar ai citit");
		}
		else  {
			System.out.println("Felicitari ai trecut");
		}
		
	}


}
