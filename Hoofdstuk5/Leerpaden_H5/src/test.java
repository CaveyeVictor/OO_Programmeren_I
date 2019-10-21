import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        char t = 'a';
        System.out.println(
                (!((Character.getNumericValue(t) >= 97 && Character.getNumericValue(t) <= 102) || (Character.getNumericValue(t) >= 65 && Character.getNumericValue(t) <= 70 )) ? true : false
                ));


    }
}
