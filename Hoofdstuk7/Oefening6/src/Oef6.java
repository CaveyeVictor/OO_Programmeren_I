import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oef6 {

	public static void main(String[] args) {
		double getal;
		List<Double> deLijst;
		deLijst = new ArrayList<>();
		Scanner input = new Scanner(System.in);

		System.out.print("Geef getal of stop met -1");
		getal = input.nextDouble();
		while (getal != 0){
			deLijst.add(getal);

			System.out.print("Geef getal of stop met -1");
			getal = input.nextDouble();
		}

		if (deLijst.isEmpty()) { //size() == 0
            System.out.println("Lijst leeg");
        }else {
			for(double g : deLijst){ //List<Double> deLijst;
				System.out.printf("*8.1%f", g);
			}
		}

	}

}
