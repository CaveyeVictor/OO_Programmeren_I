package oefening8.domein.domein;

public class Berekening {
	
	private int x;
	private int y;

	public Berekening(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public Berekening() {
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
