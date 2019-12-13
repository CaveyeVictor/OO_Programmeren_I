package ui;

import java.util.Scanner;

import domein.Marktkraam;

public class MarktkraamApp {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int aantalKramen;
		do {
			System.out.print("Geen aantal kramen rommelmarkt: ");
			aantalKramen = inScanner.nextInt();
		} while (aantalKramen <= 0);

		Marktkraam[] arrayMarktkraam = new Marktkraam[aantalKramen];
		
		for (int i = 0; i < arrayMarktkraam.length; i++) {
			System.out.printf("Naam eigenaar kraam %d: %n", i+1);
			String naamString = inScanner.nextLine();
			System.out.println();
			System.out.printf("Lengte in meter kraam %d: ", i+1);
			int meter = inScanner.nextInt();
			
			arrayMarktkraam[i] = new Marktkraam(naamString, meter);
		}
		
		int ietsKopen, keuze;
		
		do {
			System.out.println("Aan welk kraam iets kopen?%n");
			System.out.printf("0. Stoppen");
			for (int i = 0; i < arrayMarktkraam.length+1; i++) {
				System.out.printf("%d. Kraam van %s%n", i+1, arrayMarktkraam[i].getNaam());
			}
			System.out.print("Geef je keuze: ");
			keuze = inScanner.nextInt();
			System.out.print("Geef prijs in euro van gekochte item: ");
			double prijs = inScanner.nextDouble();
			
			if (keuze != 0) {
				arrayMarktkraam[keuze-1].voegToeAanInkomsten(prijs);
			}
			
		} while (keuze >= 0 || keuze <= 4 );
		
		
		System.out.println("Overzicht per kraam");
		for (int i = 0; i < arrayMarktkraam.length; i++) {
			System.out.printf("%5d%10S%15.2f%n",
					i+1, arrayMarktkraam[i].getNaam(), arrayMarktkraam[i].berekenWinst());
		}
	}

}
