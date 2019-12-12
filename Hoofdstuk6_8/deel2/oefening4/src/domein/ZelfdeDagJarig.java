package domein;

public class ZelfdeDagJarig {
    private int persoon1, persoon2, dagnr;

    ZelfdeDagJarig(int persoon1, int persoon2, int dagnr){
        setPersoon1(persoon1);
        setPersoon2(persoon2);
        setDagnr(dagnr);
    }


    public int getPersoon1() {
        return persoon1;
    }

    private void setPersoon1(int persoon1) {
        this.persoon1 = persoon1;
    }

    public int getPersoon2() {
        return persoon2;
    }

    private void setPersoon2(int persoon2) {
        this.persoon2 = persoon2;
    }

    public int getDagnr() {
        return dagnr;
    }

    private void setDagnr(int dagnr) {
        if (dagnr > 0 && dagnr < 366) {
            this.dagnr = dagnr;
        } else {
            throw new IllegalArgumentException("Fout dagnummer");
        }
    }
}
