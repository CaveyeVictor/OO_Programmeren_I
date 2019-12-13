package testen;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.domein.domein.MijnGetallen;

public class MijnGetallenTest2 {
	private MijnGetallen mg1, mg2, mg3, mg4, mg5;

    @BeforeEach
    public void before() 
    {
        mg1 = new MijnGetallen(2, 5);
        mg2 = new MijnGetallen(5, 10);
        mg3 = new MijnGetallen(7, 1);
        mg4 = new MijnGetallen(11, 13);
        mg5 = new MijnGetallen(11, 9);
    }

    @Test
    public void maakMijnGetallen_g1is2_g2is5_wordtIngesteld() 
    {
        Assertions.assertEquals(2, mg1.getGetal1());
        Assertions.assertEquals(5, mg1.getGetal2());
    }
    
    @Test 
    public void maakMijnGetallen_g1isMin2_g2is2_geeftException() 
    {
        Assertions.assertThrows(IllegalArgumentException.class , () -> {new MijnGetallen(-2, 2);});
    }
    
    @Test 
    public void maakMijnGetallen_g1is2_g2isMin2_geeftException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new MijnGetallen(2, -2);});
    }
    
    @Test
    public void zijnPriem_mg1_retourneertTrue() 
    {
        Assertions.assertTrue(mg1.zijnPriem());
    }

    @Test
    public void zijnPriem_mg2_retourneertFalse() 
    {
        Assertions.assertFalse(mg2.zijnPriem());
    }
    
    @Test
    public void zijnPriem_mg3_retourneertFalse() 
    {
        Assertions.assertFalse(mg3.zijnPriem());
    }
    
    @Test
    public void wisselOm_mg1_g1Wordt5_g2Wordt2() 
    {
        mg1.wisselOm();
        Assertions.assertEquals(5, mg1.getGetal1());
        Assertions.assertEquals(2, mg1.getGetal2());
    }

    @Test
    public void isPriemTweeling_mg4_retourneertTrue() 
    {
        Assertions.assertTrue(mg4.isPriemtweeling());
    }

    @Test
    public void isPriemTweeling_mg5_retourneertFalse() 
    {
        Assertions.assertFalse(mg5.isPriemtweeling());
    }
    
    @Test
    public void isPriemTweeling_mg1_retourneertFalse() 
    {
        Assertions.assertFalse(mg1.isPriemtweeling());
    }
}
