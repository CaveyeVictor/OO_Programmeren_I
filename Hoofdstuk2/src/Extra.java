import java.util.Scanner;
import java.lang.Math;

public class Extra {

	public static void main(String[] args) {
		Scanner stnin = new Scanner(System.in);
		System.out.print("straal? ");
		int straal = stnin.nextInt();
		System.out.printf("%20S%20S%20S%20S%n%"
				+ "20d%20d%20d%20d",
				"straal", "diameter", "omtrek", "omtrek",
				straal, straal*2, Math.round(straal*2*Math.PI), Math.round(straal*straal*Math.PI));
	}

}
