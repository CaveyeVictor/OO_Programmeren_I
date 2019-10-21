import java.util.Scanner;

public class deel1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n;
		
		
	}
	
	public void a20925() {

	}
	
	public void meerkeuze() {
		int age = 15;
		
		switch (age) {
		case 0: 
		case 1: System.out.print("ineligible"); break;
		case 2: System.out.print("toddler"); break;
		case 3: 
		case 4: 
		case 5: System.out.print("early childhood"); break;
		case 6: 
		case 7: System.out.print("young reader"); break;
		case 8: 
		case 9: 
		case 10: System.out.print("elementary"); break;
		case 11: 
		case 12: System.out.print("middle"); break;
		case 13: System.out.print("impossible"); break;
		case 14: 
		case 15: 
		case 16: System.out.print("high school"); break;
		case 17: 
		case 18: System.out.print("scholar"); break;
		default: System.out.print("ineligible"); break;
		//case 19: System.out.print("ineligible"); break;
		}
	}
	
	public void do_while() {
		Scanner inputScanner = new Scanner(System.in);
		int getal;
		
		do {
			System.out.print("geef getal");
			getal = inputScanner.nextInt();
		} while (getal <= 0);
		System.out.printf("abc %d%n", getal);
		
		// ---------------------------------------
		int total;
		int k;
		k = 0;
		total = 0;
		do {
			total += (k*k);
			k++;
		} while (k <= 50);
	}

}
