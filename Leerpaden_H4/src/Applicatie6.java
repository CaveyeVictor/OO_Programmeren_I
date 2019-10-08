import java.util.Scanner;

public class Applicatie6 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Geef lengte a: ");
		int a = input.nextInt();
		System.out.println("Geef lengte b: ");
		int b = input.nextInt();
		System.out.println("Geef lengte c: ");
		int c = input.nextInt();
		
		Driehoek d = new Driehoek(a, b, c);
		if (d.isRechthoekigeDriehoek()) {
			System.out.printf("Dit is een gelijkzijdige driehoek%n");
		} else {
			System.out.printf("Dit is geen gelijkzijdige driehoek%n");
		}
		
	}

}
