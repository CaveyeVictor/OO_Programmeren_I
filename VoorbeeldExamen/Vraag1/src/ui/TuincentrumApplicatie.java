package ui;

import domein.Plant;
import domein.TuincentrumBewerking;

public class TuincentrumApplicatie {

    public static void main(String[] args) {

        String[] namen = {"sneeuwklokje","bromelia","gladiool","kerstcactus","heide"};
        boolean[] buitenplanten = {true,false,true,false,true};
        double[][] waterPerWeekPerSeizoenen = {{10.5,0.0,0.0,2.5},{2.5,7.5,1.5,0.5},{0.0,15.0,1.5,0.0},{0.5,0.5,0.5,2.5},{0.5,0.5,0.5,0.5}};

        TuincentrumApplicatie tca = new TuincentrumApplicatie();
        Plant[] plantenArray = tca.vulArray(namen, buitenplanten, waterPerWeekPerSeizoenen);

        System.out.println(TuincentrumBewerking.maakOverzichtPlanten(plantenArray));
        System.out.printf("Aantal kamerplanten in het tuincentrum: %d%n%n", TuincentrumBewerking.bepaalAantalKamerPlanten(plantenArray));

        /*String waterverbruikPerSeizoen = String.format("Totaal waterverbruik per seizoen:%n" +
                "lente: %.1f%n" +
                "zomer: %.1f%n" +
                "herfst: %.1f%n" +
                "winter: %.1f%n", // for-lus?
                );

         */

        System.out.printf("Totaal waterverbruik per seizoen:%n" +
                "lente: %.1f%n" +
                "zomer: %.1f%n" +
                "herfst: %.1f%n" +
                "winter: %.1f%n",
                TuincentrumBewerking.berekenTotaalWaterPerWeekPerSeizoen(plantenArray, 0),
                TuincentrumBewerking.berekenTotaalWaterPerWeekPerSeizoen(plantenArray, 1),
                TuincentrumBewerking.berekenTotaalWaterPerWeekPerSeizoen(plantenArray, 2),
                TuincentrumBewerking.berekenTotaalWaterPerWeekPerSeizoen(plantenArray, 3));
    }

    private Plant[] vulArray(String[] namen, boolean[] buitenplanten, double[][] waterPerWeekPerSeizoenen){
        Plant[] plantenArray = new Plant[namen.length];
        for (int i = 0; i < plantenArray.length ; i++) {
            plantenArray[i] = new Plant(namen[i], buitenplanten[i], waterPerWeekPerSeizoenen[i]);
        }
        return plantenArray;
    }

}
