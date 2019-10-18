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
			return isPriem(getGetal1())&&isPriem(getGetal2());
		} else {
			return false;
		}
		
	}
	
	private boolean isPriem(int getal) {
		if (getal < 2) {
			return false;
		}
		int deler = 2;
		while (deler < getal) {
			if (getal%deler == 0 && getal != 1) {
				return false;
			}
			deler++;
		}
		return true;
	}

	public int getGetal1() {
		return getal1;
	}

	public void setGetal1(int getal1) {
		if (getal1 < 1) {
			getal1 = 1;
		}
		this.getal1 = getal1;
	}

	public int getGetal2() {
		if (getal2 < 1) {
			getal2 = 1;
		}
		return getal2;
	}

	public void setGetal2(int getal2) {
		this.getal2 = getal2;
	}
	
	
}
