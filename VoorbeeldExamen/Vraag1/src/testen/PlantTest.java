package testen;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import oefening8.domein.domein.Plant;

public class PlantTest
{
    
    private Plant plant1, plant2, plant3;

    @Before
    public void before()
    {
        plant1 = new Plant("sneeuwklokje",true,new double[]{10.5,0.0,0.0,2.5});
        plant2 = new Plant("heide");
    }

    @Test
    public void maakPlant_alleAttributen_steltWaardenIn()
    {
        Assert.assertEquals("sneeuwklokje", plant1.getPlantennaam());
        Assert.assertEquals(true, plant1.isBuitenplant());
        Assert.assertArrayEquals(new double[]{10.5,0.0,0.0,2.5}, 
                            plant1.getWaterPerWeekPerSeizoen(),
                            0.01);     
    }
    @Test
    public void maakPlant_zonderBuitenplantEnArray_steltDefaultWaardenIn()
    {
        Assert.assertEquals("heide", plant2.getPlantennaam());
        Assert.assertEquals(false, plant2.isBuitenplant());
        Assert.assertArrayEquals(new double[]{0.0,0.0,0.0,0.0}, 
                            plant2.getWaterPerWeekPerSeizoen(),0.01);
    }
    @Test (expected = IllegalArgumentException.class)
    public void maakPlant_plantennaam_legeString_geeftException()
    {
        plant3 = new Plant("");
    }
    @Test (expected = IllegalArgumentException.class)
    public void maakPlant_WaterPerWeekPerSeizoen_teKleingeeftException()
    {
        plant3 = new Plant("bromelia", false, new double[]{-2.5,7.5,1.5,0.5});
    }
    @Test
    public void toString_geeftTekstueleWeergave()
    {
        Assert.assertEquals("Buitenplant met naam sneeuwklokje en met 3,3 gemiddeld waterverbruik per week.",plant1.toString());
    }
}
