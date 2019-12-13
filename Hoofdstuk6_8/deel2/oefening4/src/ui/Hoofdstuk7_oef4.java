package ui;

import java.util.List;


import oefening8.DatumOperaties;
import oefening8.Simulatie;
import oefening8.ZelfdeDagJarig;

public class Hoofdstuk7_oef4 {

	public static void main(String[] args) {
		Simulatie s = new Simulatie(60);
		List<ZelfdeDagJarig> zdj = s.maakSimulatie();
		toonResultaat(zdj);
	}
	
	public static void toonResultaat(List<ZelfdeDagJarig> lijst) {
		System.out.printf("%10s%10s%15s%n", "persoon", "persoon", "verjaardag");
		for (ZelfdeDagJarig zelfdeDag: lijst){
			System.out.printf("%10d%10d%15s%n", zelfdeDag.getPersoon1(), zelfdeDag.getPersoon2(), DatumOperaties.berekenDatumMetDagNummer(zelfdeDag.getDagnr()));
		}
	}

}
