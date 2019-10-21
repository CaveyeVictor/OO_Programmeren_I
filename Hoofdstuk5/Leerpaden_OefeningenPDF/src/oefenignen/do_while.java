package oefenignen;

import java.util.Scanner;

public class do_while {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int getal1, getal2;
		do {
			System.out.print("Eerste getal");
			getal1 = inputScanner.nextInt();
			
			System.out.print("Tweede getal");
			getal2 = inputScanner.nextInt();
		} while (!((getal1 != 1000 && getal1 % 12 != 0) && getal2 > getal1));
		System.out.println("ok");
	}
	
	public void een() {
		Scanner inputScanner = new Scanner(System.in);
		int getal;
		do {
			System.out.print("Strikt oneven negetief getal: ");
			getal = inputScanner.nextInt();
			
		} while (getal >= 0 || getal % 2 == 0);
		System.out.println("done");
	}

}
