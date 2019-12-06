package ui;

import domein.Winkel;

public class Hoofdstuk7_oef3 {

	public static void main(String[] args) {
		Winkel winkel = new Winkel();
	    final double cijfers[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	    final double testGegevens[][] = {{1,2,3,4,5},{1,2,3,4,5},{3,4,5,6,7}};
        double resultaat[][] = new double[3][5];
	    
        winkel.vulVerkoopcijfersOp(resultaat, cijfers);

	}

}
