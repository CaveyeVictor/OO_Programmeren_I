package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Product;

class ProductTest {

	 private Product p1, p2, p3;

	    @BeforeEach
	    public void before() {
	        p1 = new Product("Cola", 1.48, 21, 5);
	        p2 = new Product("ColaZero", 1.48, 6, 0);
	        p3 = new Product("ColaLight", 1.48, 12, 10);
	    }

	    @Test
	    public void maakProduct_ZonderKortingBtw21_maaktProduct() {
	        p1 = new Product("Cola", 1.50, 21, 0);
	        Assertions.assertEquals("Cola", p1.getNaam());
	        Assertions.assertEquals(1.50, p1.getPrijsExclBtw(), 0.01);
	        Assertions.assertEquals(21, p1.getBtwPercentage());
	        Assertions.assertEquals(0, p1.getKorting6StuksPercentage());
	    }

	    @Test
	    public void setPrijsExclBtw_nieuweWaarde_wijzigtPrijsExclBtw() {
	        p2.setPrijsExclBtw(3.77);
	        Assertions.assertEquals(3.77, p2.getPrijsExclBtw(), 0.01);
	    }

	    @Test
	    public void setBtwPercentage_nieuweWaarde_wijzigtBtwPercentage() {

	        p3.setBtwPercentage(6);
	        Assertions.assertEquals(6, p3.getBtwPercentage());
	    }

	    @Test
	    public void setBtwPercentage_nieuweWaardeTeKlein_wijzigtBtwPercentageDefaultWaarde() {

	        p3.setBtwPercentage(5);
	        Assertions.assertEquals(21, p3.getBtwPercentage());
	    }

	    @Test
	    public void setBtwPercentage_nieuweWaardeTeGroot_wijzigtBtwPercentageDefaultWaarde() {

	        p3.setBtwPercentage(50);
	        Assertions.assertEquals(21, p3.getBtwPercentage());
	    }

	    @Test
	    public void setKorting3StuksPercentage_nieuweWaarde_wijzigtKorting3StuksPercentage() {
	        p3.setKorting6StuksPercentage(5);
	        Assertions.assertEquals(5, p3.getKorting6StuksPercentage());
	    }

	    @Test
	    public void setKorting3StuksPercentage_nieuweWaardeTeKlein_wijzigtKorting3StuksPercentage() {
	        p3.setKorting6StuksPercentage(-5);
	        Assertions.assertEquals(0, p3.getKorting6StuksPercentage());
	    }
	    
	    @Test
	    public void setKorting3StuksPercentage_nieuweWaardeTeGroot_wijzigtKorting3StuksPercentage() {
	        p3.setKorting6StuksPercentage(60);
	        Assertions.assertEquals(0, p3.getKorting6StuksPercentage());
	    } 
	    
	    @Test
	    public void berekenPrijsMetBtw_colaMet21Btw_geeftPrijsTerug() {
	       Assertions.assertEquals(1.7908, p1.berekenPrijs(1),0.01);
	    }    
}