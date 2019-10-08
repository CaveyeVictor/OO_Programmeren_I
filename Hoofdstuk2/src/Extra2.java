import java.util.Scanner;

public class Extra2 {

	public static void main(String[] args) {
		Scanner stnin = new Scanner(System.in);
		System.out.print("Het getal: ");
		int getal = stnin.nextInt();
		if (getal < 0) {
			getal += 10;
			System.out.println("Het getal was positief, dus +10");
			
		} else if (getal > 0) {
			getal -= 10;
			if (getal < 0) {
				getal += 10;
				System.out.println("Getal verminderd met 10, maar was negatief, dus +10");
			} else {
				System.out.println("Getal was positief en werd verminder met 10.");
			}
		} else {
			getal++;
			System.out.println("Het getal was 0, +1");
		}
		System.out.printf("Het heeft nu de waarde %d%n", getal);

	}

}
