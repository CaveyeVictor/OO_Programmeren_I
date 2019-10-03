import java.util.Scanner;

public class Applicatie2 {
    public static void main(String[] args) {
    	int numEven = 0, deelbaar3 = 0;
    	int[] tab = new int[5];
    	
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
			System.out.printf("Geef getal %d: ", i);
			tab[i] = input.nextInt();
	    	if (tab[i] % 2 == 0) {
				numEven++;
			}
	    	if (tab[i] % 3 == 0) {
	    		deelbaar3++;
	    	}
		}
    	System.out.printf("Je gaf %d even %s en %d %s deelbaar door 3 in.",
    			numEven, numEven==1 ? "getal" : "getallen", deelbaar3, deelbaar3==1 ? "getal" : "getallen");
    	input.close();
    }
}