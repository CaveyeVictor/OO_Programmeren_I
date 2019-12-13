package oefening8.domein.domein;

public class Cirkel extends Punt{
    private int straal;

    public Cirkel(int x, int y, int straal){
        super(x, y);
        setStraal(straal);
    }

    public String getMiddelpunt(){
        return super.toString();
    }

    public int berekenDiameter(){
        return 2*straal;
    }

    public double berekenOmtrek(){
        return 2*straal*Math.PI;
    }

    public double berekenOppervlakte(){
        return Math.pow(straal, 2)*Math.PI;
    }

    public void groei(){
        if (straal + 5 <= 500){
            straal += 5;
        } 
    }

    public void krimp(){
        if (straal - 5 >= 1){
            straal = straal - 5;
        } 
    }

    @Override
    public String toString(){
        return "";
    }

    public int getStraal() {
        return straal;
    }

    private void setStraal(int straal) {
        if (straal >= 1 && straal <= 500){
            this.straal = straal;
        } else {
            throw new IllegalArgumentException("Foute waarde voor de straal");
        }
    }
}