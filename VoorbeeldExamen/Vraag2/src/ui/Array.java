package ui;

import java.security.SecureRandom;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        final int MAX = 5;
        int[][] array = new int[MAX][MAX];
        Scanner input = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < 5; i++){
            System.out.printf("Geef aantal kolommen voor rij %d: ",i+1);
            int aantalKol = input.nextInt();
            for (int j = 0; j < aantalKol; j++) {
                array[i][j] = secureRandom.nextInt(aantalKol)+1; //tussen 1 en de lengte van de rij: zo?
            }
        }

        Array arrayApp = new Array();
        arrayApp.drukAf(array);

        System.out.printf("Het op één na kleinste element in de array is %d%n", geefOpEenNaKleinsteElement(array));

        System.out.printf("De array is%s vierkant", isArrayVierkant(array) ? "" : " niet");
    }

    private void drukAf(int[][] a){
        System.out.printf("De elementen van de array:%n");
        for (int[] rij: a){
            for (int kol: rij){
                if (kol != 0){
                    System.out.printf("%5d", kol);
                } else {
                    System.out.printf("%5s", "");
                }
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");
    }

    public static int geefOpEenNaKleinsteElement(int[][] a){
        int kleinste = 5, opEenNaKleinste = 5;
        for (int[] rij: a){
            for (int kol: rij){
                if (kol > 0){
                    if (kol < kleinste){
                        kleinste = kol;
                    }
                    if (kol < opEenNaKleinste){
                        if (kol > kleinste){
                            opEenNaKleinste = kol;
                        }
                    }
                }
            }
        }
        return opEenNaKleinste;
    }

    public static boolean isArrayVierkant(int[][] a) {
        int huidige_rij = 0, rij1 = 0;
        for (int[] rij: a){
            for (int kol: rij){
                if (kol != 0){
                    huidige_rij++;
                } else {
                    if (rij1 == 0){
                        rij1 = huidige_rij;
                    } else if (huidige_rij != rij1){
                        return false;
                    }
                }
            }
            huidige_rij = 0;
        }
        return true;
    }

}
