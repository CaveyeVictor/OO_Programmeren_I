package domein;

import java.util.ArrayList;

public class Matrix {
    private int rij, kolom;
    private int[][] matrix;

    Matrix(int rij, int kolom){
        setRij(rij);
        setKolom(kolom);
    }

    public int geefWaardeOpRijKolom(int rij, int kolom){
        return matrix[kolom][rij];
    }

    public void telBij(int n){

    }

    public ArrayList<Punt> geefZadelPunten(){

    }

    @Override
    public String toString(){

    }

    public int getRij() {
        return rij;
    }

    private void setRij(int rij) {
        if (rij >= 1){
            this.rij = rij;
        }
    }

    public int getKolom() {
        return kolom;
    }

    private void setKolom(int kolom) {
        if (kolom >= 1){
            this.kolom = kolom;
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        if (matrix.length == this.matrix.length && matrix[0].length == this.matrix[0].length)
        this.matrix = matrix;
    }
}
