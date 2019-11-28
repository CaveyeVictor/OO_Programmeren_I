package oefening5;

import java.util.Scanner;

/**
 * @author llew870
 */
public class Oef5 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Geef de schaal: Celcius of Fahrenheit (C=1 of F=2): ");
        int schaal = input.nextInt();
        System.out.print("Geef de temperatuur (9999 om te stoppen): ");
        int temp = input.nextInt();
        while (temp != 9999) {
            String resultaat = geefTemperatuurStatus(temp, schaal == 1 ? 'C' : 'F');
            System.out.printf("%d graden %s voelt aan als %s%n%n", temp, schaal == 1 ? "Celcius" : "Fahrenheit", resultaat);

            System.out.print("Geef de schaal: Celcius of Fahrenheit (C=1 of F=2): ");
            schaal = input.nextInt();
            System.out.print("Geef de temperatuur (9999 om te stoppen): ");
            temp = input.nextInt();
        }
    }

    private static String geefTemperatuurStatus(int temp, int schaal){
        if (schaal == 2){
            temp = (temp-32)*5/9;
        }
        return geefTemperatuurStatus(temp);
    }

    private static String geefTemperatuurStatus(int temp) {
        if (temp < 10) {
            return "koud";
        } else if (temp <= 20) {
            return "lauw";
        } else {
            return "warm";
        }
    }

}
