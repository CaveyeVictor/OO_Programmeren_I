package domein;

public class Matrix {
	private int getallen[][];
	
	
	public Matrix(int aantalRijen, int aantalKolommen) {
		setGetallen(aantalRijen, aantalKolommen);
	}
	
	public int[][] transponeer() {
		
		int resultaat[][] =
				new int [getGetallen()[0].length]
						[getGetallen().length];
		
		for (int i = 0; i < resultaat.length; i++) {
			for (int j = 0; j < resultaat[0].length; j++) {
				resultaat[i][j] = getGetallen()[j][i];
			}
		}
		return resultaat;
		
	}

	public int[][] getGetallen() {
		return getallen;
	}

	public void setGetallen(int aantalRijen, int aantalKolommen) {
		if (aantalRijen < 1) {
			aantalRijen = 1;
		}
		if (aantalKolommen < 1) {
			aantalKolommen = 1;
		}
		this.getallen = new int [aantalRijen][aantalKolommen];
	}

	public void setGetallen(int[][] getallen2) {
		this.getallen = getallen2; 
	}
	
	
}
