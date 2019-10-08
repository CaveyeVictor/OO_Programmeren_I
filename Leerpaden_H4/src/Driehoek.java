
public class Driehoek {

	private int a, b, c;
	
	public Driehoek(int a, int b, int c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	public boolean isRechthoekigeDriehoek() {
		return getA()==getB() && getB()==getC();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}
