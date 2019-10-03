import java.math.BigInteger;
import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef de teller in van de breuk: ");
		int teller = input.nextInt();
		System.out.println("Geef de noemer in van de breuk: ");
		int noemer = input.nextInt();
		int uitkomst = teller/noemer, rest = teller%noemer;
		System.out.printf("%d/%d = %d%n", teller, noemer, uitkomst);
		System.out.printf("rest = %d%n", rest);
		BigInteger b1 = BigInteger.valueOf(teller);
	    BigInteger b2 = BigInteger.valueOf(noemer);
	    BigInteger gcd = b1.gcd(b2);
	    int ggd = gcd.intValue();
		
		//if (rest == 0) {
			System.out.printf("vereenvoudigde breuk = %d / %d", (teller/ggd), (noemer/ggd));
		//}
	}

}
