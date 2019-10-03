import java.util.Scanner;

public class Lesvoorbeeld {

	public static void main(String[] args) {
		int g1, g2, g3, verm;
		
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("Geef getal 1: ");
		g1 = input.nextInt();
		System.out.print("Geef getal 2: ");
		g2 =  input.nextInt();
		System.out.print("Geef getal 3: ");
		g3 =  input.nextInt();
		
		System.out.printf("De vermenigvuldeging van de getallen %d, %d en %d is : %d%n", g1, g2, g3, g1*g2*g3);
		input.close();

	}

}
