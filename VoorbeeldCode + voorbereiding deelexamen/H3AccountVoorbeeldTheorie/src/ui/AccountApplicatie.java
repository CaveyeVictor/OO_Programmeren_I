package ui;

import oefening8.domein.domein.Account;
import java.util.Scanner;

public class AccountApplicatie
{
    // main methode begint met de uitvoering van Java applicatie
    public static void main(String[] args)
    {
        Account account1 = new Account("Jan Janssens",50.00);
        // creëer Account object
        Account account2 = new Account("Piet Peeters",-7.53);
        // creëer Account object

        // toon initiële balans van ieder object
        System.out.printf("account1 balans: $%.2f%n", account1.getBalans());
        System.out.printf("account2 balans: $%.2f%n%n",
                account2.getBalans());

        // creëer Scanner om input vanaf commandvenster te verkrijgen
        Scanner input = new Scanner(System.in);
        double depositBedrag; // deposit bedrag ingegeven door gebruiker

        System.out.print("Geef deposit bedrag voor account1: "); // prompt
        depositBedrag = input.nextDouble(); // verkrijg user input
        System.out.printf("%nWe storten %.2f op balans van account1%n%n",
                depositBedrag);
        account1.stort(depositBedrag); // voeg toe aan account1 balans

        // toon balansen
        System.out.printf("account1 balans: $%.2f%n",
                account1.getBalans());
        System.out.printf("account2 balans: $%.2f%n%n",
                account2.getBalans());

        System.out.print("Geef deposit bedrag voor account2: "); // prompt
        depositBedrag = input.nextDouble(); // verkrijg user input
        System.out.printf("%nWe storten %.2f op balans van account2%n%n",
                depositBedrag);
        account2.stort(depositBedrag); // voeg toe aan account2 balans

        // toon balansen
        System.out.printf("account1 balans: $%.2f%n",
                account1.getBalans());
        System.out.printf("account2 balans: $%.2f%n%n",
                account2.getBalans());
    } // einde main
} // einde klasse
