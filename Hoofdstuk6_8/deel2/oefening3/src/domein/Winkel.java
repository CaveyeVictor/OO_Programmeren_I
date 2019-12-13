package oefening8.domein.domein;

public class Winkel {
    public double[][] vulVerkoopcijfersOp(double[][] dest, double[] source){
        //hoe kan dit void zijn als je een erna een de dest moet gebruiken?
        int rij = 0, col = 0;
        for (double s: source){
            if (col >= dest[0].length) {
                rij++;
                col = 0;
            }
            dest[rij][col] = s;
            col++;
        }
        return dest;
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
