/**
 * 			*
 * 		   **
 *        ***
 *       ****
 */

package patterns2;

import java.util.Scanner;

public class MirrorImageOfTriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		int index = 1;
		
		while(index <= aNumber) {
			
			int spaces = 1;
			while(spaces <= (aNumber - index)) {
				System.out.print(" ");
				spaces = spaces + 1;
			}
			
			int stars = 1;
			while(stars <= index) {
				System.out.print("*");
				stars = stars + 1;
			}
			
			System.out.println();
			index++;
			
		}
	}
}
