package ui;

import java.util.Scanner;

import oefening8.domein.domein.Marktkraam;

public class MarktkraamApplicatie {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int aantalKramen;
		do {
			System.out.print("Geen aantal kramen rommelmarkt: ");
			aantalKramen = inScanner.nextInt();
		} while (aantalKramen <= 0);

		Marktkraam[] arrayMarktkraam = new Marktkraam[aantalKramen];
		
		for (int i = 0; i < arrayMarktkraam.length; i++) {
			inScanner.nextLine(); //de enter uit de buffer halen.
			System.out.printf("Naam eigenaar kraam %d: ", i+1);
			String naamString = inScanner.nextLine();

			System.out.printf("Lengte in meter kraam %d: ", i+1);
			int meter = inScanner.nextInt();
			
			arrayMarktkraam[i] = new Marktkraam(naamString, meter);
		}
		
		int ietsKopen, keuze;
		
		do {
			System.out.println("Aan welk kraam iets kopen?");
			System.out.println("0. Stoppen");
			int i = 1;
			for (Marktkraam mk: arrayMarktkraam){
				System.out.printf("%d. Kraam van %s%n", i, mk.getNaam());
			}
			System.out.print("Geef je keuze: ");
			keuze = inScanner.nextInt();


			if (keuze != 0 || keuze < arrayMarktkraam.length || keuze > 1) {
				System.out.print("Geef prijs in euro van gekochte item: ");
				double prijs = inScanner.nextDouble();
				arrayMarktkraam[keuze-1].voegToeAanInkomsten(prijs);

			}

		} while (keuze > 0 && keuze <= arrayMarktkraam.length );
		
		int j = 1;
		System.out.println("Overzicht per kraam");
		for (Marktkraam mk: arrayMarktkraam){
			System.out.printf("%5d%10S%15.2f%n",
					j, mk.getNaam(), mk.berekenWinst());
			j++;
		}
	}

}
