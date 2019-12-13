package domein.domein.domein;

public class Matrix {
	private int getallen[][];
	
	
	public Matrix(int aantalRijen, int aantalKolommen) {
		if (aantalRijen < 1) {
			aantalRijen = 1;
		}
		if (aantalKolommen < 1) {
			aantalKolommen = 1;
		}
		this.getallen = new int [aantalRijen][aantalKolommen];
	}
	
	public int[][] transponeer() {
		
		int resultaat[][] =
				new int [getallen[0].length]
						[getallen.length];
		
		for (int i = 0; i < resultaat.length; i++) {
			for (int j = 0; j < resultaat[0].length; j++) {
				resultaat[i][j] = getallen[j][i];
			}
		}
		return resultaat;
		
	}

	public int[][] getGetallen() {
		return getallen;
	}

	public void setGetallen(int[][] getallen2) {
		this.getallen = getallen2; 
	}
	
	
}
