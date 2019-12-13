package ui;

import oefening8.domein.domein.Rechthoek;

public class RechthoekApplicatie {

	public static void main(String[] args) {
		Rechthoek rh1 = new Rechthoek(2, 4.5);
		Rechthoek rh2 = new Rechthoek(1, 6.5);
		System.out.printf("Eerste rechthoek :%n"
				+ "Lengte %.2f%n"
				+ "Breedte %.2f%n"
				+ "Omtrek %.2f%n"
				+ "Oppervlakte %.2f%n",
				rh1.getLengte(), rh1.getBreedte(),
				rh1.berekenOmtrek(), rh1.berekenOppervlakte());
		System.out.printf("Tweede rechthoek :%n"
				+ "Lengte %.2f%n"
				+ "Breedte %.2f%n"
				+ "Omtrek %.2f%n"
				+ "Oppervlakte %.2f%n",
				rh2.getLengte(), rh2.getBreedte(),
				rh2.berekenOmtrek(), rh2.berekenOppervlakte());
	}

}
