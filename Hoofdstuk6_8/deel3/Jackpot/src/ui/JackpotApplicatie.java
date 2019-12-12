package ui;

import domein.Jackpot;

import java.util.Scanner;

public class JackpotApplicatie {

    public JackpotApplicatie(Jackpot jp){
        int keuze;
        do {
            keuze = voerKeuzeIn();
            switch (keuze){
                case 1:
                    jp = new Jackpot();
                    break;
                case 2:
                    if (jp == null || jp.getKrediet() < 2){
                        geefFout();
                    } else {
                        jp.speel();
                        for (int part: jp.getRes()){
                            System.out.printf(" %d", part);
                        }
                        System.out.printf("%n");
                    }
                    break;
                case 3:
                    jp = null;
                    break;
                case 4:
                    if (jp == null){
                        geefFout();
                    } else {
                        System.out.printf("Het krediet = %d%n", jp.getKrediet());
                    }
                    break;
                case 5:
                    if (jp == null){
                        geefFout();
                    } else {
                        System.out.printf("Het spelbedrag: %d%n", jp.getSpelbedrag());
                    }
                    break;
                case 6:
                    jp = null;
                    break;
                default:
                    System.out.println("Foute ingave, probeer opnieuw%,");
                    break;
            }
        } while (keuze != 6);
    }

    public static int voerKeuzeIn(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Geef uw keuze :%n" +
                "1) nieuw spel%n" +
                "2) speel%n" +
                "3) stop het spel%n" +
                "4) toon krediet%n" +
                "5) toon spelbedrag%n" +
                "6) stop programma%n" +
                "Keuze: ");
        return input.nextInt();
    }

    private void geefFout(){
        System.out.println("Er is geen spel actief of je hebt niet voldoende krediet");
        /*
        if (jp == null){
            throw new IllegalArgumentException("Er is geen spel actief of je hebt niet voldoende krediet");
        }
         */
    }

}
