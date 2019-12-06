package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domein.DatumOperaties;

/**
 *
 * @author Docent
 */
public class DatumOperatiesTest
{	
    @Test
    public void berekenDatumMetDagNummer_met105_geeft15april()
    {
        Assertions.assertEquals("15 april", DatumOperaties.berekenDatumMetDagNummer(105));
    }

    @Test
    public void berekenDatumMetDagNummer_met222_geeft10augustus()
    {
    	Assertions.assertEquals("10 augustus", DatumOperaties.berekenDatumMetDagNummer(222));
    }	

    @Test
    public void berekenDatumMetDagNummer_met316_geeft12november()
    {
    	Assertions.assertEquals("12 november", DatumOperaties.berekenDatumMetDagNummer(316));
    }
}