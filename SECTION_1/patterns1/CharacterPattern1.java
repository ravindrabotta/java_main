/*
A B C D
A B C D
A B C D
A B C D
 */


package patterns1;

import java.util.Scanner;

public class CharacterPattern1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int index = 1;
		
		while (index <= aNumber) {
			int j = 1;
			char ch = 'A';
			while(j <= aNumber) {
				System.out.print((char)(ch + j - 1) + " ");
				j++;
			}
			System.out.println();
			index++;
		}
	}
}
