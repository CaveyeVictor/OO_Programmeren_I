import java.security.SecureRandom;
import java.util.Random;

public class Oefening2 {

	public static void main(String[] args) {
		Random rGRandom = new Random();
		SecureRandom aRandom = new SecureRandom();
		
		int[] a = {4,7,15,3,9,22,36,24,28,14,19,27,30,31,2};
		
		int beginIndex = 0, len = 1, beginMax = 0, lenMax = 0;
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i-1]) {
				if (len == 1) {
					beginIndex = i;
				}
				len++;
			} else {
				len = 1;
			}
			if (len > lenMax) {
				lenMax = len;
				beginMax = beginIndex;
			}
		}
		
		String getallen_string = "";
		for (int i = beginMax-1; i < beginMax+lenMax-1; i++) {
			getallen_string = getallen_string + a[i] + " ";
		}
		
		System.out.printf("Opvolgingen %d bestaat uit %s", lenMax, getallen_string);

		
		

	}

}
