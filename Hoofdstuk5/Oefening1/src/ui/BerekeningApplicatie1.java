package ui;

import java.util.Scanner;

import domein.Berekening;

public class BerekeningApplicatie1 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("code?");
		int code = inputScanner.nextInt();
		System.out.println("getal 1: ");
		int x = inputScanner.nextInt();
		System.out.println("getal 2: ");
		int y = inputScanner.nextInt();
		Berekening aBerekening = new Berekening(x, y);
		
		switch (code) {
			case 1:
				System.out.println(aBerekening.geefSom());
				break;
			case 2:
				System.out.println(aBerekening.geefVerschil());
				break;
			case 3:
				System.out.println(aBerekening.geefProduct());
				break;
			case 4:
				System.out.println(aBerekening.geefQuotient());
				break;
			case -1:
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + code);
		}
	}
}


