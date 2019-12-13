package testen;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oefening8.domein.domein.Punt;

public class PuntTest
{
    private Punt punt1, punt2;

    @BeforeEach
    public void before()
    {
        punt1 = new Punt(10, 15);
        punt2 = new Punt(10, 55);
    }

    @Test
    public void maakPunt_punt1_steltWaardenXenYin()
    {
        Assertions.assertEquals(10, punt1.getX());
        Assertions.assertEquals(15, punt1.getY());
    }    

    @Test 
    public void maakPunt_xMin5_y4_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Punt(-5,4);});
    }
   
    @Test 
    public void maakPunt_x5_yMin4_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Punt(5,-4);});
    }
    
    @Test
    public void vergelijkMetPunt_punt2_met_punt1_retourneert_false()
    {
    	Assertions.assertFalse(punt2.vergelijkMetPunt(punt1));
    }    
    
    @Test
    public void vergelijkMetPunt_punt1_met_punt1_retourneert_true()
    {
    	Assertions.assertTrue(punt1.vergelijkMetPunt(punt1));
    }   
    
    @Test
    public void vergelijkMetPunt_punt1_met_nieuwPuntMetX10EnY15_retourneert_true()
    {
    	Assertions.assertTrue(punt1.vergelijkMetPunt(new Punt(10,15)));
    } 

    @Test
    public void berekenAfstandTotPunt_punt1TotPunt2_retourneert40()
    {
    	Assertions.assertEquals(40.00, punt1.berekenAfstandTotPunt(punt2), 0.001);
    }
}