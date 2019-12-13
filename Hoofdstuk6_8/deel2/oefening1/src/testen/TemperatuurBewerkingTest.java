/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.TemperatuurBewerking;

public class TemperatuurBewerkingTest
{

   private double temperaturen[];

	@BeforeEach
	public void before()
	{
		temperaturen = new double[7];
		temperaturen[0] = 27.5;
		temperaturen[1] = 23.0;
		temperaturen[2] = 22.3;
		temperaturen[3] = 20.5;
		temperaturen[4] = 25.4;
		temperaturen[5] = 19.4;
		temperaturen[6] = 22.9;
	}

	@Test
	public void berekenGemiddeldeTemperatuur_geeft23Terug()
	{
		Assertions.assertEquals(23.0,TemperatuurBewerking.berekenGemiddeldeTemperatuur(temperaturen),0.01);
	}
}