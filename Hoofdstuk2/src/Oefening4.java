import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Geef een strikt positief geheel getal bestaande uit 5 cijfers, in: ");
		int getal = input.nextInt();
		System.out.printf("%5d%5d%5d%5d%5d", (getal/10000)%10, (getal/1000)%10, (getal/100)%10, (getal/10)%10, getal%10 );
	}

}
