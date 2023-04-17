/*
      1
     121
    12321
   1234321
*/

package patterns2;

import java.util.Scanner;

public class IsoscelesTriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int noOfRows = 1;
		
		while(noOfRows <= aNumber) {
			
			int spaces = 1;
			while(spaces <= aNumber - noOfRows) {
				System.out.print(" ");
				spaces = spaces + 1;			
			}
			
			int num = 1;
			while(num <= noOfRows) {
				System.out.print(num);
				num = num + 1;
			}
			
			int decr = noOfRows - 1;
			while(decr >= 1) {
				System.out.print(decr);
				decr = decr -1;
			}
			
			System.out.println();
			noOfRows = noOfRows + 1;
		}
	}
}