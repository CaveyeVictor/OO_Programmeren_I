package Oefening2;

import java.util.Scanner;

public class Oef2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String schaal = "Celsius";
        System.out.printf("Geef de temperatuur in graden %s (9999 om te stoppen): ",
                schaal);
        int temp = input.nextInt();
        while (temp != 9999){
            String resultaat = geefTemperatuurStatus(temp);
            System.out.printf("%d graden %s voelt aan als %s%n",
                    temp, schaal, resultaat);
            System.out.printf("Geef de temperatuur in graden %s (9999 om te stoppen): ",
                    schaal);
            temp = input.nextInt();

        }
    }

    private static String geefTemperatuurStatus(int temp){
        if (temp < 10){
            return "koud";
        } else if (temp <= 20){
            return "lauw";
        } else {
            return "warm";
        }
    }


}
