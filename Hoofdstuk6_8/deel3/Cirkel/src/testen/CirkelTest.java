//testen ok
/*package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oefening8.domein.domein.Cirkel;
import oefening8.domein.domein.Punt;

public class CirkelTest
{
    private Cirkel c1, c2, c3;

    @BeforeEach
    public void before()
    {
        c1 = new Cirkel(10, 15, 20);
        c2 = new Cirkel(10, 55, 499);
        c3 = new Cirkel(2, 3, 4);
    }

    @Test
    public void maakCirkel_middelpuntX10Y15_straal20_wordtIngesteld()
    {
        Assertions.assertEquals(20, c1.getStraal());
    }

    @Test 
    public void maakCirkel_middelPuntX4Y5_straal501_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Cirkel(4,5,501);});
    }

    @Test
    public void berekenDiameter_cirkelC1_retourneert40()
    {
    	Assertions.assertEquals(40, c1.berekenDiameter());
    }

    @Test
    public void berekenOmtrek_cirkelC1_retourneert125()
    {
    	Assertions.assertEquals(125.66, c1.berekenOmtrek(), 0.01);
    }

    @Test
    public void berekenOppervlakte_cirkelC1_retourneert1256()
    {
    	Assertions.assertEquals(1256.63, c1.berekenOppervlakte(), 0.01);
    }

    @Test
    public void groei_cirkelC1_steltNieuweStraal25In()
    {
        c1.groei();
        Assertions.assertEquals(25, c1.getStraal());
    }

    @Test
    public void krimp_cirkelC1_steltNieuweStraal15In()
    {
        c1.krimp();
        Assertions.assertEquals(15, c1.getStraal());
    }

    @Test
    public void groei_cirkelC2_straalNietGewijzigd()
    {
        c2.groei();
        Assertions.assertEquals(499, c2.getStraal());
    }
    
    @Test
    public void krimp_cirkelC3_straalNietGewijzigd()
    {
        c3.krimp();
        Assertions.assertEquals(4, c3.getStraal());
    }
}
*/