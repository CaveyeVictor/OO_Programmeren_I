package ui;

import java.util.Scanner;

/**
 * Dit is een voorbeeld van een herhaling met teller uitgewerkt met een for!
 * 
 */
public class KlasgemiddeldeTellerFOR
{
    public static void main(String args[])
    {
        //declaratie lokale variabelen
        int totaal, punt, gemiddelde;
        Scanner input = new Scanner(System.in);
        
        //initialisatie variabelen
        totaal = 0;
        
        //blijf herhalen tot...
        for (int teller = 1;teller <= 5;teller = teller + 1)
        {
            System.out.print("Geef score " + teller + " (/20):");
            punt = input.nextInt();
            totaal = totaal + punt;
            
        }
        
        gemiddelde = totaal / 5;
        
        System.out.printf("Het klasgemiddelde is %d%n", gemiddelde);
    }
}
