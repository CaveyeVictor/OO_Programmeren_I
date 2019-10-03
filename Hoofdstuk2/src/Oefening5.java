import java.util.Scanner;

public class Oefening5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef een geheel getal in: ");
		int getal = input.nextInt();
		System.out.printf("\tGETAL\tGETAL*10\tGETAL*100\tGETAL*1000%n"
				+ "\t%s\t%s\t%s\t%s",
				(getal), (getal*10), (getal*100), (getal*1000));	
	}
}
