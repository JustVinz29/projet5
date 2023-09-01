package fr.eni.tempsDeCuisson;

import java.util.Scanner;

public class TempsDeCuisson {

	public static void main(String[] args) {
		
		final int BOEUF = 1;
		final int AGNEAU = 2;
		final int BLEU = 1;
		final int A_POINT = 2;
		final int BIEN_CUIT = 3;
		final int MINUTE = 60;
		final double B_B =(10/500.0);
		final double B_A = 15/400f;
		final double A_PT_B = 17/500f;
		final double A_PT_A = 25/400f;
		final double B_CU_B = 25/500f;
		final double B_CU_A = 40/400f;
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println(B_B);
		
		System.out.println("Viande?");
		System.out.println(BOEUF + " - Boeuf");
		System.out.println(AGNEAU + " - Agneau");
		int viande = scanner.nextInt();
		
		System.out.println("Cuisson?");
		System.out.println(BLEU + " - Bleu?");
		System.out.println(A_POINT + " - A point?");
		System.out.println(BIEN_CUIT + " - Bien cuit?");
		int cuisson = scanner.nextInt();
		System.out.println("Poids en gramme?");
		double poids = scanner.nextInt();
		
		double coeff;
		
		
		if (viande == BOEUF) { 
			switch (cuisson) {
				case BLEU : {
					coeff = B_B ;break;}
				case A_POINT : {
					coeff = A_PT_B;break;}
				default: coeff = B_CU_B;break;}
		}
		else {
			switch (cuisson) {
			case BLEU : {
				coeff = B_A ;break;}
			case A_POINT : {
				coeff = A_PT_A;break;}
			default: coeff = B_CU_A;break;}	
		}
		double resultat = poids*coeff*MINUTE ;
		System.out.println("Le temps de cuisson est de " + resultat);
			
	}
		
		
		

}

