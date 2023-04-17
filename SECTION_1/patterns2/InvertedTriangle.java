/**
 *       *****
 *       ****
 *       ***
 *       **
 *       *
 */

package patterns2;

import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int noOfRows = 1;
		
		while(noOfRows <= aNumber) {
			int noOfCols = 1;
			while(noOfCols <= aNumber - noOfRows + 1) {
				System.out.print("*");
				noOfCols = noOfCols + 1;
			}
			System.out.println();
			noOfRows = noOfRows + 1;
		}
	}
}