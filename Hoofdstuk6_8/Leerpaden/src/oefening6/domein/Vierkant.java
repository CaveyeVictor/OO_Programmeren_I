package oefening6.domein;


public class Vierkant {
    public static String maakVierkant(int z){
        return maakVierkant(z, 'c');
    }

    public static String maakVierkant(int z, char ch){
        String str = "";
        for (int i = 0; i < z; i++){
            for (int j = 0; j < z; j++){
                str += 'c';
            }
            if (i < z -1) {
                str += String.format("%n");
            }
        }
        return str;
    }

}
