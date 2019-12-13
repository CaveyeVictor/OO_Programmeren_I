package domein;

public class MijnGetallen {
	private int getal1;
	private int getal2;
	
	public MijnGetallen(int getal1, int getal2) {
		setGetal1(getal1);
		setGetal2(getal2);
	}
	
	public boolean isPriemtweeling() {
		if (getGetal1() + 2 == getGetal2() || getGetal1() == getGetal2() + 2) {
			return zijnPriem();
		} else {
			return false;
		}
	}
	
	public boolean zijnPriem() {
		return isPriem(getGetal1())  && isPriem(getGetal2());
	}
	
	private boolean isPriem(int getal) {
		if (getal < 2) {
			return false;
		}
		int deler = 2;
		while (deler < getal/2) {
			if (getal%deler == 0 && getal != 1) {
				return false;
			}
			deler++;
		}
		return true;
	}
	
	public void wisselOm() {
		int tempX = getGetal1();
		setGetal1(getGetal2());
		setGetal2(tempX);
	}
	
	private void controleerGetal(int getal) {
		if (getal < 1) {
			throw new IllegalArgumentException();
		}
	}

	public int getGetal1() {
		return getal1;
	}

	public void setGetal1(int getal1) {
		controleerGetal(getal1);
		this.getal1 = getal1;
	}

	public int getGetal2() {
		return getal2;
	}

	public void setGetal2(int getal2) {
		controleerGetal(getal2);
		this.getal2 = getal2;
	}
	
	
}
