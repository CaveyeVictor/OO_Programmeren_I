package ui;


import domein.DatumOperaties;

import java.util.Scanner;

public class Hoofdstuk7_oef2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dag;
		int _var$6;
		_var$6 = 9;
		System.out.println(_var$6);

		do {
			System.out.printf("Geef dagnummer van het jaar: ");
			dag = input.nextInt();
			/*if (dag < 365) {
				System.out.printf("dag %d = %s", dag, DatumOperaties.berekenDatumMetDagNummer(dag));
				}*/
		} while (dag > 365);

		System.out.printf("dag %d = %s", dag, DatumOperaties.berekenDatumMetDagNummer(dag));

	}
}
