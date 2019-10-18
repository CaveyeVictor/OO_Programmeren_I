package ui;

import java.util.Scanner;

public class MeerkeuzeApplicatie1A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 1;
		int een=0, twee=0, drie=0, vier=0;
		while (i < 16) {
			System.out.printf("Geef antwoord %d in (1, 2, 3 of 4): ", i);
			int getal = input.nextInt();
			if (getal > 0 && getal < 5) {
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

		}
		System.out.printf("Aantal 1 = %d%n"
				+ "Aantal 2 = %d%n"
				+ "Aantal 3 = %d%n"
				+ "Aantal 4 = %d%n", een, twee, drie, vier);
		

	}

}
