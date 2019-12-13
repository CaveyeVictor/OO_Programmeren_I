package oefening8.domein.domein;

public class Punt {

    private int x, y;

    public Punt(int x, int y){
        setX(x);
        setY(y);
    }



    public boolean vergelijkMetPunt(Punt punt){
        return x==punt.getX() && y==punt.getY();
    }

    public double berekenAfstandTotPunt(Punt punt){

        return Math.sqrt(Math.pow(punt.getX()-x, 2) + Math.pow(punt.getY()-y, 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        controleerCoor(x);
        this.x = x;

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        controleerCoor(y);
        this.y = y;
    }

    private void controleerCoor(int a){
        if (a < 0) {
            throw new IllegalArgumentException("Fout Coördinaat");
        }
    }

    @Override
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }


}
