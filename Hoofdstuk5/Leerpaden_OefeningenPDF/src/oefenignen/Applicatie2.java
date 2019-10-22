package oefenignen;

import java.util.Scanner;

public class Applicatie2 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int gemiddelde = 0;
		int getal, i=0;
		do {
			System.out.print("getal: ");
			getal = inputScanner.nextInt();
			if (getal != -1) {
				gemiddelde += getal;
				i++;
			} 
		} while (getal != -1 && i < 10);
		System.out.println("gemiddelde = " + (gemiddelde/i));
	}

}
