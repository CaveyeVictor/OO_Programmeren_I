package ui;

import java.util.Scanner;

import domein.Berekening;

public class BerekeningApplicatie2 {
	

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int a, b, c, d, begingrens, eindgrens;
		
		System.out.println("Geef parameter a in vgl a*x + b*y + c*z = d: ");
		a = inputScanner.nextInt();

		System.out.println("Geef parameter b in vgl a*x + b*y + c*z = d: ");
		b = inputScanner.nextInt();

		System.out.println("Geef parameter c in vgl a*x + b*y + c*z = d: ");
		c = inputScanner.nextInt();

		System.out.println("Geef parameter d in vgl a*x + b*y + c*z = d: ");
		d = inputScanner.nextInt();

		System.out.println("Geef parameter begingrens in vgl a*x + b*y + c*z = d: ");
		begingrens = inputScanner.nextInt();

		System.out.println("Geef parameter eindgrens in vgl a*x + b*y + c*z = d: ");
		eindgrens = inputScanner.nextInt();

		
		
		System.out.println(Berekening.zoekAlleOplossingen(a, b, c, d, begingrens, eindgrens));
		
	}
	Scanner inputScanner = new Scanner(System.in);

}

//1, -2, 3, 4, 2, 2