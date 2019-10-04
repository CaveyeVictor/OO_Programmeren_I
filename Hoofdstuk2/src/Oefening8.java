import java.util.Scanner;

public class Oefening8 {

	public static void main(String[] args) {
		int kleinste;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Geef eerste getal: ");
		int getal1 = input.nextInt();
		kleinste = getal1;
		System.out.println("Geef tweede getal: ");
		int getal2 = input.nextInt();
		if (getal2 < kleinste) {
			kleinste = getal2;
		}
		System.out.println("Geef derde getal: ");
		int getal3 = input.nextInt();
		if (getal3 < kleinste) {
			kleinste = getal3;
		}
		
		System.out.printf("Van de ingevoerde getallen %d, %d en %d is de som %d\n", getal1, getal2, getal3, getal1+getal2+getal3);
		System.out.printf("het gemiddelde %d%n", Math.round((getal1+getal2+getal3)/3));
		System.out.printf("het product %d%n", (getal1*getal2*getal3));
		
		System.out.printf("en het kleinste getal %s%n", kleinste);
	}
}
