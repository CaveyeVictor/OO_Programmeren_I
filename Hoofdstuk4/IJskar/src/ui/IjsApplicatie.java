package ui;

import java.util.Scanner;

import oefening8.domein.domein.IJs;

public class IjsApplicatie {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double totaal = 0;
		
		System.out.print("Hoeveel bollen? (0 stop)");
		int bollen = input.nextInt();
		
		while (bollen != 0) {
			
			
			System.out.printf("Wilt u: %n"
					+ "0 - geen extra%n"
					+ "1 - slagroom%n"
					+ "2 - chocoladesaus%n"
					+ "3 - alle 2%n"
					+ "Uw keuze: ");
			int extra = input.nextInt();
			IJs a = new IJs(bollen, extra);
			System.out.printf("prijs: %.1f%n", a.berekenPrijs());
			totaal += a.berekenPrijs();
			
			System.out.print("Hoeveel bollen? (0 stop)");
			bollen = input.nextInt();
			
		}
		System.out.printf("Totaal werd er voor €%.2f ijsjes verkocht", totaal);
		

	}

}
