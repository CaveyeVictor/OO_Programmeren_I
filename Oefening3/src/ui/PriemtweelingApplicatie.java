package ui;

import java.util.Iterator;
import java.util.Scanner;

import domein.MijnGetallen;

public class PriemtweelingApplicatie {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int i = 0;
		while (i < 5) {
			int getallen[] = new int [2];
			for (int k = 0; k < getallen.length; k++) {
				getallen[k] = voerGetalIn(String.format("Geef getal %d in: "
						, k+1));
			}

			MijnGetallen mg = new MijnGetallen(getallen[0], getallen[1]);
			System.out.println(geefResultaatIsPriemtweeling(mg));
			i++;
		}
	}
	
	private static int voerGetalIn(String vraag) {
		System.out.print(vraag);
		return input.nextInt();
	}
	
	private static String geefResultaatIsPriemtweeling(MijnGetallen mg) {
		return String.format("%d en %d vormen %S priemtweeling%n"
				, mg.getGetal1(), mg.getGetal2(),
				mg.isPriemtweeling() ? "een" : "geen");
	}

}