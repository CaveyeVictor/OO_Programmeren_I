package domein;

public class Winkel {
    public void vulVerkoopcijfersOp(double[][] dest, double[] source){
        int i = 0;
        for (double s: source){
            dest[i/dest[0].length][i%dest[0].length] = s;
        }
    }

    public void berekenSomPerDag(double[][] verkoopcijfers, double[] dag){

    }

    public void berekenSomPerProduct(double[][] verkoopcijfers, double[] dag){

    }
}
