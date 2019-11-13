package ui;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Dit is een voorbeeld van een herhaling met teller uitgewerkt met een while!
 */
public class KlasgemiddeldeTeller
{
    public static void main(String args[])
    {
        //declaratie lokale variabelen
        int totaal, teller, punt, gemiddelde;
        Scanner input = new Scanner(System.in);
        
        //initialisatie variabelen
        totaal = 0;
        teller = 1;
        
        //blijf herhalen tot...
        while (teller <= 5)
        {
            System.out.print("Geef score " + teller + " (/20):");
            punt = input.nextInt();
            totaal = totaal + punt;
            teller = teller + 1;
        }
        
        gemiddelde = totaal / 5;
        
        System.out.printf("Het klasgemiddelde is %d%n", gemiddelde);
    }
}
