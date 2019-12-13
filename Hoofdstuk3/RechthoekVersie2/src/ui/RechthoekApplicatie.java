package ui;

import java.util.Scanner;

import oefening8.domein.domein.Rechthoek;

public class RechthoekApplicatie {

	public static void main(String[] args) {
		Rechthoek rh1 = new Rechthoek(2, 4.5);
		Rechthoek rh2 = new Rechthoek(-2, 6.5);
		System.out.printf("Eerste rechthoek :%n"
				+ "Lengte %.2f%n"
				+ "Breedte %.2f%n"
				+ "Omtrek %.2f%n"
				+ "Oppervlakte %.2f%n%n",
				rh1.getLengte(), rh1.getBreedte(),
				rh1.berekenOmtrek(), rh1.berekenOppervlakte());
		System.out.printf("Tweede rechthoek :%n"
				+ "Lengte %.2f%n"
				+ "Breedte %.2f%n"
				+ "Omtrek %.2f%n"
				+ "Oppervlakte %.2f%n",
				rh2.getLengte(), rh2.getBreedte(),
				rh2.berekenOmtrek(), rh2.berekenOppervlakte());
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nieuwe lengte voor 2e rechthoek: ");
		double nieuweLenghte = input.nextDouble();
		rh2.setLengte(nieuweLenghte);
		
		System.out.printf("Tweede rechthoek :%n"
				+ "Lengte %.2f%n"
				+ "Breedte %.2f%n"
				+ "Omtrek %.2f%n"
				+ "Oppervlakte %.2f%n%n",
				rh2.getLengte(), rh2.getBreedte(),
				rh2.berekenOmtrek(), rh2.berekenOppervlakte());
	}

}
