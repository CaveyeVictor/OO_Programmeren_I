package ui;

import domein.Matrix;
import domein.Punt;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class MatrixApplicatie {

	private static ArrayList<Punt> list = new ArrayList<>();

	public static void main(String[] args) {
		Matrix matrix = new Matrix(3, 3);
		SecureRandom secureRandom = new SecureRandom();

		int[][] a = {
				{1, 2, 6},
				{7, 13, 16},
				{4, 8, 7}
		};

		matrix.setMatrix(a);

		System.out.printf("oorspronkelijke matrix%n");
		System.out.println(matrix.toString());

		int optellen = secureRandom.nextInt(10)+1;
		System.out.printf("%d erbij opgeteld%n", optellen);
		matrix.telBij(optellen);
		System.out.println(matrix.toString());

		//todo: werkt nog niet
		System.out.printf("De zadelpunt(en): %n");
		zoekZadelpunten(matrix);
		for (Punt p: list) {
			System.out.printf("%d op positie %s%n", matrix.getMatrix()[p.getX()][p.getY()], p.toString());
		}
	}

	private static void zoekZadelpunten(Matrix matrix){
		List<Punt> lijst = matrix.geefZadelpunten();
		for (Punt p: lijst) {
			System.out.printf("%d op positie %s%n", matrix.geefWaardeOpRijKolom(p.getX() - 1, p.getY() - 1), p.toString());
		}
	}

}
