package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Berekening;

public class BerekeningTest
{
	private Berekening berekening1, berekening2;

	@BeforeEach
	public void before()
	{
		berekening1 = new Berekening(20);
		berekening2 = new Berekening(1);

	}
	@Test
	public void zoekRijenMetAlsSomX_waarde20_retourneertResultaat()
	{
		Assertions.assertEquals(String.format("2 + 3 + 4 + 5 + 6 = 20%n"), berekening1.zoekRijenMetAlsSomX());
	}

	@Test
	public void zoekRijenMetAlsSomX_waarde1_retourneertGeenResultaat()
	{
		Assertions.assertEquals("", berekening2.zoekRijenMetAlsSomX());
	}
}
