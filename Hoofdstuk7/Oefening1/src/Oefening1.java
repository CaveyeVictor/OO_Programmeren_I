import java.util.Scanner;

public class Oefening1 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int[] lijst1 = new int[20];
		int[] lijst2 = new int[10];
		int i = 0;
		
		for (int j = 0; j < lijst2.length-1; j++) {
			lijst2[j] = 0;
		}
		
		do {
			System.out.printf("Heef %de getal uit het interval [1-10]: ", i+1);
			int getal = inputScanner.nextInt();
			
			if (getal >= 1 && getal <= 10) {
				lijst1[i] = getal;
				lijst2[getal-1]++;
				i++;
			}
			} while (i < 20);
		
		
		for (int j = 0; j < lijst1.length-1; j++) {
			System.out.print(lijst1[j] + " ");
		}
		
		System.out.println();
		System.out.printf("%10S %15S%n", "getal", "aantal keer");
		
		for (int j = 0; j < lijst2.length; j++) {
			System.out.printf("%10d %15d%n", j+1, lijst2[j]);
		}
	}

}
