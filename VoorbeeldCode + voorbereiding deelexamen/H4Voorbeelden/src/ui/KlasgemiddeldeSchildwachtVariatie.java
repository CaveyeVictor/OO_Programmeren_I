/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author docent
 */
public class KlasgemiddeldeSchildwachtVariatie
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
        	//andere wijze om kommagetallen te formatteren, kan uiteraard ook via printf en %.2f
            DecimalFormat tweeCijfers = new DecimalFormat("0.00");
            gemiddelde = (double)totaal/teller;
            System.out.printf("Het klasgemiddelde is %s%n", tweeCijfers.format(gemiddelde));
        }
        else
        {
            System.out.printf("Er werden geen punten ingegeven.%n");
        }
    }
}
