package ui;

import domein.domein.domein.Punt;

import java.util.Scanner;

public class PuntApplicatie {

	public static void main(String[] args) {

		//todo & feebback:
		// de methode: 		public boolean vergelijkMetPunt(Punt punt) gebruiken en de controle proberen te beperken tot 1 keer ipv 2 keer


		PuntApplicatie puntApplicatie = new PuntApplicatie();
		Scanner sc = new Scanner(System.in);
		int teller = 1;
		double omtrek = 0;
		String vraag1 = "Geef eerste co�rdinaat in : ",
				vraag2 = "Geef tweede co�rdinaat in : ",
				aantalHoekenString = "Het aantal hoekpunten = ",
				omtrekString = "De omtrek = ";

		Punt eerste = puntApplicatie.leesPunt(vraag1, vraag2, sc);
		Punt vorig = eerste;

		vraag1 = String.format("Geef eerste co�rdinaat in (%d om te stoppen):", eerste.getX());
		vraag2 = String.format("Geef tweede co�rdinaat in (%d om te stoppen):", eerste.getY());

		do {

			Punt nieuwPunt = puntApplicatie.leesPunt(vraag1, vraag2, sc);
			if (nieuwPunt.getX() != eerste.getX() || nieuwPunt.getY() != eerste.getY()){
				omtrek += nieuwPunt.berekenAfstandTotPunt(vorig);
				teller++;
			} else {
				omtrek += nieuwPunt.berekenAfstandTotPunt(vorig);
			}
			vorig = nieuwPunt;
		} while (eerste.getX() != vorig.getX() || eerste.getY() != vorig.getY());
		
		

		puntApplicatie.toonAantalHoekpunten(teller, aantalHoekenString);
		puntApplicatie.toonOmtrek(omtrek, omtrekString);
	}

	private Punt leesPunt(String vraag1, String vraag2, Scanner sc){
		return new Punt(leesCoordinaat(vraag1, sc), leesCoordinaat(vraag2, sc));
	}

	private int leesCoordinaat(String vraag, Scanner sc){
		System.out.println(vraag);
		return sc.nextInt();
	}

	private void toonAantalHoekpunten(int aantal, String boodschap){
		System.out.printf("%s%d%n", boodschap, aantal);
	}

	private void toonOmtrek(double omtrek, String boodschap){
		System.out.printf("%s%.2f%n", boodschap, omtrek);
	}

}
