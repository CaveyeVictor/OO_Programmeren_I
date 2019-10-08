import java.util.Scanner;

public class Applicatie4 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		int grootste = 0;
		int kleinste = 0;
		int laatsteGetal = -1;
		
		while (laatsteGetal != 0) {
			System.out.print("Geef een getal (0 om te stoppen): ");
			int getal = input.nextInt();
			if (grootste == 0) {
				grootste = getal;
				kleinste = getal;
			}
			if (getal > grootste) {
				grootste = getal;
			}
			if (getal != 0 && getal < kleinste) {
				kleinste = getal;
			}
			laatsteGetal = getal;
		}
		if (grootste == 0) {
			System.out.println("Er werden geen geldige getallen ingevoerd!");
		} else {
			System.out.printf("Het grootste van alle ingevoerde getallen is %d.%nHet kleinste is %d.", grootste, kleinste);
		}
		
	}

}
