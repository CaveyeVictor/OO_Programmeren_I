
package testen;

import org.junit.jupiter.api.*;

import oefening8.domein.domein.Marktkraam;

public class MarktkraamTest 
{
    private Marktkraam kraam1, kraam2, kraam3;

    @BeforeEach
    public void before()
    {
        kraam1 = new Marktkraam("Jan", 5);
        kraam2 = new Marktkraam("Gert", 3);
        kraam3 = new Marktkraam("Koen", 8);
    }

    @Test
    public void maakMarktkraam_JuisteNaam_maaktObject() 
    {
        Assertions.assertEquals("Jan", kraam1.getNaam());
    }
    
    @Test
    public void maakMarktkraam_LegeNaam_geeftException() 
    {
        Assertions.assertThrows(IllegalArgumentException.class , () -> {new Marktkraam("", 2);});
    }
    
    @Test
    public void maakMarktkraam_NullreferentieNaam_geeftException() 
    {
        Assertions.assertThrows(IllegalArgumentException.class , () -> {new Marktkraam(null, 7);});
    }

    @Test
    public void maakMarktkraam_JuisteLengte_maaktObject() 
    {
        Assertions.assertEquals(5, kraam1.getLengteInM());
    }
    
    @Test
    public void maakMarktkraam_TeLangeLengte_geeftException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Marktkraam("Els", 11);});
    }
    
    @Test
    public void maakMarktkraam_TeKorteLengte_geeftException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Marktkraam("Piet", -2);});
    }
    
    @Test
    public void berekenWinst_KraamMetLengte3_ZonderInkomsten_retourneertMin9() 
    {
        Assertions.assertEquals(-9.0, kraam2.berekenWinst(), 0.1);
    }
    
    @Test
    public void berekenWinst_KraamMetLengte8_ZonderInkomsten_retourneertMin20() 
    {
        Assertions.assertEquals(-20.0, kraam3.berekenWinst(), 0.1);
    }
    
    @Test
    public void berekenWinst_KraamMetLengte3_10euroInkomsten_retourneert1() 
    {
    	kraam2.voegToeAanInkomsten(10);
        Assertions.assertEquals(1.0, kraam2.berekenWinst(), 0.1);
    }
    
    @Test
    public void berekenWinst_KraamMetLengte8_Inkomsten32komma5_retourneert12komma5() 
    {
    	kraam3.voegToeAanInkomsten(5);
    	kraam3.voegToeAanInkomsten(2.5);
    	kraam3.voegToeAanInkomsten(10);
    	kraam3.voegToeAanInkomsten(15);
        Assertions.assertEquals(12.5, kraam3.berekenWinst(), 0.1);
    }
}


