package ui;

import java.util.Random;
import java.util.Scanner;

import domein.Speler;

public class SpelerApplicatie {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		Random rgRandom = new Random();
		
		System.out.print("Naam speler 1: ");
		String naam1 = inputScanner.nextLine();
		System.out.print("Naam speler 2: ");
		String naam2 = inputScanner.nextLine();
		
		Speler speler1 = new Speler(naam1);
		Speler speler2 = new Speler(naam2);
		
		
		
		System.out.printf("%s, gooi eens.%n", speler1.getNaam());
		int begin1 = rgRandom.nextInt(5);
		System.out.printf("%s, gooi eens.%n", speler2.getNaam());
		int begin2 = rgRandom.nextInt(5);
		
		if (begin1 < begin2) {
			Speler speler3 = new Speler(speler1.getNaam());
			speler1 = speler2;
			speler2 = speler3;
		}
		
		boolean speler1AanBeurt = true;
		
		while (!(speler1.gewonnen() || speler2.gewonnen())) {
			if (speler1AanBeurt) {
				int ogen = rgRandom.nextInt(7);
				System.out.printf("%s: je gooide %d en %s%n", speler1.getNaam(), ogen,speler1.geefNieuwePositie(ogen));
			} else {
				int ogen = rgRandom.nextInt(7);
				System.out.printf("%s: je gooide %d en %s%n", speler2.getNaam(), ogen,speler2.geefNieuwePositie(ogen));
			}
			speler1AanBeurt = !speler1AanBeurt;
		}
		
		
		if (speler1.gewonnen()) {
			System.out.printf("%S heeft GEWONNEN!", speler1.getNaam());
		} else {
			System.out.printf("%S heeft GEWONNEN!", speler2.getNaam());
		}
	}

}
