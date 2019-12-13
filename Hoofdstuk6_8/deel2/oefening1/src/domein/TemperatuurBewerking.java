package domein;

public class TemperatuurBewerking {

    public static double berekenGemiddeldeTemperatuur(double[] temperatuur){
        double som = 0;
        for (double temp: temperatuur){
            som += temp;
        }
        return som/temperatuur.length;
    }
}
