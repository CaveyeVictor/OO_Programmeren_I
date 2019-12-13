package ui;

import domein.domein.domein.Auto;

public class AutoApplicatie {
	
	public static void main(String[] args){
        
        Auto auto  = new Auto();
        System.out.println(auto.toString());
        System.out.printf("De kleur van de auto (aangemaakt via defaultconstructor) is %s%n", auto.getKleur());
               
        auto.setKleur("rood");
        System.out.printf("De kleur van de auto (via setter ingesteld) is %s%n", auto.getKleur());
        
        Auto auto2 = new Auto("geel");
        System.out.printf("De kleur van de auto (bij creatie onmiddellijk kleur ingesteld) is %s%n", auto2.getKleur());
      
    }
}
