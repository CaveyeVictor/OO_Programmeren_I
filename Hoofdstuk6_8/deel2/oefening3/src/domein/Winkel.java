package domein;

public class Winkel {
    public void vulVerkoopcijfersOp(double[][] dest, double[] source){
        int rij = 0, col = 0;
        for (double s: source){
            if (col >= dest[0].length) {
                rij++;
                col = 0;
            }
            dest[rij][col] = s;
            col++;
        }
    }

    public double berekenSomPerDag(double[][] verkoopcijfers, int dag){
        double som = 0;
        for (double[] week: verkoopcijfers){
            som += week[dag];
        }
        return som;
    }

    public double berekenSomPerProduct(double[] VerkoopCijfersVanProduct1){
        double som = 0;
        for (double dag: VerkoopCijfersVanProduct1){
        	som+= dag;
        }
        return som;
    }
}
