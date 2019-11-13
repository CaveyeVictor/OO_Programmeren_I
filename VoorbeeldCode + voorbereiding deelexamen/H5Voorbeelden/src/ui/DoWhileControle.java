package ui;

// Dit voorbeeld staat niet in het boek
// Using the do/while repetition structure.
    
// Java packages
import java.util.Scanner;
    
public class DoWhileControle
{ 
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int getal;
   
        do
        {
           System.out.print("Geef een positief " +
                     "geheel getal,verschillend van nul in: ");
           getal = input.nextInt();
        }   
        while ( getal <= 0 ); // einde do/while structuur
       System.out.printf ("Het ingevoerde getal = %d%n", getal);

       input.close();
    } // einde methode main
} // einde klasse DoWhileControle
