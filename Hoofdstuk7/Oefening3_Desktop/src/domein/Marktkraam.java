package domein.domein.domein;

public class Marktkraam {
	private String naam;
	private int lengteInM;
	public double inkomsten;
	
	public Marktkraam(String naam, int lengteInM) {
		setNaam(naam);
		setLengtelnM(lengteInM);
	}
	
	public void voegToeAanInkomsten (double bedrag) {
		if (bedrag <= 0) {
			System.out.println("Fout");
		} else {
			inkomsten += bedrag;
		}
	}
	
	public double berekenWinst() {
		double kosten;
		if (getLengteInM() <= 5) {
			kosten = getLengteInM()*3;
		} else {
			kosten = getLengteInM()*2.5;
		}
		
		return inkomsten - kosten;
	}

	public String getNaam() {
		return naam;
	}

	private void setNaam(String naam) {
		if (naam.equals("") || naam == null) {
			throw new IllegalArgumentException("Fout");
		} else {
			this.naam = naam;
		}
	}

	public int getLengteInM() {
		return lengteInM;
	}

	private void setLengtelnM(int lengteInM) {
		if (lengteInM >= 2 && lengteInM <= 10) {
			this.lengteInM = lengteInM;
		} else {
			throw new IllegalArgumentException("Fout");
		}
	}
}
