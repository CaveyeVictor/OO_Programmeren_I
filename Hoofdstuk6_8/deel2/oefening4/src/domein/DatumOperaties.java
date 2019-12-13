package domein;

public class DatumOperaties {
    private static String[] MAANDEN = new String[]{
            "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus", "september", "oktober", "november", "december"
    };

    private static int[] AANTALDAGEN = new int[]{
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static String berekenDatumMetDagNummer(int dag){
        String datumString = "";
        int maand = 0;
        while (dag - AANTALDAGEN[maand] > 0) {
            dag -= AANTALDAGEN[maand];
            maand++;
        }
        return String.format("%d %s", dag, MAANDEN[maand]);
    }
}