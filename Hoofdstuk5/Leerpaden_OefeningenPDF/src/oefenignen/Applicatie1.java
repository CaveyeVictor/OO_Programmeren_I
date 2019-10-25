package oefenignen;

public class Applicatie1 {

	public static void main(String[] args) {
		int aantalLeeuwen = 50, jaar = 0;
		while (aantalLeeuwen < 1000) {
			aantalLeeuwen = aantalLeeuwen +  ((aantalLeeuwen*15)/100);
			jaar++;
			System.out.println(jaar + " " + aantalLeeuwen);
		}
		System.out.println(jaar + "jaar");

	}

}
