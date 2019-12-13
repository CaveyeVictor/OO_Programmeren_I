/*

package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oefening8.domein.domein.Auto;

class AutoTest {
	
	    private Auto auto1, auto2, auto3;

	    @BeforeEach
	    public void before() {
	        auto1 = new Auto();
	        auto2 = new Auto("geel");
	        auto3 = new Auto("rood", "Porche");
	    }

	    @Test
	    public void maakAuto_defaultWaarden_geeftNullAlsKleur() {
	        Assertions.assertEquals(null, auto1.getKleur());
	    }

	    @Test
	    public void maakAuto_metInitialisatieKleur_geeftCorrecteKleur() {
	        Assertions.assertEquals("geel", auto2.getKleur());
	    }

	    @Test
	    public void maakAuto_metInitialisatieKleurEnMerk_geeftCorrecteKleurenMerk() {
	        Assertions.assertEquals("rood", auto3.getKleur());
	        Assertions.assertEquals("Porche", auto3.getMerk());
	    }

	    @Test
	    public void setKleur_nieuweWaarde_correctGewijzigd() {
	        auto1.setKleur("blauw");
	        Assertions.assertEquals("blauw", auto1.getKleur());
	    }

	    @Test
	    public void setType_nieuweWaarde_correctGewijzigd() {
	        auto1.setType("astra");
	        Assertions.assertEquals("astra", auto1.getType());
	    }

	    @Test
	    public void setNrplaat_nieuweWaarde_correctGewijzigd() {
	        auto1.setNrplaat("AAA111");
	        Assertions.assertEquals("AAA111", auto1.getNrplaat());
	    }

	    @Test
	    public void setChassisnummer_nieuweWaarde_correctGewijzigd() {
	        auto1.setChassisnummer("ab1253698-ze");
	        Assertions.assertEquals("ab1253698-ze", auto1.getChassisnummer());
	    }

}

 */
