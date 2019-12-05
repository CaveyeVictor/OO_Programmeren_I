package domein;

public class Speler {
	private String naam;
	private int vaknr = 0;
	private static final int GROOTSTENR = 63;
	
	public Speler(String naam) {
		setNaam(naam);
	}
		
	public String geefNieuwePositie(int worp) {

		//Tekst kan iedereen typen e
		
		if (getVaknr() + worp > GROOTSTENR) {
			int tussengetal = GROOTSTENR - getVaknr();
			setVaknr(GROOTSTENR - (worp-tussengetal));
		} else {
			if (vaknr == 6) {
				vaknr = 12;
				return "via Brug en je bevindt je op vak " + vaknr;
			} else if (vaknr == 42) {
				vaknr = 37;
				return "via doornstruik en je bevindt je op vak " + vaknr;
			} else if (vaknr == 58) {
				vaknr = 1;
				return "dood en je bevindt je op vak " + vaknr;
			} else {
				vaknr = vaknr+worp;
			}
		}
		return "je bevindt je op vak " + vaknr;
	}
	
	
	public boolean gewonnen() {
		return vaknr == GROOTSTENR;
	}

	public String getNaam() {
		return naam;
	}

	private void setNaam(String naam) {
		this.naam = naam;
	}

	public int getVaknr() {
		return vaknr;
	}

	public final void setVaknr(int vaknr) {
		this.vaknr = vaknr;
	}
	

}
