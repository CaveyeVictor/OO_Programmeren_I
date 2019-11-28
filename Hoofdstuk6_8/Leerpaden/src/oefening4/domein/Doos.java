package oefening4.domein;

public class Doos {

    private double lengte, breedte, hoogte;
    private String kleur, code;
    private static int aantalDozen=0;

    public Doos(){
        setHoogte(1);
        setBreedte(1);
        setLengte(1);
        setKleur("rood");
        aantalDozen++;
    }
    public Doos(double lengte, double breedte, double hoogte, String kleur){
        setLengte(lengte);
        setBreedte(breedte);
        setHoogte(hoogte);
        setKleur(kleur);
        //setCode();
    }

    @Override
    public String toString() {
        return getCode();
    }

    private void controleerAfmeting(/*String afmeting,*/ double minWaarde /*, double waarde*/){
        if (minWaarde < 1){
            throw new IllegalArgumentException("Slechte waarde");
        }
    }

    private void genereerCode(){
        System.out.printf("%s", getCode());
    }

    public double getLengte() {
        return lengte;
    }

    public final void setLengte(double lengte) {
        controleerAfmeting(lengte);
        this.lengte = lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    private void setBreedte(double breedte) {
        controleerAfmeting(breedte);
        this.breedte = breedte;
    }

    public double getHoogte() {
        return hoogte;
    }

    private void setHoogte(double hoogte) {
        controleerAfmeting(hoogte);
        this.hoogte = hoogte;
    }

    public String getKleur() {
        return kleur;
    }

    private void setKleur(String kleur) {
        if (kleur == null || kleur.equals("")){
            throw new IllegalArgumentException("Kleur is leeg");
        }
        this.kleur = kleur;
    }

    public String getCode() {
        return code;
    }

    private void setCode(String code) {
        aantalDozen++;
        this.code = String.format("015%s", code);
    }
}
