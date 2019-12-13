package domein.domein.domein;

public class Account {

    private double balans;
    private String naam;

    public Account(String naam, double balans) {
        setNaam(naam);
        setBalans(balans);
    }

    private void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    /**
     * Geeft nieuwe waarde aan balans op voorwaarde dat de meegegeven balans 
     * groter is dan 0.0
     * @param balans 
     */
    private void setBalans(double balans) {
        if (balans > 0.0) {
            this.balans = balans;
        }
    }

    public double getBalans() { 		       					  	 
        return balans;
    }

    /**
     * Vermeerdert de balans met het meegegeven bedrag. Dit gebeurt enkel als
     * het bedrag strikt positief is.
     *
     * @param bedrag het bedrag waarmee balans verhoogd moet worden
     */
    public void stort(double bedrag) {
        if (bedrag > 0.0) {
            balans = balans + bedrag;
        }
    }
} // einde klasse
