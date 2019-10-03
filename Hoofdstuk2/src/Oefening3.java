import java.util.Scanner;
public class Oefening3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Geef een strikt positief geheel getal in: %n");
		int getal = input.nextInt();
		//int geconverteerd naar octaal - o
		System.out.printf("octale notatie = %s%n", Integer.toOctalString(getal));
		System.out.printf("octale notatie = %o%n", getal);
		//int converteren naar hexadecimaal
		System.out.printf("hexidecimale notatie (klein) = %s%n", Integer.toHexString(getal));
		System.out.printf("hexidecimale notatie (klein) = %x%n", getal);
		System.out.printf("hexidecimale notatie (groot) = %s%n", Integer.toHexString(getal).toUpperCase());
		System.out.printf("hexidecimale notatie (groot) = %X%n", getal);
	}

}
