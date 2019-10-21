import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int total;

        total = 0;
        int bedrag = stdin.nextInt();
        for (int i = 0; i < 6; i++){
            int uren = stdin.nextInt();
            total += (bedrag * uren);
        }
        System.out.println(total);
    }
}
