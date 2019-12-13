package oefening8.domein.domein;

import java.time.LocalDateTime;

public class Lid {
	private String naam;
	private String voornaam;
	private int beginJaartal;
	private final int HUIDGJAAR = LocalDateTime.now().getYear();
	
	public Lid(String voornaam, String naam){
		setVoornaam(voornaam);
		setNaam(naam);
		setBeginJaartal(HUIDGJAAR);
	}
	public Lid(String voornaam, String naam, int beginJaartal){
		setVoornaam(voornaam);
		setNaam(naam);
		setBeginJaartal(beginJaartal);
	}
	
	public double berekenLidgeld() {
		double VOLLEDIGEPRIJS = 120;
		if (HUIDGJAAR-getBeginJaartal() < 5) {
			return VOLLEDIGEPRIJS;
		} else if (HUIDGJAAR-getBeginJaartal() < 10) {
			return VOLLEDIGEPRIJS-(VOLLEDIGEPRIJS/100*10);
		} else if (HUIDGJAAR-getBeginJaartal() < 15) {
			return VOLLEDIGEPRIJS-(VOLLEDIGEPRIJS/100*15);
		} else {
			return VOLLEDIGEPRIJS-(VOLLEDIGEPRIJS/100*30);
		}
	}
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public int getBeginJaartal() {
		return beginJaartal;
	}
	public void setBeginJaartal(int beginJaartal) {
		if (beginJaartal < 1950) {
			beginJaartal = HUIDGJAAR;
		}
		this.beginJaartal = beginJaartal;
	}
	public int getHUIDGJAAR() {
		return HUIDGJAAR;
	}
	
}
