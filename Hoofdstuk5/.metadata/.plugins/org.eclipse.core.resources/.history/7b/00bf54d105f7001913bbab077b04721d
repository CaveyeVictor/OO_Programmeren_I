package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.domein.domein.Berekening;

public class BerekeningTest 
{
    private Berekening berekening1, berekening2, berekening3;

    @BeforeEach
    public void before()
    {
            berekening1 = new Berekening(10,5);
            berekening2 = new Berekening(10,6);
            berekening3 = new Berekening(10,0);

    }
    @Test
    public void geefSom_waarden10en5_retourneert15()
    {
            Assertions.assertEquals("De som van 10 en 5 is 15", berekening1.geefSom());
    }

    @Test
    public void geefVerschil_waarden10en5_retourneert5()
    {
            Assertions.assertEquals("Het verschil tussen 10 en 5 is 5", berekening1.geefVerschil());
    }

    @Test
    public void geefVermenigvuldiging_waarden10en5_retourneert50()
    {
            Assertions.assertEquals("Het product van 10 en 5 is 50", berekening1.geefProduct());
    }

    @Test
    public void geefDeling_waarden10en5_opgaandeDeling()
    {
            Assertions.assertEquals("Het quotiënt van 10 en 5 is 2", berekening1.geefQuotient());
    }

    @Test
    public void geefDeling_waarden10en6_afgekapteDeling()
    {
            Assertions.assertEquals("Het quotiënt van 10 en 6 is 1", berekening2.geefQuotient());
    }

    @Test
    public void geefDeling_waarden10en0_delingDoorNul()
    {
            Assertions.assertEquals("Fout: deling door nul", berekening3.geefQuotient());
    }
	
}
