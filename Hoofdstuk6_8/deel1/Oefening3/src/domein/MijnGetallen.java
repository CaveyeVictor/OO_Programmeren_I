package oefening8.domein.domein;

public class MijnGetallen {
	private int getal1;
	private int getal2;
	
	public MijnGetallen(int getal1, int getal2) {
		setGetal1(getal1);
		setGetal2(getal2);
	}

	public boolean isPriemtweeling() {
	// eerst wisselOm aanroepen indien nodig en dan maar 1 vwde meer testen:
		if (getal1 + 2 == getal2 || getal1 == getal2 + 2) {
			return zijnPriem();
		} else {
			return false;
		}
	}
	
	public boolean zijnPriem() {
		return isPriem(getal1)  && isPriem(getal2);
	}

	private boolean isPriem(int getal) {
		if (getal < 2) {
			return false;
		}
		int deler = 2;
		while (deler <= getal/2) // tem de helft
		{
			if (getal%deler == 0) // getal kan niet 1 zijn door de eerste if
			{
				return false;
			}
			deler++;
		}
		return true;
	}


	public void wisselOm() {
		int tempX = getal1;
		getal1= getal2;
		getal2 = tempX;
	}
	
	private void controleerGetal(int getal) {
		if (getal < 1) {
			throw new IllegalArgumentException("Fout getal");
		}
	}

	public int getGetal1() {
		return getal1;
	}

	private void setGetal1(int getal1) {
		controleerGetal(getal1);
		this.getal1 = getal1;
	}

	public int getGetal2() {
		return getal2;
	}

	private void setGetal2(int getal2) {
		controleerGetal(getal2);
		this.getal2 = getal2;
	}
	
	
}
