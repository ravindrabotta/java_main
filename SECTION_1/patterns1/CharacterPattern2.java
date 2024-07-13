/*
A B C D
B C D E
C D E F
F G H I
 */

package patterns1;

import java.util.Scanner;

public class CharacterPattern2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int aNumber =  scan.nextInt();
		scan.close();
		
		int index = 1;
		while(index <= aNumber) {
			int j = 0;
			char ch = (char)('A' + index - 1);
			while(j <= aNumber) {
				System.out.print(ch + " ");
				ch = (char)(ch + j);
				j++;
			}
			System.out.println();
			index++;
		}
	}
}
