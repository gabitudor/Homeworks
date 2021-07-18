package Teme;

import java.util.Scanner;

public class Curs2Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("introduceti nr : ");
		Scanner sc = new Scanner(System.in);
		int ziuaSaptamanii = sc.nextInt();
		sc.close();	
		
		switch(ziuaSaptamanii) {
		
		case 2:
			System.out.println("Miercuri");
		break;
		case 3:
			System.out.println("Joi");
		break;
		case 4:
			System.out.println("Vineri");
		break;
		case 5:
			System.out.println("Sambata");
		break;
		case 6:
			System.out.println("Duminica");
		break;
		default: System.out.println("introduceti un nr intre 1 si 7 ");
		
		}
		
	}

}
