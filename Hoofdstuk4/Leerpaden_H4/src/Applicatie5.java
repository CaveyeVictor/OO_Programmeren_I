
public class Applicatie5 {

	public static void main(String[] args) {
		int i = 0;
		while (i < 6) {
			if (i == 0) {
				System.out.printf("%-8S%-8S%-8S%-8S%n", "n", "10*N", "100*N", "1000*N");
			} else {
				System.out.printf("%-8d%-8d%-8d%-8d%n", i, i*10, i*100, i*1000);
			}
			i++;
		}

	}

}
