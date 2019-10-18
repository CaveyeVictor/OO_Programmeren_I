package ui;

import java.util.Scanner;

public class GetallenApplicatie {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int teller=0;
		
		int laatste;
		
		System.out.printf("Geef geheel getal (-2000 STOP): ");
		int getal = input.nextInt();
		laatste = getal;
		
		while (getal != -2000) {
			if (laatste > getal) {
				teller++;
			}
			laatste = getal;
			System.out.printf("Geef geheel getal (-2000 STOP): ");
			getal = input.nextInt();
			
		}
		System.out.printf("Het aantal getallen dat direct gevolgd wordt door een kleiner getal is %d%n", teller);
	}

}
