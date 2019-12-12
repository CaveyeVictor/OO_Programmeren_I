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

    public List<ZelfdeDagJarig> zoekJarigenOpDezelfdeDag (int[] allePersonen){
        List<ZelfdeDagJarig> list = new ArrayList<>();
        int i = 0;
        for (int dag: persoon){
            for (int j = i+1; j < persoon.length; j++) {
                if (dag == persoon[j]){
                    list.add(new ZelfdeDagJarig(i, j, dag));
                    //break; of niet? Opgave een beetje verwarrend.
                }
            }
            i++;
        }
        return list;
    }
}
