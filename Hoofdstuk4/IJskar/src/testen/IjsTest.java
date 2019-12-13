package testen;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.domein.domein.IJs;

public class IjsTest {

    private IJs ijsje1, ijsje2, ijsje3;

    @BeforeEach
    public void before() {
        ijsje1 = new IJs(3, 1);
        ijsje2 = new IJs(10, -1);
        ijsje3 = new IJs(4, 3);
    }

    @Test
    public void maakIjsje_aantalBollenTeGroot_defaultwaardeToegekend() {
        Assertions.assertEquals(1, ijsje2.getAantalBollen());
    }

    @Test
    public void maakIjsje_aantalBollenTeKlein_defaultwaardeToegekend() {
        ijsje2 = new IJs(0, 1);
        Assertions.assertEquals(1, ijsje2.getAantalBollen());
    }

    @Test
    public void maakIjsje_keuzeExtraNegatief_defaultwaardeToegekend() {
        ijsje2 = new IJs(2, -1);
        Assertions.assertEquals(0, ijsje2.getKeuzeExtra());
    }

    @Test
    public void maakIjsje_keuzeExtraTeGroot_defaultwaardeToegekend() {
        ijsje2 = new IJs(2, 4);
        Assertions.assertEquals(0, ijsje2.getKeuzeExtra());
    }

    @Test
    public void setAantalBollen_nieuweWaarde2_waardeToegekend() {
        ijsje1.setAantalBollen(2);
        Assertions.assertEquals(2, ijsje1.getAantalBollen());
    }

    @Test
    public void setAantalBollen_nieuweWaardeTeKlein_defaultwaardeToegekend() {
        ijsje1.setAantalBollen(0);
        Assertions.assertEquals(1, ijsje1.getAantalBollen());
    }

    @Test
    public void setAantalBollen_nieuweWaardeTeGroot_defaultwaardeToegekend() {
        ijsje1.setAantalBollen(10);
        Assertions.assertEquals(1, ijsje1.getAantalBollen());
    }

    @Test
    public void setKeuzeExtra_waarde2_waardeToegekend() {
        ijsje1.setKeuzeExtra(2);
        Assertions.assertEquals(2, ijsje1.getKeuzeExtra());
    }

    @Test
    public void setKeuzeExtra_waardeTeKlein_defaultwaardeToegekend() {
        ijsje1.setKeuzeExtra(-1);
        Assertions.assertEquals(0, ijsje1.getKeuzeExtra());
    }

    @Test
    public void setKeuzeExtra_waardeTeGroot_defaultwaardeToegekend() {
        ijsje1.setKeuzeExtra(4);
        Assertions.assertEquals(0, ijsje1.getKeuzeExtra());
    }

    @Test
    public void berekenPrijs_2bollenGeenExtra_retourneertPrijs() {
        ijsje3 = new IJs(2, 0);
        Assertions.assertEquals(1.44, ijsje3.berekenPrijs(), 0.01);
    }
    
    @Test
    public void berekenPrijs_2bollenEnSlagroom_retourneertPrijs() {
        ijsje3 = new IJs(2, 1);
        Assertions.assertEquals(1.74, ijsje3.berekenPrijs(), 0.01);
    } 
    
    @Test
    public void berekenPrijs_2bollenEnChocoladeSaus_retourneertPrijs() {
        ijsje3 = new IJs(2, 2);
        Assertions.assertEquals(1.74, ijsje3.berekenPrijs(), 0.01);
    }  

    @Test
    public void berekenPrijs_2bollenEnSlagroomEnChocoladeSaus_retourneertPrijs() {
        ijsje3 = new IJs(2, 3);
        Assertions.assertEquals(1.94, ijsje3.berekenPrijs(), 0.01);
    }     
    
    @Test
    public void berekenPrijs_4bollenEnSlagroomEnChocoladeSaus_retourneertPrijs() {
        ijsje3 = new IJs(4, 3);
        Assertions.assertEquals(3.06, ijsje3.berekenPrijs(), 0.01);
    }     
    
    
}
