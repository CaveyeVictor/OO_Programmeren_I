package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Winkel;

public class WinkelTest 
{
    private Winkel winkel;
    private final double cijfers[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    private final double testGegevens[][] = {{1,2,3,4,5},{1,2,3,4,5},{3,4,5,6,7}};

    @BeforeEach
    public void before()
    {
        winkel = new Winkel();
    }

    @Test
    public void controleerVerkoopcijfer_Product1Dag1_is1()
    {
        double resultaat[][] = new double[3][5];
        winkel.vulVerkoopcijfersOp(resultaat, cijfers);
        Assertions.assertEquals(1.0, resultaat[0][0],0.001);
    }
    
    @Test
    public void controleerVerkoopcijfer_Product2Dag4_is9()
    {
        double resultaat[][] = new double[3][5];
        winkel.vulVerkoopcijfersOp(resultaat, cijfers);
        Assertions.assertEquals(9.0, resultaat[1][3],0.001);
    }
    
    @Test
    public void controleerVerkoopcijfer_Product3Dag5_is15()
    {
        double resultaat[][] = new double[3][5];
        winkel.vulVerkoopcijfersOp(resultaat, cijfers);
        Assertions.assertEquals(15.0, resultaat[2][4],0.001);
    }

    @Test
    public void berekenSomPerDag_dag2_geeft8()
    {
    	Assertions.assertEquals(8.0, winkel.berekenSomPerDag(testGegevens, 1),0.001);
    }
    
    @Test
    public void berekenSomPerDag_dag4_geeft14()
    {
    	Assertions.assertEquals(14.0, winkel.berekenSomPerDag(testGegevens, 3),0.001);
    }

    @Test
    public void berekenSomPerProduct_product1_geeft15()
    {
    	Assertions.assertEquals(15.0, winkel.berekenSomPerProduct(testGegevens[0]),0.001);
    }
    
    @Test
    public void berekenSomPerProduct_product3_geeft25()
    {
    	Assertions.assertEquals(25.0, winkel.berekenSomPerProduct(testGegevens[2]),0.001);
    }
}
