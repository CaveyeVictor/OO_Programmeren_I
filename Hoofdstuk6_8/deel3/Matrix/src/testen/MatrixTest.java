package testen;



import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Matrix;
import domein.Punt;

public class MatrixTest
{
    private Matrix matrixVierkant, matrixDrieOpVijf, matrixVijfOpDrie;
    private final int[][] cijferArray =
        {
            {
                1, 2, 3, 4, 5
            }, 
            {
                3, 4, 5, 1, 2
            }, 
            {
                5, 4, 3, 2, 1
            }
        };
    private final int[][] vierkanteArray = { { 4, 5, 7 }, { 3, 2, 8 }, { 1, 6, 9} };

    @BeforeEach
    public void before()
    {
        matrixVierkant = new Matrix(3, 3);
        matrixDrieOpVijf = new Matrix(3, 5);
        matrixVijfOpDrie = new Matrix(5, 3);
    }
    
    @Test 
    public void maakMatrix_0rijen_2kolommen_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Matrix(0,2);});
    }
    
    @Test
    public void maakMatrix_2rijen_Min4kolommen_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Matrix(2,-4);});
    }

    @Test 
    public void setMatrix_onjuistAantalRijenEnOfKolommen_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {matrixVijfOpDrie.setMatrix(cijferArray);});
        
    }
    
    @Test
    public void geefWaardeOpRijKolom_rij2_kolom3_retourneert2()
    {
        matrixDrieOpVijf.setMatrix(cijferArray);
        Assertions.assertEquals(2, matrixDrieOpVijf.geefWaardeOpRijKolom(2, 3));
    }
    
    @Test 
    public void geefWaardeOpRijKolom_rij2_kolom6_geeftException()
    {
    	matrixDrieOpVijf.setMatrix(cijferArray);
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {matrixDrieOpVijf.geefWaardeOpRijKolom(2, 6);});
   
    }
    
    @Test 
    public void geefWaardeOpRijKolom_rijMin1_kolom3_geeftException()
    {
    	matrixDrieOpVijf.setMatrix(cijferArray);
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {matrixDrieOpVijf.geefWaardeOpRijKolom(-1, 3);});

    }

    @Test
    public void telBij_parameterwaarde4_retourneert8alsWaardeOpRij0Kolom3()
    {
        matrixDrieOpVijf.setMatrix(cijferArray);
        matrixDrieOpVijf.telBij(4);
        Assertions.assertEquals(4 + 4, matrixDrieOpVijf.geefWaardeOpRijKolom(0, 3));
    }

    @Test
    public void geefZadelpunten_cijferArray_bevatGeenZadelpunten_retourneertLegeArrayList()
    {
        //	1	2	3	4	5
        //	3	4	5	1	2
        //	5	4	3	2	1	
        matrixDrieOpVijf.setMatrix(cijferArray);
        ArrayList<Punt> punten = matrixDrieOpVijf.geefZadelpunten();
        Assertions.assertTrue(punten.isEmpty());
    }
    
    @Test
    public void geefZadelpunten_vierkanteArray_retourneertArrayListMetPuntX1Y1()
    {
        //      4       5       7
        //      3       2       8
        //      1       6       9
        matrixVierkant.setMatrix(vierkanteArray);
        ArrayList<Punt> punten = matrixVierkant.geefZadelpunten();
        System.out.println(punten.size());
        Assertions.assertTrue(punten.size() == 1);
        Assertions.assertTrue(punten.get(0).getX() == 1);
        Assertions.assertTrue(punten.get(0).getY() == 1);
    }
}