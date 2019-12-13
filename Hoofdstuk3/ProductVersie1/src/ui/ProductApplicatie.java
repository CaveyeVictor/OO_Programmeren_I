package ui;

import java.util.Scanner;

import oefening8.domein.domein.Product;

public class ProductApplicatie {

	public static void main(String[] args) {
		Product pannenkoek = new Product("Pannenkoek",
				0.125, 21, 5);
		Product pannenkoekms = new Product("Pannenkoek met suiker",
				2, 6, 10);
		Product pannenkoekmc = new Product("Pannenkoek met choco",
				2.20, 6, 15);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hoeveel pannenkoeken?");
		int p = input.nextInt();
		System.out.println("Hoeveel pannenkoeken met suiker?");
		int pms = input.nextInt();
		System.out.println("Hoeveel pannenkoeken met choco?");
		int pmc = input.nextInt();
		
		System.out.printf("Aan de kassa zal u %.2f EURO moeten betalen",
				pannenkoek.berekenPrijs(p)*p+pannenkoekms.berekenPrijs(pms)*pms+
				pannenkoekmc.berekenPrijs(pmc)*pmc);
	}

}
