package testen;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Lid;


class LidTest {

    private Lid lid, nogEenLid;
    private int jaar = LocalDateTime.now().getYear();

    @BeforeEach
    public void before() {
        lid = new Lid("Jan", "Janssens");
        nogEenLid = new Lid("Piet", "Peeters", 2010);
    }

    @Test
    public void maakLid_naamVoornaamDefaultJaartal_maaktObject() {
    	Assertions.assertEquals("Jan", lid.getVoornaam());
    	Assertions.assertEquals("Janssens", lid.getNaam());
    	Assertions.assertEquals(jaar, lid.getBeginJaartal());
    }

    @Test
    public void maakLid_naamVoornaamJaartal_maaktObject() {
    	Assertions.assertEquals("Piet", nogEenLid.getVoornaam());
    	Assertions.assertEquals("Peeters", nogEenLid.getNaam());
    	Assertions.assertEquals(2010, nogEenLid.getBeginJaartal());
    }
    
    @Test
    public void setNaam_nieuweWaarde_wijzigtNaam() {
        lid.setNaam("Tom");
        Assertions.assertEquals("Tom", lid.getNaam());
    }

    @Test
    public void setBeginJaartal_nieuweWaardeTeKlein_wijzigtJaartalInDefaultWaarde() {
        lid.setBeginJaartal(1900);
        Assertions.assertEquals(jaar, lid.getBeginJaartal());
    }

    public void setBeginJaartal_nieuweWaarde_wijzigtBeginJaartal() {
        nogEenLid.setBeginJaartal(jaar - 10);
        Assertions.assertEquals(jaar - 10, nogEenLid.getBeginJaartal());
    }

    @Test
    public void berekenLidgeld_lidMinderDan5Jaar_geeftLidgeldZonderKortingTerug() {
        nogEenLid.setBeginJaartal(jaar - 4);
        Assertions.assertEquals(120.0, nogEenLid.berekenLidgeld(), 0.01);
    }

    @Test
    public void berekenLidgeld_lid8Jaar_geeftLidgeld10ProcentKortingTerug() {
        nogEenLid.setBeginJaartal(jaar - 8);
        Assertions.assertEquals(108.0, nogEenLid.berekenLidgeld(), 0.01);
    }

    @Test
    public void berekenLidgeld_lid12Jaar_geeftLidgeld15ProcentKortingTerug() {
        nogEenLid.setBeginJaartal(jaar - 12);
        Assertions.assertEquals(102.0, nogEenLid.berekenLidgeld(), 0.01);
    }

    @Test
    public void berekenLidgeld_lid17Jaar_geeftLidgeld30ProcentKortingTerug() {
        nogEenLid.setBeginJaartal(jaar - 17);
        Assertions.assertEquals(84, nogEenLid.berekenLidgeld(), 0.01);
    }

}
