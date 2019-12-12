//test oke
/*package testen;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Jackpot;

public class JackpotTest
{
    private Jackpot jp;

    @BeforeEach
    public void before()
    {
        jp = new Jackpot();
    }

    @Test()
    public void maakJackpot_kredietMaxwaardeSpelbedragIngesteld()
    {
        Assertions.assertEquals(20, jp.getKrediet());
        Assertions.assertEquals(15, Jackpot.getMaxwaarde());
        Assertions.assertEquals(2, Jackpot.getSpelbedrag());	
    }

    @Test
    public void speel_geeftNieuwKredietGelijkAanOudKredietMinSpelbedragPlusGewonnen()
    {
        int krediet = jp.getKrediet();
        int spelbedrag = Jackpot.getSpelbedrag();
        jp.speel();
        int gewonnen = jp.geefGewonnenBedrag();
        Assertions.assertEquals(krediet - spelbedrag + gewonnen, jp.getKrediet());
    }

    @Test
    public void geefGewonnenBedrag_100KeerSpelen_geeftJuisteSomVanGewonnenBedragen()
    {
        int bedrag = 0, juistBedrag = 0;
        for (int teller = 0; teller < 100; teller++)
        {
            int aantalNullen = 0;
            jp.speel();
            int[] res = jp.getRes();
            int spelbedrag = Jackpot.getSpelbedrag();
            for (int r: res)
                if (r == 0)
                    aantalNullen++;
            switch (aantalNullen)
            {
                case 3:
                    bedrag += 4*spelbedrag;
                    break;
                case 2:
                    bedrag += 2*spelbedrag;
                    break;
                case 1:
                    bedrag += spelbedrag;
                    break;
                default:
                    int gelijk = res[0];
                    int i = 1;
                    while (i < res.length && res[i] == gelijk)
                        i++;
                    if (i == res.length)
                        bedrag += 2*spelbedrag;
                    break;    
            }
            juistBedrag += jp.geefGewonnenBedrag();
        }
        Assertions.assertEquals(bedrag, juistBedrag);
    }
}
*/