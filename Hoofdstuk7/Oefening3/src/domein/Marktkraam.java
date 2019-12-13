package oefening8.domein.domein;

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
			throw new IllegalArgumentException("Fout");
		} else {
			inkomsten += bedrag;
		}
	}
	
	public double berekenWinst() {
		double kosten;
		if (lengteInM <= 5) {
			kosten = lengteInM*3;
		} else {
			kosten = lengteInM*2.5;
		}
		
		return inkomsten - kosten;
	}

	public String getNaam() {
		return naam;
	}

	public final void setNaam(String naam) {
		if (naam == null || naam.equals("")) {
			throw new IllegalArgumentException("Fout");
		} else {
			this.naam = naam;
		}
	}

	public int getLengteInM() {
		return lengteInM;
	}

	public final void setLengtelnM(int lengteInM) {
		if (lengteInM >= 2 && lengteInM <= 10) {
			this.lengteInM = lengteInM;
		} else {
			throw new IllegalArgumentException("Fout");
		}
	}
}
