import java.util.Scanner;

public class Oef2 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		int getallen[] = new int[10], extraGetal;
		
		for (int i = 0; i < getallen.length; i++) {
			System.out.printf("Geef getal: ");
			getallen[i] = inputScanner.nextInt();
		}
		System.out.printf("Geef extra getal: ");
		extraGetal = inputScanner.nextInt();
		
		System.out.printf("deze getallen zijn groter dan %d%n"
				+ "%10s%10s%n", extraGetal, "Index", "Waarde");
		for (int i = 0; i < getallen.length; i++) {
			if (getallen[i] > extraGetal) {
				System.out.printf("%10d%10d%n", i, getallen[i]);
			}
		}
	}

}
