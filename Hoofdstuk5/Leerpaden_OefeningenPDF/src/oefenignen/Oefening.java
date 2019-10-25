package oefenignen;

public class Oefening {

	public static void main(String[] args) {
		



	}
	public void drie() {
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
	}
	
	public void twee() {
		for (int i = 51; i > 0; i--) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void een() {
		int total = 0;
		for (int i = 1; i < 500; i++) {
			if (i % 12 ==0) {
				total += i;
			}
		}
		System.out.println(total);
	}

}
