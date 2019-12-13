package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oefening8.domein.domein.Rechthoek;

class RechthoekTest {

    private Rechthoek r1, r2;
    
    @BeforeEach
    public void before() {
        r1 = new Rechthoek(2,4); 
    }
    
    @Test
    public void maakRechthoek_lengte2Breedte4_maaktRechthoek() {
        r2 = new Rechthoek(2,4);
        Assertions.assertEquals(4.0, r2.getBreedte(),0.01);
        Assertions.assertEquals(2.0, r2.getLengte(),0.01);
    }

    @Test
    public void berekenOppervlakte_lengte2Breedte4_oppIs8(){
        r2 = new Rechthoek(2, 4);
        Assertions.assertEquals(8.0, r2.berekenOppervlakte(),0.01);
    }
    
    @Test
    public void berekenOmtrek_lengte2Breedte4_omtrekIs12(){
        r2 = new Rechthoek(2, 4);
        Assertions.assertEquals(12.0, r2.berekenOmtrek(),0.01);
    }
/*   
    
    @Test
    public void maakRechthoek_lengteMin2Breedte4_maaktRechthoekDefaultLengte() {
        r2 = new Rechthoek(-2,4);
        Assertions.assertEquals(4.0, r2.getBreedte(),0.01);
        Assertions.assertEquals(1.0, r2.getLengte(),0.01);
    }

    @Test
    public void maakRechthoek_lengte2BreedteMin4_maaktRechthoekDefaultBreedte() {
        r2 = new Rechthoek(2,-4);
        Assertions.assertEquals(1.0, r2.getBreedte(),0.01);
        Assertions.assertEquals(2.0, r2.getLengte(),0.01);
    } 
    
    @Test
    public void setLengte_lengte14_lengteWordt14(){
        r1.setLengte(14);
        Assertions.assertEquals(14.0, r1.getLengte(),0.001);
    }
    
    @Test
    public void setBreedte_breedte8_breedteWordt8(){
        r1.setBreedte(8);
        Assertions.assertEquals(8.0, r1.getBreedte(),0.001);
    }
   */ 

}