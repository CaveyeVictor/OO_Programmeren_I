package oefenignen;

public class Uitvoer_en_korte_oef {

	public static void main(String[] args) {
		

		
	}
	
	public void fout4() {
		int teller = 2;
		do{
			System.out.println(teller);
			teller += 2;
		} while(teller < 100);
	}
	
	public void fout3() {
		for(double k=0.1;k != 1.0;k+=0.10){
			System.out.println(k);
			}
	}
	
	public void fout2() {
		for(int x = 19; x >= 1; x -= 2 ) {
			System.out.printf("%d", x );
		}
	}
	
	public void fout1() {
		int value = 4;
		switch ( value % 2 ){
			case 0:System.out.println( "Even getal" ); break;
			case 1:System.out.println( "Oneven getal" ); break;
		}
	}
	
	public void true_false() {
		int i = 1, j = 2, k = 3, m = 2;
		System.out.println(i == 1); //T
		System.out.println(j == 3); //F
		System.out.println(i >= 1 && j < 4); //T
		System.out.println( m <= 99 & k < m ); //F
		System.out.println( j >= i || k == m ); //T
		System.out.println( (k + m < j) || (3 - j >= k)); //F
		System.out.println( !( k > m ) ); //F
	}
	
	public void swItch() {
		int i=4,k;
		if (i == 1) {
			k = 3;
		} else if (i == 2) {
			k = 6;
		} else if (i == 3 || i == 4) {
			k = 10;
		} else {
			k = 20;
		}
	
		switch (i) {
		case 1:
			k =3;
			break;
		case 2:
			k =6;
			break;
		case 3:
		case 4:
			k =10;
			break;
	
		default:
			k = 20;
			break;
		}
	}
	
	public void een() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print('@');
			}
			System.out.println();
		}
	}
	
	public void twee() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 3; j++) {
				for (int k = 0; k <= 4 ; k++) {
					System.out.print('*');
				}
				System.out.println();
			}
			System.out.println();
			
		}
	}

}
