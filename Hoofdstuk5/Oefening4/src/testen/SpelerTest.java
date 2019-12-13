package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.domein.domein.Speler;

public class SpelerTest
{
	private Speler speler1, speler2, speler3;

	@BeforeEach
	public void before()
	{
            speler1 = new Speler("Jan");
            speler2 = new Speler("Els");
            speler3 = new Speler("Wim");

	}
	@Test
        public void maakSpeler_correcteNaam()
        {
			Assertions.assertEquals("Jan", speler1.getNaam());
        }

	@Test
        public void maakSpeler_correctVaknr()
        {
			Assertions.assertEquals(0, speler1.getVaknr());
        }
        
        @Test
        public void geefNieuwePositie_waarde4_retourneertCorrectVakNr()
        {
            int worp = 4;
            Assertions.assertEquals(String.format("%s%d", "je bevindt je op vak ", worp), speler1.geefNieuwePositie(worp));
        }
        
        @Test
        public void geefNieuwePositie_waarde11Keer5En2Keer6_retourneertCorrectVakNr()
        {
            int worp = 5;
            for (int i=1; i<=11; i++)
                speler2.geefNieuwePositie(worp); // 11 keer 5 posities vooruit = positie 55 (geen speciale vakken tegengekomen)
            worp = 6;
            speler2.geefNieuwePositie(worp); // 2 keer 6 posities vooruit - eerst naar 61, dan naar 62/63/62/61/60/59
            Assertions.assertEquals("je bevindt je op vak 59", speler2.geefNieuwePositie(worp));
        }
        
        @Test
        public void gewonnen_waarde11Keer5En2Keer4_retoruneertTrue()
        {
            int worp = 5;
            for (int i=1; i<=11; i++)
                speler3.geefNieuwePositie(worp); // 11 keer 5 posities vooruit = positie 55 (geen speciale vakken tegengekomen)
            worp = 4;
            for (int i=1; i<=2; i++)
                speler3.geefNieuwePositie(worp); // 2 keer 4 posities vooruit = positie 63 (geen speciale vakken tegengekomen)
            Assertions.assertTrue(speler3.gewonnen());
        }
}
