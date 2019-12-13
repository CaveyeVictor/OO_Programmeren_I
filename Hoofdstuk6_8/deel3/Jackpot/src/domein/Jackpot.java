package oefening8.domein.domein;

import java.security.SecureRandom;

public class Jackpot {
    private final static int MAXWAARDE = 15;
    private final static int SPELBEDRAG = 2;

    private int krediet = 20;
    private int[] res = new int[3];

    public int getKrediet() {
        return krediet;
    }

    public final void setKrediet(int krediet) {
        this.krediet = krediet;
    }

    public static int getSpelbedrag(){
        return SPELBEDRAG;
    }

    public static int getMaxwaarde(){
        return MAXWAARDE;
    }

    private void setRes(){
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < res.length ; i++) {
            res[i] = secureRandom.nextInt(16);
        }
    }

    public int[] getRes(){
        return res;
    }

    public void speel(){
        //past het kredietbedrag aan
        setKrediet(krediet-SPELBEDRAG);
        //via setRes() worden3nieuwe waarden bepaald voor de random getallen
        setRes();
        //set krediet na winst of niet. Er is al 2 van afgetrokken
        setKrediet(krediet+geefGewonnenBedrag());
    }

    public int geefGewonnenBedrag(){
        int aantalNullen = 0;
        for (int jp: res) {
            if (jp == 0){
                aantalNullen++;
            }
        }
        int bedrag = 0;
        switch (aantalNullen) {
            case 3:
                bedrag += 4*SPELBEDRAG;
                break;
            case 2:
                bedrag += 2*SPELBEDRAG;
                break;
            case 1:
                bedrag += SPELBEDRAG;
                break;
            default:
                int gelijk = res[0];
                int i = 1;
                while (i < res.length && res[i] == gelijk)
                    i++;
                if (i == res.length)
                    bedrag += 2*SPELBEDRAG;
                break;
        }
        return bedrag;
    }
}
