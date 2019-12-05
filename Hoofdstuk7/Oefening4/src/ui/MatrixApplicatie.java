package ui;

import java.util.Scanner;

import domein.Matrix;

public class MatrixApplicatie {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Geef het aantal rijen van de matrix: ");
		int rijen = inputScanner.nextInt();
		System.out.print("Geef het aantal kolommen van de matrix: ");
		int kolommen = inputScanner.nextInt();
		
		Matrix m = new Matrix(rijen, kolommen);
		
		int[][] inputMatrix = new int[m.getGetallen().length][m.getGetallen()[0].length];

		//geen foreach omdat je waarden aanpast
		for (int i = 0; i < inputMatrix.length; i++) {
			for (int j = 0; j < inputMatrix[0].length; j++) {
				System.out.printf("Geef element op rij %d en"
						+ " kolom %d: ", i+1, j+1);
				int element = inputScanner.nextInt();
				inputMatrix[i][j] = element;
			}
		}
		m.setGetallen(inputMatrix);
		int[][] resultaat = m.transponeer();
		String resultaatString = "";
		
		System.out.println("De getransponeerde matrix: ");
		for (int[] res0: resultaat){
			for (int res1: res0){
				resultaatString += String.format("%5d", res1);
			}
			resultaatString += String.format("%n");
		}
		System.out.println(resultaatString);
	}

}
