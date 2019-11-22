package ui;


import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MenuApplicatie2 {
	static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] args) {
		int menu = -1;
		MenuApplicatie2 applicatie2 = new MenuApplicatie2();
		do {
			menu = applicatie2.toonMenuEnGeefKeuze();
			switch (menu) {
			case 1:
				applicatie2.toonResultaat(applicatie2.geefBegroeting());
				break;
			case 2:
				applicatie2.toonResultaat(applicatie2.toonHuidigeDatum());
				break;
			case 3:
				System.out.print("Geef een getal: ");
				applicatie2.toonResultaat(applicatie2.zetOmNaarHexadecimaal(inputScanner.nextInt()));
			default:
				break;
			}
		} while (menu != 0);

	}
	
	public int toonMenuEnGeefKeuze() {
		System.out.printf("Menu:%n1) Begroeting%n2) Huidige datum%n"
				+ "3) Naar hexadecimaal%n0) Stoppen%nGeef uw keuze: ");
		return inputScanner.nextInt();
	}
	
	public String geefBegroeting() {
		return String.format("Hallo ... %n%n");
	}
	
	public String toonHuidigeDatum() {
		final Locale NL = new Locale("nl", "NL");
		Format dateFormat = new SimpleDateFormat("EEEE, dd MMMM, yyyy", NL);
		Date date = new Date();
		String tempString = dateFormat.format(date);
		return String.format("%s%n%n", tempString);
	}
	
	public String zetOmNaarHexadecimaal(int getal) {
		return String.format("hexadecimaal van %d is %X%n%n", getal, getal);
	}
	
	public void toonResultaat(String res) {
		System.out.printf("%s", res);
	}

}
