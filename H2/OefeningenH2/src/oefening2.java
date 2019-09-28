import java.util.Scanner;
public class oefening2
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Geef een strikt positieve zijde van een vierkant in: ");
		int zijde = input.nextInt();
		System.out.printf("De zijde = %s%n", zijde);
		System.out.printf("De omtrek = %s%n", zijde*4);
		System.out.printf("De oppervlakte = %s%n", zijde*zijde);
	}
}
