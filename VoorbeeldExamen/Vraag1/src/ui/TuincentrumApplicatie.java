package ui;


import domein.Plant;
import domein.TuincentrumBewerking;

public class TuincentrumApplicatie {

    public static void main(String[] args) {

        String[] namen = {"sneeuwklokje", "bromelia", "gladiool", "kerstcactus", "heide"};
        final String[] seizoenen = {"lente", "zomer", "herfst", "winter"};
        boolean[] buitenplanten = {true, false, true, false, true};
        double[][] waterPerWeekPerSeizoenen = {{10.5, 0.0, 0.0, 2.5}, {2.5, 7.5, 1.5, 0.5}, {0.0, 15.0, 1.5, 0.0}, {0.5, 0.5, 0.5, 2.5}, {0.5, 0.5, 0.5, 0.5}};

        TuincentrumApplicatie tca = new TuincentrumApplicatie();
        Plant[] plantenArray = tca.vulArray(namen, buitenplanten, waterPerWeekPerSeizoenen);

        System.out.println(TuincentrumBewerking.maakOverzichtPlanten(plantenArray));
        System.out.printf("Aantal kamerplanten in het tuincentrum: %d%n%n", TuincentrumBewerking.bepaalAantalKamerPlanten(plantenArray));

        System.out.println("Totaal waterverbruik per seizoen:");
        int i = 0;
        for (String seizoen : seizoenen) {
            System.out.printf("%s: %.1f%n", seizoen, TuincentrumBewerking.berekenTotaalWaterPerWeekPerSeizoen(plantenArray, i++));
        }
    }

    private Plant[] vulArray (String[]namen,boolean[] buitenplanten, double[][] waterPerWeekPerSeizoenen){
        Plant[] plantenArray = new Plant[namen.length];
        for (int i = 0; i < plantenArray.length; i++) {
            plantenArray[i] = new Plant(namen[i], buitenplanten[i], waterPerWeekPerSeizoenen[i]);
        }
        return plantenArray;
    }

}

