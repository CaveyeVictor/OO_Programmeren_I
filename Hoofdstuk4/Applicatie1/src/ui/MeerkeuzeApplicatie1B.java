package ui;

import java.util.Scanner;

public class MeerkeuzeApplicatie1B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i=1;
		
		int een=0, twee=0, drie=0, vier=0;
		
		System.out.printf("Geef antwoord %d in (1, 2, 3 of 4), STOP met 0: ", i);
		int getal = input.nextInt();
		
		while (getal != 0) {

			if (getal > -1 && getal < 5) {
				if (getal == 1) {
					een++;
				} else if (getal == 2) {
					twee++;
				} else if (getal == 3) {
					drie++;
				} else if (getal == 4) {
					vier++;
				}
				i++;
			} else {
				System.out.println("Foutieve waarde! Probreer opnieuw!");
			}
			System.out.printf("Geef antwoord %d in (1, 2, 3 of 4), STOP met 0: ", i);
			getal = input.nextInt();

		}
		System.out.printf("Aantal 1 = %d%n"
				+ "Aantal 2 = %d%n"
				+ "Aantal 3 = %d%n"
				+ "Aantal 4 = %d%n", een, twee, drie, vier);
		

	}

}
