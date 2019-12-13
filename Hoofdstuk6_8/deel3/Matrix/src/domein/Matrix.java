package oefening8.domein.domein;

import java.util.ArrayList;

public class Matrix {
    private int rij, kolom;
    private int[][] matrix;

    public Matrix(int rij, int kolom){
        setRij(rij);
        setKolom(kolom);
        matrix = new int[rij][kolom];
    }

    public int geefWaardeOpRijKolom(int rij, int kolom){
        if (kolom < matrix[0].length && rij < matrix.length && kolom > -1 && rij > -1){
            return matrix[rij][kolom];
        } else {
            throw new IllegalArgumentException("foute matrix");
        }
    }

    public void telBij(int n){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                matrix[i][j] += n;
            }
        }
    }

    public ArrayList<Punt> geefZadelpunten(){
        ArrayList<Punt> list = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            int rijMin = matrix[i][0];
            int kolIndex = 0, rijIndex = 0;
             
            boolean zadelPunt = true;
             
            for (int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][j] < rijMin) {
                    rijMin = matrix[i][j];
                    rijIndex = i;
                    kolIndex = j;
                }
            }
             
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][kolIndex] > rijMin) {
                    zadelPunt = false;
                    break;
                }
            }

            //
            if(zadelPunt) {
                list.add(new Punt(rijIndex, kolIndex));
            }
        }
        return list;
    }

    @Override
    public String toString(){
        String str = "";
        for (int[] i:matrix) {
            for (int j: i){
                str += String.format("%5d", j);
            }
            str += String.format("%n");
        }
        return str;
    }

    public int getRij() {
        return rij;
    }

    private void setRij(int rij) {
        if (rij >= 1){
            this.rij = rij;
        } else {
            throw new IllegalArgumentException("Fout aantal rijen");
        }
    }

    public int getKolom() {
        return kolom;
    }

    private void setKolom(int kolom) {
        if (kolom >= 1){
            this.kolom = kolom;
        } else {
            throw new IllegalArgumentException("Fout aantal kolommen");
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        //veranderen in rij & kol
        if (matrix.length == this.matrix.length && matrix[0].length == this.matrix[0].length){
            rij = matrix[0].length;
            kolom = matrix.length;
            this.matrix = matrix;
        } else {
            throw new IllegalArgumentException("Foute set");
        }

    }
}
