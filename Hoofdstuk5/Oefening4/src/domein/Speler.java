package domein;

public class Speler {
	private String naam;
	private int vaknr = 0;
	private static final int GROOTSTENR = 63;
	
	public Speler(String naam) {
		setNaam(naam);
	}
		
	public String geefNieuwePositie(int worp) {
		
		if (getVaknr() + worp > GROOTSTENR) {
			int tussengetal = GROOTSTENR - getVaknr();
			setVaknr(GROOTSTENR - (worp-tussengetal));
		} else {
			if (getVaknr() == 6) {
				setVaknr(12);
				return "via Brug en je bevindt je op vak " + getVaknr();
			} else if (getVaknr() == 42) {
				setVaknr(37);
				return "via doornstruik en je bevindt je op vak " + getVaknr();
			} else if (getVaknr() == 58) {
				setVaknr(1);
				return "dood en je bevindt je op vak " + getVaknr();
			} else {
				setVaknr(getVaknr()+worp);
			}
		}
		return "je bevindt je op vak " + getVaknr();
	}
	
	
	public boolean gewonnen() {
		return getVaknr() == GROOTSTENR;
	}

	public String getNaam() {
		return naam;
	}

	private final void setNaam(String naam) {
		this.naam = naam;
	}

	public int getVaknr() {
		return vaknr;
	}

	public final void setVaknr(int vaknr) {
		this.vaknr = vaknr;
	}
	

}
