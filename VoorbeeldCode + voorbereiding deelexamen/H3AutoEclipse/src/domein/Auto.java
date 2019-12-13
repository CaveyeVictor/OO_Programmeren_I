package oefening8.domein.domein;

public class Auto {

    private String kleur;
    private String merk;
    private String type;
    private String nrplaat;
    private String chassisnummer;
   
    public Auto() {
    }

    public Auto(String kleur) {
        setKleur(kleur);
    }

    public Auto(String kleur, String merk) {
        setKleur(kleur);
        setMerk(merk);
    }

    public final void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public String getKleur() {
        return kleur;
    }

    public String getMerk() {
        return merk;
    }

    public final void setNrplaat(String nrplaat) {
        this.nrplaat = nrplaat;
    }

    public String getNrplaat() {
        return nrplaat;
    }

    public String getChassisnummer() {
        return chassisnummer;
    }

    public final void setChassisnummer(String chassisnummer) {
      //  this.chassisnummer = chassisnummer;
    }

    public String getType() {
        return type;
    }

    public final void setType(String type) {
        this.type = type;
    }

    private void setMerk(String merk) {
        this.merk = merk;
    }
   
}
