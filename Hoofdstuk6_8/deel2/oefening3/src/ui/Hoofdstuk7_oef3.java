package ui;

import domein.Winkel;

public class Hoofdstuk7_oef3 {

	private final static String[] WEEKDAGEN = {"maandag",  "dinsdag",  "woensdag",  "donderdag",  "vrijdag"};
	private static Winkel winkel = new Winkel();

	public static void main(String[] args) {
		double[] cijfers = {100.50, 500, 700, 0, 333.95, 1000, 489, 789.10, 90, 50000, 66, 0, 700, 20, 30};
		double[][] verkoopcijfers = new double[cijfers.length/WEEKDAGEN.length][WEEKDAGEN.length];
		System.out.println(verkoopcijfers.length + " " + verkoopcijfers[0].length);
		Hoofdstuk7_oef3 oef = new Hoofdstuk7_oef3();
		verkoopcijfers = winkel.vulVerkoopcijfersOp(verkoopcijfers, cijfers);

		oef.toonSomPerDag(verkoopcijfers);
		oef.toonSomPerProduct(verkoopcijfers);
		oef.toonVerkoopcijfers(verkoopcijfers);


	}

	private void toonSomPerDag(double[][] verkoopcijfers){
		int i = 0;
		System.out.println("TOTAAL");
		for (String dag: WEEKDAGEN) {
			System.out.printf("%-10s : %.2f%n", dag, winkel.berekenSomPerDag(verkoopcijfers, i));
			i++;
		}
		System.out.printf("%n");
	}

	private void toonSomPerProduct(double[][] verkoopcijfers){
		System.out.println("TOTAAL");
		int product = 1;
		for (double[] week: verkoopcijfers){
			System.out.printf("product %d : %.2f%n", product, winkel.berekenSomPerProduct(week));
			product++;
		}
		System.out.printf("%n");
	}

	private void toonVerkoopcijfers(double[][] verkoopcijfers){
		int product = 1;
		//witruimte
		System.out.printf("%7s %2s ", "", "");
		//dagen printen
		for (String dag: WEEKDAGEN){
			System.out.printf("%10s", dag);
		}
		//producten en cijfers printen
		for (double[] week: verkoopcijfers){
			System.out.printf("%nproduct %2d ", product);
			product++;
			for (double dag: week){
				System.out.printf("%10.2f", dag);
				// getallen zijn: 1.10 ipv 1,10
				// Komt door door de local instellingen? (bij mij op EN-UK)
				// --> Ja
			}
		}
	}
}

