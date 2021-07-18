package Teme;

import java.util.Scanner;

public class Curs2Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Problema2 IF-Else-IF
		 */
		
		System.out.println("Ce varsta ai: ");
		Scanner scan = new Scanner(System.in);
		int varsta = scan.nextInt();
		scan.close();
		
		if(varsta < 18) {
			System.out.println("Esti minor");
		}
		else if ((varsta > 18) && (varsta <65)) {
			System.out.println("Esti adult");
		}
		else if (varsta > 65) {
			System.out.println("Hai ca esti batran");
		}
	}

}
