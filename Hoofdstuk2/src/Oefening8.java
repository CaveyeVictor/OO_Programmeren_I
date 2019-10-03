import java.util.Scanner;

public class Oefening8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef eerste getal: ");
		int getal1 = input.nextInt();
		System.out.println("Geef tweede getal: ");
		int getal2 = input.nextInt();
		System.out.println("Geef derde getal: ");
		int getal3 = input.nextInt();
		System.out.printf("Van de ingevoerde getallen %d, %d en %d is de som %d\n", getal1, getal2, getal3, Math.round(getal1+getal2+getal3));
		System.out.printf("het gemiddelde %d%n", Math.round((getal1+getal2+getal3)/3));
		System.out.printf("het product %d%n", (getal1*getal2*getal3));
		System.out.printf("en het kleinste getal %s%n", (getal1 < getal2 ? getal1 < getal3 ? getal1 : getal3 : getal2 < getal3 ? getal2 : getal3));
	}
}
