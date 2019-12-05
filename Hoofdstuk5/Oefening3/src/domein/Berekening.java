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
		return String.format("De som van %d en %d is %d", x, y, x+y);
	}
	
	public String geefVerschil() {
		return String.format("Het verschil van %d en %d is %d", x, y, x-y);
	}
	
	public String geefProduct() {
		return String.format("Het product van %d en %d is %d", x, y, x*y);
	}
	
	public String geefQuotient() {
		if (y == 0) {
			return String.format("Fout: deling door nul");
		} else {
			return String.format("Het quotiënt van %d en %d is %d", x, y, x/y);
		}
	}
	
	public static String zoekAlleOplossingen(int a, int b, int c, int d, int begingrens, int eindgrens) {
		String resultaatString = "";
		for (int i = begingrens; i <= eindgrens; i++) {
			for (int j = begingrens; j <= eindgrens; j++) {
				for (int k = begingrens; k <= eindgrens; k++) {
					if ((a*i)+(b*j)+(c*k) == d) {
						resultaatString += String.format("%d*%d + %d*%d + %d%d = %d%n",a,i,b,j,c,k,d);
					}
				}
				
			}
		}
		return resultaatString;
	}
	
	public String zoekRijenMetAlsSomX() {
		String resultatString = "";
		for (int i = 1; i < x/2+1; i++) {
			String tussenstukString = String.format("%d", i);
			int som = i;
			for (int j = i+1; j < x; j++) {
				som += j;
				if (som <= x) {
					tussenstukString += String.format(" + %d", j);
				} else if (som == x) {
					//todo controleren?
					resultatString += tussenstukString + String.format(" = %d%n", x);
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
