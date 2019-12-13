package domein;

import domein.Punt;

public class Cirkel{
    private Punt middelpunt;
    private int straal;

    public Cirkel(int x, int y, int straal){
        setMiddelPunt(new Punt(x, y));
        setStraal(straal);

    }

    private void setMiddelPunt(Punt punt) {
        this.middelpunt = punt;
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
        return String.format("De cirkel heeft:%n" +
                        "zijn middelpunt op: %s%n" +
                        "straal van: %d%n" +
                        "diameter van: %d%n" +
                        "een omtrek van: %.2f%n" +
                        "een oppervlakte van: %.2f%n",
                getMiddelpunt(), getStraal(),
                berekenDiameter(), berekenOmtrek(),
                berekenOppervlakte());
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