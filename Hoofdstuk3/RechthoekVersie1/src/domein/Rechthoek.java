package domein.domein.domein;

public class Rechthoek {
	private double lengte;
	private double breedte;
	
	public Rechthoek(double lengthe, double breedte) {
		setLengte(lengthe);
		setBreedte(breedte);
	}
	
	public double berekenOmtrek(){
		return 2*(lengte+breedte);
	}
	
	public double berekenOppervlakte() {
		return lengte*breedte;
	}
	
	private void setLengte(double lengte) {
		this.lengte = lengte;
	}
	
	private void setBreedte(double breedte) {
		this.breedte = breedte;
	}
	
	public double getBreedte() {
		return breedte;
	}
	
	public double getLengte() {
		return lengte;
	}

}
