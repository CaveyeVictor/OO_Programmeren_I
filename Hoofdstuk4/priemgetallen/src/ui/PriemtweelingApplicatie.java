package ui;

import java.util.Scanner;

import domein.domein.domein.MijnGetallen;

public class PriemtweelingApplicatie {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		while (i < 5) {
			System.out.print("Geef getal1: ");
			int getal1 = input.nextInt();
			System.out.print("Geef getal2: ");
			int getal2 = input.nextInt();
			MijnGetallen a = new MijnGetallen(getal1, getal2);
			System.out.printf("%d en %d vormen %S priemtweeling%n", getal1, getal2, a.isPriemtweeling() ? "een" : "geen");
			i++;
		}

	}

}
