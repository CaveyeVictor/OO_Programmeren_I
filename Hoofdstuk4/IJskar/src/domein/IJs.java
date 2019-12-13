package oefening8.domein.domein;

public class IJs {
	private int aantalBollen;
	private int keuzeExtra;
	
	public IJs(int aantalBollen, int keuzeExtra) {
		setAantalBollen(aantalBollen);
		setKeuzeExtra(keuzeExtra);
	}
	
	public double berekenPrijs() {
		double tussenPrijs = 0;
		if (getAantalBollen() > 1 && getAantalBollen() < 4) {
			tussenPrijs = (getAantalBollen()*0.80)-((getAantalBollen()*0.80)/100*10);
		} else if (getAantalBollen() >= 4){
			tussenPrijs = (getAantalBollen()*0.80)-((getAantalBollen()*0.80)/100*20);
		} else {
			tussenPrijs = getAantalBollen()*0.80;
		}
		if (keuzeExtra == 1 || keuzeExtra == 2) {
			return tussenPrijs+= 0.30;
		} else if (keuzeExtra == 3) {
			return tussenPrijs+= 0.50;
		} else {
			return tussenPrijs;
		}
	}

	public int getAantalBollen() {
		return aantalBollen;
	}

	public final void setAantalBollen(int aantalBollen) {
		if (aantalBollen < 1 || aantalBollen > 5) {
			aantalBollen = 1;
		}
		this.aantalBollen = aantalBollen;
	}

	public int getKeuzeExtra() {
		return keuzeExtra;
	}

	public final void setKeuzeExtra(int keuzeExtra) {
		if (keuzeExtra < 0 || keuzeExtra > 3) {
			keuzeExtra = 0;
		}
		this.keuzeExtra = keuzeExtra;
	}
	
	

}
