package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domein.domein.domein.Berekening;

public class BerekeningTest
{
    @Test
    public void zoekAlleOplossingen_waarden1en2en3en4en1en3_retourneertGeenOplossingen()
    {
            Assertions.assertEquals("", Berekening.zoekAlleOplossingen(1, 2, 3, 4, 1, 3));
    }

    @Test
    public void zoekAlleOplossingen_waarden1enmin2en3en4en2en2_retourneertAlleOplossingen()
    {
            Assertions.assertEquals(String.format("1*2 + -2*2 + 3*2 = 4%n"), Berekening.zoekAlleOplossingen(1, -2, 3, 4, 2, 2));
    }
}
