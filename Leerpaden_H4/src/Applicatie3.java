import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Applicatie3 {
	

	public static void main(String[] args) {
		ArrayList<Integer> getallen;
		getallen = new ArrayList<Integer>();
		int laatsteGetal = 0;
		
		Scanner input =  new Scanner(System.in);
		
		while (laatsteGetal != -1) {
			System.out.print("Geef een getal (-1 om te stoppen): ");
			getallen.add(input.nextInt());
			laatsteGetal = getallen.get(getallen.size()-1);
		}
		
		float gemiddelde = 0;
		int aantal = 0;
		getallen.remove(getallen.size()-1);
		for (Integer getal : getallen) {
			if (getal < 0) {
				gemiddelde += getal;
				aantal += 1.0;
			}
		}

		if (aantal == 0) {
			System.out.println("Er werden geen negatieve getallen ingevoerd!");
		} else {
			System.out.printf("Het gemiddelde van de negatieve getallen is: %.3f%n", gemiddelde/aantal);
		}
		
		

	}

}
