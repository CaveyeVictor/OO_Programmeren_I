package ui;

// Dit voorbeeld staat niet in het boek

import java.util.Scanner;

public class SwitchVoorbeeld3 
{
    public static void main(String[] args)
    {   
        Scanner invoer = new Scanner(System.in);
        String maand ;
	
        System.out.print("Geef de naam van een maand: "); 
        maand = invoer.next();
        
        int maandNummer;
        // we vormen de naam om naar allemaal kleine letters!
        switch(maand.toLowerCase())
        {
            case "januari": maandNummer = 1; break;
            case "februari": maandNummer = 2; break;
            case "maart": maandNummer = 3; break;
            case "april": maandNummer = 4; break;
            case "mei": maandNummer = 5; break;
            case "juni": maandNummer = 6; break;
            case "juli": maandNummer = 7; break;
            case "augustus": maandNummer = 8; break; 
            case "september": maandNummer = 9; break;
            case "oktober": maandNummer = 10; break;
            case "november": maandNummer = 11; break;
            case "december": maandNummer = 12; break;                
            default: maandNummer = 0; break;       
        }

        //afdruk berzorgen
        if (maandNummer != 0)
        {
           System.out.printf("Dit is de %d%s maand van het jaar%n", maandNummer,  
                    maandNummer==1 || maandNummer == 8? "-ste" : "-de");
        }
        else
            System.out.printf("De naam van de maand werd niet herkend.%n");
        
        invoer.close();
    }
}
