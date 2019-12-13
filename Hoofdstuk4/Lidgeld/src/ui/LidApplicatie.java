package ui;

import java.util.Scanner;

import domein.domein.domein.Lid;

public class LidApplicatie {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Geef je familienaam: ");
		String naam = input.nextLine();
		System.out.print("Geef je voornaam: ");
		String voornaam = input.nextLine();
		System.out.print("Geef het jaar van begin: ");
		int jaar = input.nextInt();
		
		Lid a = new Lid(naam, voornaam, jaar);
		
		System.out.println(a.berekenLidgeld() + " lidgeld");
	}

}
