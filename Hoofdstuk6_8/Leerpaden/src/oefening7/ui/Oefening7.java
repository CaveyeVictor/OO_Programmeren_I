package oefening7.ui;

import oefening7.domein.Rekening;

import java.util.Scanner;

public class Oefening7 {

    public static void main(String[] args) {
        Rekening[] rekeningen = new Rekening[3];
        rekeningen[0] = new Rekening(123123456712L, "Sam");
        rekeningen[1] = new Rekening(123456789012L, "Arno");
        rekeningen[2] = new Rekening(101010101010L, "Stef");

        // toon informatie van de rekeningen
        Oefening7 app = new Oefening7();                                            //
        Scanner input = new Scanner(System.in);

        boolean storten = true;
        do {
            app.stortOpRekeningen(rekeningen);                                      //
            System.out.print("Wil je nog storten op een rekening (ja=1): ");
            storten = input.nextInt() == 1;
        } while (storten);

        System.out.println("Beginsituatie");
        app.toonRekeningen(rekeningen);                                             //
        rekeningen[0].haalAf(299);
        rekeningen[1].stortOp(50);
        rekeningen[2].schrijfBedragOverNaar(20, rekeningen[0]);
        System.out.println("Eindsituatie");
        app.toonRekeningen(rekeningen);                                             //
    }

    private void toonRekeningen(Rekening[] rekeningen) {
    }

    private void stortOpRekeningen(Rekening[] rekeningen) {
    }

    // stortOpRekeningen

    // toonRekeningen

    // toon1Rekening
}
