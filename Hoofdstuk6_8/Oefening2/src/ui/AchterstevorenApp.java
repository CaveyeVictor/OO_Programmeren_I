package ui;

import java.util.Scanner;

public class AchterstevorenApp {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		AchterstevorenApp achterstevorenApp = new AchterstevorenApp();
		System.out.print("Geef een getal: ");
		System.out.printf("Het getal achterstevoren is: %d",
				achterstevorenApp.draaiOm(inputScanner.nextInt()));

	}
	
	private int draaiOm(int getal) {
        int som = 0;
        while (getal > 0){
            som = som * 10 + getal % 10;
            getal = getal / 10;
        }
        return som;
	}

}
