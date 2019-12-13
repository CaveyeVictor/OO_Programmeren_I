package ui;

import java.util.List;


import domein.DatumOperaties;
import domein.Simulatie;
import domein.ZelfdeDagJarig;

public class Hoofdstuk7_oef4 {

	public static void main(String[] args) {
		Simulatie s = new Simulatie(60);
		List<ZelfdeDagJarig> zdj = s.maakSimulatie();
		//bij List ALTIJD het type tussen <..> vermelden!!
		//
		//List<ZelfdeDagJarig>
		toonResultaat(zdj);
	}
	
	public static void toonResultaat(List<ZelfdeDagJarig> lijst) {
		System.out.printf("%10s%10s%15s%n", "persoon", "persoon", "verjaardag");
		for (ZelfdeDagJarig zelfdeDag: lijst){
			System.out.printf("%10d%10d%15s%n", zelfdeDag.getPersoon1(), zelfdeDag.getPersoon2(), DatumOperaties.berekenDatumMetDagNummer(zelfdeDag.getDagnr()));
		}
	}

}
