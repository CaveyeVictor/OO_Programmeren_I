import java.util.Scanner;

public class Oefening7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef een geheel getal in: ");
		int getal = input.nextInt();
		System.out.printf("Het ingevoerde getal %d is een %d getal.", getal, (getal%2==0 ? "even" : "onven"));
	}
}
