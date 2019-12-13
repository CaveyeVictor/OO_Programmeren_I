package ui;

import java.util.Iterator;
import java.util.Scanner;

import oefening8.domein.domein.MijnGetallen;

public class PriemtweelingApplicatie {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int i = 0;
		int getallen[] = new int [2];
		PriemtweelingApplicatie pta = new PriemtweelingApplicatie();

		while (i < 5) {

			for (int k = 0; k < getallen.length; k++) {
				getallen[k] = pta.voerGetalIn(String.format("Geef getal %d in: "
						, k+1));
			}

			MijnGetallen mg = new MijnGetallen(getallen[0], getallen[1]);
			System.out.println(pta.geefResultaatIsPriemtweeling(mg));
			i++;
		}
	}
	
	private int voerGetalIn(String vraag) {
		System.out.print(vraag);
		return input.nextInt();
	}
	
	private String geefResultaatIsPriemtweeling(MijnGetallen mg) {
		return String.format("%d en %d vormen %S priemtweeling%n"
				, mg.getGetal1(), mg.getGetal2(),
				mg.isPriemtweeling() ? "een" : "geen");
	}

}
