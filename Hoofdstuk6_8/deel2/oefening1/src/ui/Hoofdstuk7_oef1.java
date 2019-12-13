package ui;

import domein.domein.domein.TemperatuurBewerking;

import java.util.Scanner;

public class Hoofdstuk7_oef1 {
    public static void main(String[] args) {
        double[] temperatuur = new double[7];

        voerTemperatuurIn(temperatuur);

        toonTemperaturen(TemperatuurBewerking.berekenGemiddeldeTemperatuur(temperatuur), temperatuur);
    }

    public static void voerTemperatuurIn(double[] temperatuur){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < temperatuur.length; i++) {
            System.out.printf("Geef temperatuur %d in : ", i+1);
            temperatuur[i] = input.nextDouble();
        }

    }

    public static void toonTemperaturen(double gem, double[] temperatuur){
        System.out.printf("Gemiddelde temperatuur : %.1f%n%n", gem);
        System.out.printf("%20s%20s%40s%n%n", "temperatuur", "graden", "verschil");
        int j = 0;
        for (double temp: temperatuur){
            System.out.printf("%20d%20.1f%40s%n",
                    j, temp, String.format("%.1f%s%S%s",
                            Math.abs(temp-gem), " graden ", temp-gem>0 ? "boven" : "onder", " het gemiddelde"));
            j++;
        }

    }
}
