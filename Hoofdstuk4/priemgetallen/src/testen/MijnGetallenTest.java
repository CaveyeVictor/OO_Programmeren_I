package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.domein.domein.MijnGetallen;

public class MijnGetallenTest {

    private MijnGetallen mijngetal, mijngetal2, mijngetal3;

    @BeforeEach
    public void before() {
        mijngetal = new MijnGetallen(3, 5);
        mijngetal2 = new MijnGetallen(-10, 5);
        mijngetal3 = new MijnGetallen(10, -5);
    }

    @Test
    public void maakMijnGetallen_getal3EnGetal5_maaktObject() {
        Assertions.assertEquals(3, mijngetal.getGetal1());
        Assertions.assertEquals(5, mijngetal.getGetal2());
    }

    @Test
    public void maakMijnGetallen_getal1IsNegatief_maaktObjectDefaultWaardeVoorGetal1() {
    	Assertions.assertEquals(1, mijngetal2.getGetal1());
    	Assertions.assertEquals(5, mijngetal2.getGetal2());
    }

    @Test
    public void maakMijnGetallen_getal2IsNegatief_maaktObjectDefaultWaardeVoorGetal2() {
    	Assertions.assertEquals(10, mijngetal3.getGetal1());
    	Assertions.assertEquals(1, mijngetal3.getGetal2());
    }

    @Test
    public void setGetal1_nieuweWaarde5_wijzigtAttribuut() {
        mijngetal.setGetal1(5);
        Assertions.assertEquals(5, mijngetal.getGetal1());
    }

    @Test
    public void setGetal1_nieuweWaardeNegatief_wijzigtAttribuutNaarDefaultWaarde() {
        mijngetal.setGetal1(-10);
        Assertions.assertEquals(1, mijngetal.getGetal1());
    }

    @Test
    public void setGetal2_nieuweWaardeNegatief_wijzigtAttribuutNaarDefaultWaarde() {
        mijngetal.setGetal2(-10);
        Assertions.assertEquals(1, mijngetal.getGetal2());
    }

    @Test
    public void isPriemTweeling_getallen3En5_retourneertTrue() {
    	Assertions.assertTrue(mijngetal.isPriemtweeling());
    }

    @Test
    public void isPriemTweeling_getallenGeen2UitElkaar_retourneertFalse() {
    	Assertions.assertFalse(mijngetal2.isPriemtweeling());
    }
    
    @Test
    public void isPriemTweeling_getal1GeenPriemGetallen_retourneertFalse() {
        mijngetal2 = new MijnGetallen(4,7);
        Assertions.assertFalse(mijngetal2.isPriemtweeling());
    }    
    
    @Test
    public void isPriemTweeling_getal2GeenPriemGetallen_retourneertFalse() {
        mijngetal2 = new MijnGetallen(7, 4);
        Assertions.assertFalse(mijngetal2.isPriemtweeling());
    }     
}
