package domein;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Simulatie {
    private int[] persoon;

    Simulatie(int aantalPersonen){
        persoon = new int[aantalPersonen];
        genereerVerjaardagen();
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

        //todo: ondeuidelijk wanneer je moet stopppen
        return list;
    }


}
