package ui;


import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MenuApplicatie {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int menu = -1;
		do {
			menu = toonMenuEnGeefKeuze(inputScanner);
			switch (menu) {
			case 1:
				toonResultaat(geefBegroeting());
				break;
			case 2:
				toonResultaat(toonHuidigeDatum());
				break;
			case 3:
				System.out.print("Geef een getal: ");
				toonResultaat(zetOmNaarHexadecimaal(inputScanner.nextInt()));
			default:
				break;
			}
		} while (menu != 0);

	}
	
	public static int toonMenuEnGeefKeuze(Scanner inputScanner) {
		int keuze = -1;
		do {
			System.out.printf("Menu:%n1) Begroeting%n2) Huidige datum%n"
					+ "3) Naar hexadecimaal%n0) Stoppen%nGeef uw keuze: ");
			keuze = inputScanner.nextInt();
		} while (keuze < 0 || keuze > 3);

		return keuze;
	}
	
	public static String geefBegroeting() {
		return String.format("Hallo ... %n%n");
	}
	
	public static String toonHuidigeDatum() {
		final Locale NL = new Locale("nl", "NL");
		Format dateFormat = new SimpleDateFormat("EEEE, dd MMMM, yyyy", NL);
		Date date = new Date();
		return String.format("%s%n%n", dateFormat.format(date));
	}
	
	public static String zetOmNaarHexadecimaal(int getal) {
		return String.format("hexadecimaal van %d is %X%n%n", getal, getal);
	}
	
	public static void toonResultaat(String res) {
		System.out.printf("%s", res);
	}

}
