package Oefening3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oef3 {
    public static void main(String[] args) {
        Oef3 oef3 = new Oef3();
        Scanner input = new Scanner(System.in);


        System.out.print("Geef het eerste getal: ");
        int eerste = input.nextInt();
        System.out.printf("Geef het tweede getal (>%d): ", eerste);
        int tweede = input.nextInt();
        if (eerste > tweede){
            throw new IllegalArgumentException("Getal 1 is groter dan getal 2");
        }
        StringBuilder de_perfecte = new StringBuilder(String.format("De perfecte getallen tussen " +
                "%d en %d zijn:", eerste, tweede));
        int aantal = 0;
        for (int i = eerste; i < tweede; i ++){
            if (oef3.isPerfect(i)){
                de_perfecte.append(" ").append(i);
                aantal++;
            }
        }
        if (aantal != 0){
            System.out.println(de_perfecte);
        } else {
            System.out.println("Er zijn geen perfecte getallen in dit interval");
        }




    }

    public boolean isPerfect(int x){
        return berekenSomVanDelers(x) == x;
    }

    public int berekenSomVanDelers(int x){
        int som = 0;
        for (int i=1;i<x;i++) {

            if (x % i == 0) {

                som += i;

            }
        }
        return som;
    }

}
