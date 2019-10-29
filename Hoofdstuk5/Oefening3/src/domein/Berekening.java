package domein;

public class Berekening {
	
	private int x;
	private int y;

	public Berekening(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public Berekening(int x) {
		if (x <= 50 && x >= 1) {
			setX(x);
		}
		
	}
	
	public String geefSom() {
		return "De som van " + getX() + " en " + getY() + " is " + (getX()+getY());
	}
	
	public String geefVerschil() {
		return "Het verschil tussen " + getX() + " en " + getY() + " is " + (getX()-getY());
	}
	
	public String geefProduct() {
		return "Het product van " + getX() + " en " + getY() + " is " + (getX()*getY());
	}
	
	public String geefQuotient() {
		if (getY() == 0) {
			return "Fout: deling door nul";
		} else {
			return "Het quotiënt van " + getX() + " en " + getY() + " is " + (getX()/getY());
		}
	}
	
	public static String zoekAlleOplossingen(int a, int b, int c, int d, int begingrens, int eindgrens) {
		String resultaatString = "";
		for (int i = begingrens; i <= eindgrens; i++) {
			for (int j = begingrens; j <= eindgrens; j++) {
				for (int k = begingrens; k <= eindgrens; k++) {
					if ((a*i)+(b*j)+(c*k) == d) {
						resultaatString += (a+"*"+i + " + " + b+"*"+j + " + " + c+"*"+k + " = " + d + "\n");
					}
				}
				
			}
		}
		return resultaatString;
	}
	
	public String zoekRijenMetAlsSomX() {
		String resultatString = "";
		for (int i = 1; i < getX()/2+1; i++) {
			String tussenstukString = String.format("%d", i);
			int som = i;
			for (int j = i+1; j < getX(); j++) {
				som += j;
				if (som <= getX()) {
					tussenstukString += String.format(" + %d", j);
				}
				if (som == getX()) {
					resultatString += tussenstukString + String.format(" = %d%n", getX());
					break;
				}
			}
			
		}
		return resultatString;
		
	}
	
	
	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

}