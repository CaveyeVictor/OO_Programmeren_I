package domein;

public class TuincentrumBewerking {

    public static int bepaalAantalKamerPlanten(Plant[] array){
        int kamerplanten = 0;
        for (Plant p: array){
           if (!p.isBuitenplant()){
               kamerplanten++;
           }
        }
        return kamerplanten;
    }

    public static String maakOverzichtPlanten(Plant[] array){
        String str = String.format("Overzicht van alle planten: %n");
        for (Plant p: array){
            str += String.format("%s %n", p.toString());
        }
        return str;
    }

    public static double berekenTotaalWaterPerWeekPerSeizoen(Plant[] array, int index){
        double som = 0;
        for (Plant p: array){
            som += p.getWaterPerWeekPerSeizoen()[index];
        }
        return som;
    }

}
