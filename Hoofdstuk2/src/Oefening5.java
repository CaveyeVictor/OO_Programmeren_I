import java.util.Scanner;

public class Oefening5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef een geheel getal in: ");
		int getal = input.nextInt();
		System.out.printf("\t%15S\t%15S\t%15S\t%15S%n"
				+ "\t%15d\t%15d\t%15d\t%15d",
				"getal", "getal*10", "getal*100", "getal*1000",
				getal, getal*10, getal*100, getal*1000);	
	}
	//System.out.printf("%4d");
	//System.out.printf("%-4d");
	//om kolommen te maken
	//todo: dia's 7,8, 12, 23, 24 H2
}
