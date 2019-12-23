package domein;

public class Plant {
    private String plantennaam;
    private boolean buitenplant;
    private double[] waterPerWeekPerSeizoen;

    public Plant(String plantennaam, boolean buitenplant, double[] waterPerWeekPerSeizoen){
        setPlantennaam(plantennaam);
        setBuitenplant(buitenplant);
        setWaterPerWeekPerSeizoen(waterPerWeekPerSeizoen);
    }
    
    public Plant(String plantennaam){
        //zo een nieuwe array meegeven in methode/constructor!!!
    	this(plantennaam, false, new double[] {0.0, 0.0, 0.0, 0.0});
    }

	@Override
    public String toString(){
        double som = 0;
        for (double water: waterPerWeekPerSeizoen){
            som += water;
        }
        return String.format("%s met naam %s en met %.1f gemiddeld waterverbruik per week.",
                buitenplant ? "Buitenplant" : "Kamperplant", plantennaam, som/waterPerWeekPerSeizoen.length);
    }

    public String getPlantennaam() {
        return plantennaam;
    }

    private void setPlantennaam(String plantennaam) {
        if (plantennaam == null || plantennaam.equals("")){
        	throw new IllegalArgumentException("Plantennaam mag niet leeg zijn");
        } else {
            this.plantennaam = plantennaam;
        }

    }

    public boolean isBuitenplant() {
        return buitenplant;
    }

    private void setBuitenplant(boolean buitenplant) {
        //kan niet doorgeven als het geen true of false is.
        this.buitenplant = buitenplant;
    }

    public double[] getWaterPerWeekPerSeizoen() {
        return waterPerWeekPerSeizoen;
    }

    public final void setWaterPerWeekPerSeizoen(double[] waterPerWeekPerSeizoen) {
        for (double water: waterPerWeekPerSeizoen){
            if (water < 0 || water >= 300){
                throw new IllegalArgumentException("De hoeveelheid water per week moet aanvaardbaar zijn in elk seizoen en liggen in [0,300[");
            }
        }
        this.waterPerWeekPerSeizoen = waterPerWeekPerSeizoen;
    }
}
