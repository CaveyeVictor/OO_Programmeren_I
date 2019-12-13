package ui;

import domein.Cirkel;

import java.util.Scanner;

public class CirkelApplicatie {

	public static void main(String[] args) {
		Cirkel cirkel = new Cirkel(leesCoordinaat('x'),
				leesCoordinaat('y'), leesStraal());
		toonGegevens(cirkel);
		int keuze;
		do {
			keuze = voerKeuzeIn();
			switch (keuze){
				case 1:
					cirkel.krimp();
					toonGegevens(cirkel);
					break;
				case 2:
					cirkel.groei();
					toonGegevens(cirkel);
					break;
				case 3:
					cirkel = new Cirkel(leesCoordinaat('x'),
							leesCoordinaat('y'), leesStraal());
					toonGegevens(cirkel);
					break;
				case 4:
					System.out.println("Dag :)");
					break;
				default:
					System.out.println("Foute keuze");
			}
		} while (keuze != 4);
	}

	public static int leesCoordinaat(char a){
		Scanner input = new Scanner(System.in);
		System.out.printf("Geef %c-coördinaat: ", a);
		return input.nextInt();
	}

	public static int leesStraal(){
		Scanner input = new Scanner(System.in);
		System.out.print("Geef straal: ");
		return input.nextInt();
	}

	public static void toonGegevens(Cirkel cirkel){
        System.out.println(cirkel.toString());
	}

	public static int voerKeuzeIn(){
		Scanner input = new Scanner(System.in);
		int keuze = -1;
		do {
            System.out.printf("%nKies een keuze%n" +
                    "1) Krimp%n" +
                    "2) Groei%n" +
                    "3) Nieuw middelpunt%n" +
                    "4) Stop programma%n" +
                    "Uw keuze: ");
            keuze = input.nextInt();
        } while (keuze < 1 || keuze > 4);
		return keuze;

	}

}
