package domein;

import java.util.ArrayList;
import java.util.List;

import domein.Punt;

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

    public List<Punt> geefZadelpunten()
    {
        List<Punt> punten = new ArrayList<>();
        int kl, gr, vl;
        for (int i = 0; i < rij; i++)
        {
            kl = matrix[i][0];
            vl = 0;

            for (int j = 1; j < kolom; j++)
            {
                if (matrix[i][j] < kl)
                {
                    kl = matrix[i][j];
                    vl = j;
                }
            }

            gr = matrix[i][vl];
            for (int j = 0; j < rij; j++)
            {
                if (matrix[j][vl] > gr)
                {
                    gr = matrix[j][vl];
                }
            }

            if (gr == kl)
            {
                punten.add(new Punt(i + 1, vl + 1));
            }
        }
        return punten;
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
