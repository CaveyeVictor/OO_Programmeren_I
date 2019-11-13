package ui;

// Dit voorbeeld staat niet in het boek

import java.util.Scanner;

public class SwitchVoorbeeld1
{
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
	    int percentage;
		int aantalStud = 10;
		int grcount = 0,gcount = 0,ocount = 0,vcount = 0,ucount = 0;
	
		for (int teller=1;teller<=aantalStud;teller++)
		{
	            do
	            {
	               System.out.printf ("Geef het percentage in van student %d: ", teller);
	               	percentage=input.nextInt();
	            }
	            while (percentage<0 || percentage>100);
	
	            switch (percentage/10)
	            {
					case 10 : case 9 : 
							++grcount; break;
					case 8	:   
							++gcount; break;
					case 7	:   
							++ocount; break;
					case 6  : case 5  : 
							++vcount; break;
					default : 	
			                 ++ucount; break;
	            }
	          }
	
		System.out.printf("%n%nAantal studenten met:%nGrootste onderscheiding: %d"
				+ "%nGrote onderscheiding: %d%nOnderscheiding: %d%n"
	                        + "Voldoening: %d%nUitgesteld: %d%n",
	                           grcount, gcount, ocount, vcount, ucount);
		
		input.close();
	 }
}
