
public class Kassa {

    public Kassa() {
    }

    public static void main(String[] args) {
        int teBetalen = 45;
        int ontvangenBedrag = 100;
        int terug = ontvangenBedrag - teBetalen;
        System.out.println("te betalen = " + teBetalen);
        System.out.println("ontvangen bedrag = " + ontvangenBedrag);
        System.out.println("terug = " + terug);
    }

}
