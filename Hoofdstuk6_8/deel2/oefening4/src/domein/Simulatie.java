package domein;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Simulatie {
    private int[] persoon;

    public Simulatie(int aantalPersonen){
        persoon = new int[aantalPersonen];
    }

    public List<ZelfdeDagJarig> maakSimulatie(){
        genereerVerjaardagen();
        return zoekJarigenOpDezelfdeDag(persoon);
    }

    private void genereerVerjaardagen(){
        SecureRandom sc = new SecureRandom();
        for (int i = 0; i <persoon.length ; i++) {
            persoon[i] = sc.nextInt(365)+1;
        }
    }

    public List<ZelfdeDagJarig> zoekJarigOpDezelfdeDag(int[] allePersonen)
    {
        List<ZelfdeDagJarig> lijst = new ArrayList<>();
        for (int i=0; i<allePersonen.length-1; i++)
        {
            int j = 0, k = 0, begin = 5;

            int j = i+1;
            boolean gevonden = false;
            while (j < allePersonen.length && !gevonden)
            {
                if (allePersonen[i] == allePersonen[j])
                {
                    lijst.add(new ZelfdeDagJarig(i+1, j+1, allePersonen[i]));
                    gevonden = true;
                }
                j++;
            }
        }
        return lijst;
    }
}
