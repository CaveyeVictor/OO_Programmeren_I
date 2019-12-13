package domein.domein;

public class KopOfMunt {

    private boolean worp;
    private boolean geraden;

    public KopOfMunt(){

    }

    public boolean isJuistGeraden(){
        return geraden;
    }

    public String geefInfoWorp(){
        return "";
    }

    private String zetOmNaarKopOfMunt(boolean worp){
        if (worp){
            return "Kop";
        } else {
            return "Munt";
        }
    }

    public boolean getWorp(){
        return worp;
    }

    public void setGeraden(boolean geraden) {
        this.geraden = geraden;
    }
}
