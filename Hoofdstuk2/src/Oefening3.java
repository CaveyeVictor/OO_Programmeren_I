import java.util.Scanner;
public class Oefening3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Geef een strikt positief geheel getal in: ");
		int getal = input.nextInt();
		System.out.printf("octale notatie = %s%n", Integer.toOctalString(getal));
		System.out.printf("hexidecimale notatie (klein) = %s%n", Integer.toHexString(getal));
		System.out.printf("hexidecimale notatie (groot) = %s%n", Integer.toHexString(getal).toUpperCase());
	}

}
