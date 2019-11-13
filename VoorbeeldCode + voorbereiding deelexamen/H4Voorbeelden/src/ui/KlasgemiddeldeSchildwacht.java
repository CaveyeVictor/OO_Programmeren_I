/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author docent
 */
public class KlasgemiddeldeSchildwacht
{
    public static void main(String args[])
    {
        //declaratie lokale variabelen
        int totaal, teller, punt;
        double gemiddelde;
        Scanner input = new Scanner(System.in);
        
        //initialisatie variabelen
        totaal = 0;
        teller = 0;
        
        //verwerkingsfase
        System.out.print("Geef score (/20) of -1 om te stoppen: ");
        punt = input.nextInt();
        
        while (punt != -1)
        {
            totaal = totaal + punt;
            teller = teller + 1;
            System.out.print("Geef score (/20) of -1 om te stoppen: ");
            punt = input.nextInt();
        }
        
        if (teller != 0)
        {
            gemiddelde = (double)totaal/teller;
            System.out.printf("Het klasgemiddelde is %.2f%n", gemiddelde);
            
        }
        else
        {
            System.out.printf("Er werden geen punten ingegeven.%n");
        }
    }
}
