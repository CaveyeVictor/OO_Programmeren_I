import java.util.Scanner;
public class Applicatie1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    	System.out.printf("Geef getal 1: ");
    	int getal1 = input.nextInt();
    	System.out.printf("Geef getal 2: ");
    	int getal2 = input.nextInt();
    	System.out.printf("Geef getal 3: ");
    	int getal3 = input.nextInt();
    	System.out.printf("Geef getal 4: ");
    	int getal4 = input.nextInt();
    	System.out.printf("Geef getal 5: ");
    	int getal5 = input.nextInt();
    	System.out.printf("De som van de getallen = %d%n",
    			getal1+getal2+getal3+getal4+getal5);
    }
}
