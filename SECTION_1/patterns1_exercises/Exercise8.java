/*
A
BB
CCC
DDDD
 */
package patterns1_exercises;

import java.util.Scanner;

public class Exercise8 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int index = 1;
		
		while(index <= aNumber) {
			int j = 1;
			char ch = (char)('A' + index -1);
			while (j <= index) {
				System.out.print(ch + " ");
				j++;
			}
			System.out.println();
			index++;
		}
	}

}
