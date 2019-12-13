package ui;

import oefening8.domein.domein.Rekening;

public class RekeningApplicatie {

	public static void main(String[] args) {
		
		Rekening rekening = new Rekening(123456789, "SDG");
		rekening.stortOp(100); //object methode
		System.out.println("info rekening");
		System.out.println("houder = " + rekening.getHouder());

	}

}
