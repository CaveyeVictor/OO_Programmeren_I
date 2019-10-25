package oefenignen;

public class Applicatie3 {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			for (int k = 11; k > i+1; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	/*
	public void drie() {
		for (int i = 0 ; i < 11; i++) {
			for (int j = 11; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void twee(){
			for (int i = 1; i < 11; i++) {
			for (int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 11; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void een() {
		for (int i = 1 ; i < 11; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	*/

}
